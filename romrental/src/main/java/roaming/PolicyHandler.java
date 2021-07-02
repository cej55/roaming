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
    @Autowired RomrentalRepository RomrentalRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverReserved_AcceptRental(@Payload Reserved Reserved){

        if(!Reserved.validate()) return;

        System.out.println("\n\n##### listener AcceptRental : " + Reserved.toJson() + "\n\n");

        String reserveId = Long.toString(Reserved.getId());
        String phoneId = Reserved.getphoneId();
//        String rentalAddr = reserved.getRentalAddr();
//        String retrieveAddr = reserved.getRetrieveAddr();
        String userPhone = Reserved.getuserPhone();
        String amount = Reserved.getamount();
        String payType = Reserved.getpayType();
        String payNumber = Reserved.getpayNumber();
        String payCompany = Reserved.getpayCompany();
        String reserveDate = Reserved.getreserveDate();

        Romrental Romrental = new Romrental();
        Romrental.setreserveId(reserveId);
        Romrental.setphoneId(phoneId);
//        Romrental.setrentalAddr(rentalAddr);
//        Romrental.setRetrieveAddr(retrieveAddr);
//        Romrental.setuserPhone(userPhone);
        Romrental.setamount(amount);
//        Romrental.setpayType(payType);
//        Romrental.setpayNumber(payNumber);
//        Romrental.setpayCompany(payCompany);
//        Romrental.setreservedDate(reserveDate);
        LocalDate localDate = LocalDate.now();                
        Romrental.setrentAcceptDate(localDate.toString());
//        Romrental.setrentalStatus("RentalAccepted");
        RomrentalRepository.save(Romrental);           

        System.out.println("##### rental accepted by reservation reserve #####");
        System.out.println("reserveId : " + reserveId);             
    }
    
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverReserveCanceled_CancelRental(@Payload Reservecanceled Reservecanceled){

        if(!Reservecanceled.validate()) return;

        System.out.println("\n\n##### listener CancelRental : " + Reservecanceled.toJson() + "\n\n");


        String reserveId = Reservecanceled.getId().toString();
        Romrental Romrental = RomrentalRepository.findByreserveId(reserveId);
        if (Romrental != null) {
//            Romrental.setrentalStatus("RentalCanceled");
            LocalDate localDate = LocalDate.now();                
            Romrental.setrentCancelDate(localDate.toString());            
            RomrentalRepository.save(Romrental); 

            System.out.println("##### lental canceld by reservation cancel #####");
            System.out.println("reserveId : " + reserveId);    
        }
        else{
            System.out.println("not found reserveId : " + reserveId);    
        }                   
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverReservereturned_AcceptReturn(@Payload Reservereturned Reservereturned){

        if(!Reservereturned.validate()) return;

        System.out.println("\n\n##### listener AcceptReturn : " + Reservereturned.toJson() + "\n\n");

        String reserveId = Reservereturned.getId().toString();
        Romrental Romrental = RomrentalRepository.findByreserveId(reserveId);
        if (Romrental != null) {
//            Romrental.setrentalStatus("ReturnAccepted");
            LocalDate localDate = LocalDate.now();                
            Romrental.setretAcceptDate(localDate.toString());            
            RomrentalRepository.save(Romrental); 

            System.out.println("##### return accepted by reservation return #####");
            System.out.println("reserveId : " + reserveId);    
        }             
        else{
            System.out.println("not found reserveId : " + reserveId);    
        }                   
   }


    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}
