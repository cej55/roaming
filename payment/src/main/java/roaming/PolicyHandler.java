package roaming;

import java.time.LocalDate;

import roaming.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @Autowired PaymentRepository PaymentRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverReservecanceled_CancelPay(@Payload Reservecanceled Reservecanceled){

        if(!Reservecanceled.validate()) return;

        //System.out.println("\n\n##### listener CancelPay : " + Reservecanceled.toJson() + "\n\n");

        String reserveId = Reservecanceled.getId().toString();
        Payment Payment = PaymentRepository.findByreserveId(reserveId);
        if (Payment != null) {
            Payment.setpayStatus("PayCanled");
            LocalDate localDate = LocalDate.now();                
            Payment.setpayCancelDate(localDate.toString());              
            PaymentRepository.save(Payment); 

            System.out.println("##### Payment caused by reservation cancel #####");
            System.out.println("reserveId : " + reserveId);    
        }            
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}
