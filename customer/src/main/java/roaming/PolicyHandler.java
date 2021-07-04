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
    @Autowired StatechangedRepository statechangedRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverReserved_Changestatus(@Payload Reserved Reserved){

        if(!Reserved.validate()) return;
        // Get Methods


        // Sample Logic //
        System.out.println("\n\n##### listener Changestatus : " + Reserved.toJson() + "\n\n");

//        String reserveId = payCanceled.getreserveId();
//      Customer customer = customerRepository.findByReserveId(reserveId);
//        if (customer != null) {
//            customer.setStatus("PayCanceled");
//            customer.setpayCancelDate(payCanceled.getpayCancelDate());            
//            customerRepository.save(customer); 

//            System.out.println("##### pay status changed by 'payCanceled' #####");
//            System.out.println("reserveId : " + reserveId); 
//        }          
//        else{
//            System.out.println("not found reserveId : " + reserveId);    
//        } 
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverReservecanceled_Changestatus(@Payload Reservecanceled Reservecanceled){

        if(!Reservecanceled.validate()) return;
        System.out.println("\n\n##### listener ChangeStatus : " + Reservecanceled.toJson() + "\n\n");

        String reserveId = Reservecanceled.getId().toString();
//        Customer customer = customerRepository.findByReserveId(reserveId);
//        if (customer != null) {
//            customer.setStatus("ReserveReturned");
//            customer.setReturnDate(reserveReturned.getreturnDate());            
//            customerRepository.save(customer); 

//            System.out.println("##### reserve status changed by 'reserveReturned' #####");
//            System.out.println("reserveId : " + reserveId); 
//        }          
//        else{
//            System.out.println("not found reserveId : " + reserveId);    
//        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverReserved_ChangeStatus(@Payload Reserved Reserved){

        if(!Reserved.validate()) return;

        System.out.println("\n\n##### listener ChangeStatus : " + Reserved.toJson() + "\n\n");

        String reserveId = Long.toString(Reserved.getId());
//        String phoneId = Reserved.getphoneId();
//        String rentalAddr = reserved.getRentalAddr();
//        String retrieveAddr = reserved.getRetrieveAddr();
        String userPhone = Reserved.getuserPhone();
        String amount = Reserved.getamount();
        String reserveDate = Reserved.getreserveDate();

//        Customer customer = new Customer();
//        customer.setreserveId(reserveId);
//        customer.setphoneId(phoneId);
//        customer.setrentalAddr(rentalAddr);
//        customer.setretrieveAddr(retrieveAddr);
//        customer.setuserPhone(userPhone);
//        customer.setamount(amount);
//        customer.setreserveDate(reserveDate);
//        customer.setStatus("Reserved");
//        customerRepository.save(customer);         

        System.out.println("##### customer saved by 'reserved' #####");
        System.out.println("reserveId : " + reserveId); 
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverReservecanceled_ChangeStatus(@Payload Reservecanceled Reservecanceled){

        if(!Reservecanceled.validate()) return;

        System.out.println("\n\n##### listener ChangeStatus : " + Reservecanceled.toJson() + "\n\n");

//        String reserveId = Reservecanceled.getId().toString();
//        Customer customer = customerRepository.findByReserveId(reserveId);
//        if (customer != null) {
//            customer.setStatus("ReserveCanceled");
//            customer.setCancelDate(ReserveCanceled.getCancelDate());            
//            customerRepository.save(customer); 

//            System.out.println("##### reserve status changed by 'reserveCanceled' #####");
//            System.out.println("reserveId : " + reserveId); 
//        }          
//        else{
//            System.out.println("not found reserveId : " + reserveId);    
//        } 
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverRentalcanceled_ChangeStatus(@Payload Rentalcanceled Rentalcanceled){

        if(!Rentalcanceled.validate()) return;

        System.out.println("\n\n##### listener ChangeStatus : " + Rentalcanceled.toJson() + "\n\n");

//        String reserveId = Rentalcanceled.getreserveId();
//        Customer customer = customerRepository.findByReserveId(reserveId);
//        if (customer != null) {
//            customer.setStatus("RentalCanceled");
//            customer.setRentCancelDate(RentalCanceled.getRentCancelDate());            
//            customerRepository.save(customer); 
//
//            System.out.println("##### rental status changed by 'RentalCanceled' #####");
//            System.out.println("reserveId : " + reserveId); 
//        }          
//        else{
//            System.out.println("not found reserveId : " + reserveId);    
//        } 
            
    }
//    @StreamListener(KafkaProcessor.INPUT)
//    public void wheneverRentalRetrieved_ChangeStatus(@Payload RentalRetrieved RentalRetrieved){

//        if(!RentalRetrieved.validate()) return;

//        System.out.println("\n\n##### listener ChangeStatus : " + RentalRetrieved.toJson() + "\n\n");

//        String reserveId = RentalRetrieved.getreserveId();
//        Customer customer = customerRepository.findByReserveId(reserveId);
//        if (customer != null) {
//            customer.setStatus("RentalRetrieved");
//            customer.setRentRetrieveDate(RentalRetrieved.getRentRetrieveDate());            
//            customerRepository.save(customer); 

//            System.out.println("##### rental status changed by 'RentalRetrieved' #####");
//            System.out.println("reserveId : " + reserveId); 
//        }          
//        else{
//            System.out.println("not found reserveId : " + reserveId);    
//        } 
            
//    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverRentalaccepted_ChangeStatus(@Payload Rentalaccepted Rentalaccepted){

        if(!Rentalaccepted.validate()) return;

        System.out.println("\n\n##### listener ChangeStatus : " + Rentalaccepted.toJson() + "\n\n");

        String reserveId = Rentalaccepted.getreserveId();
//        Customer customer = customerRepository.findByReserveId(reserveId);
//        if (customer != null) {
//            customer.setStatus("RentalAccepted");
//            customer.setRentAcceptDate(rentalAccepted.getRentAcceptDate());            
//            customerRepository.save(customer); 
//
//            System.out.println("##### rental status changed by rental 'rentalAccepted' #####");
//            System.out.println("reserveId : " + reserveId); 
//        }          
//        else{
//            System.out.println("not found reserveId : " + reserveId);    
//        }
            
    }
//    @StreamListener(KafkaProcessor.INPUT)
//    public void wheneverRentaled_ChangeStatus(@Payload Rentaled rentaled){

//        if(!rentaled.validate()) return;

//        System.out.println("\n\n##### listener ChangeStatus : " + rentaled.toJson() + "\n\n");

//        String reserveId = rentaled.getreserveId();
//        Customer customer = customerRepository.findByreserveId(reserveId);
//        if (customer != null) {
//            customer.setStatus("Rentaled");            
//            customer.setrentalDate(rentaled.getrentalDate());            
//            customerRepository.save(customer); 

//            System.out.println("##### rental status changed by 'rentaled'' #####");
//            System.out.println("reserveId : " + reserveId); 
//        }          
//        else{
//            System.out.println("not found reserveId : " + reserveId);    
//        } 
            
//    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverReturnaccepted_ChangeStatus(@Payload Returnaccepted Returnaccepted){

        if(!Returnaccepted.validate()) return;

        System.out.println("\n\n##### listener ChangeStatus : " + Returnaccepted.toJson() + "\n\n");

//        String reserveId = Returnaccepted.getreserveId();
//        Customer customer = customerRepository.findByReserveId(reserveId);
//        if (customer != null) {
//            customer.setStatus("ReturnAccepted");             
//            customer.setRetAcceptDate(ReturnAccepted.getRetAcceptDate());            
//            customerRepository.save(customer); 

//            System.out.println("##### rental status changed by 'ReturnAccepted' #####");
//            System.out.println("reserveId : " + reserveId); 
//        }          
//        else{
//            System.out.println("not found reserveId : " + reserveId);    
//        } 
            
    }



    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}
