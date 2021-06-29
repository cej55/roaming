package roaming;

import roaming.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @Autowired RomrentalRepository romrentalRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverReserved_Acceptrental(@Payload Reserved reserved){

        if(!reserved.validate()) return;
        // Get Methods


        // Sample Logic //
        System.out.println("\n\n##### listener Acceptrental : " + reserved.toJson() + "\n\n");
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverReservecanceled_Cancelrental(@Payload Reservecanceled reservecanceled){

        if(!reservecanceled.validate()) return;
        // Get Methods


        // Sample Logic //
        System.out.println("\n\n##### listener Cancelrental : " + reservecanceled.toJson() + "\n\n");
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverReservereturned_Acceptreturn(@Payload Reservereturned reservereturned){

        if(!reservereturned.validate()) return;
        // Get Methods


        // Sample Logic //
        System.out.println("\n\n##### listener Acceptreturn : " + reservereturned.toJson() + "\n\n");
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}
