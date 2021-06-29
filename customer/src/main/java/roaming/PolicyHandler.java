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
    public void wheneverReserved_Changestatus(@Payload Reserved reserved){

        if(!reserved.validate()) return;
        // Get Methods


        // Sample Logic //
        System.out.println("\n\n##### listener Changestatus : " + reserved.toJson() + "\n\n");
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverReservecanceled_Changestatus(@Payload Reservecanceled reservecanceled){

        if(!reservecanceled.validate()) return;
        // Get Methods


        // Sample Logic //
        System.out.println("\n\n##### listener Changestatus : " + reservecanceled.toJson() + "\n\n");
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverReservereturned_Changestatus(@Payload Reservereturned reservereturned){

        if(!reservereturned.validate()) return;
        // Get Methods


        // Sample Logic //
        System.out.println("\n\n##### listener Changestatus : " + reservereturned.toJson() + "\n\n");
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPaycanceled_Changestatus(@Payload Paycanceled paycanceled){

        if(!paycanceled.validate()) return;
        // Get Methods


        // Sample Logic //
        System.out.println("\n\n##### listener Changestatus : " + paycanceled.toJson() + "\n\n");
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverRentalaccepted_Changestatus(@Payload Rentalaccepted rentalaccepted){

        if(!rentalaccepted.validate()) return;
        // Get Methods


        // Sample Logic //
        System.out.println("\n\n##### listener Changestatus : " + rentalaccepted.toJson() + "\n\n");
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverRentalcanceled_Changestatus(@Payload Rentalcanceled rentalcanceled){

        if(!rentalcanceled.validate()) return;
        // Get Methods


        // Sample Logic //
        System.out.println("\n\n##### listener Changestatus : " + rentalcanceled.toJson() + "\n\n");
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverReturnaccepted_Changestatus(@Payload Returnaccepted returnaccepted){

        if(!returnaccepted.validate()) return;
        // Get Methods


        // Sample Logic //
        System.out.println("\n\n##### listener Changestatus : " + returnaccepted.toJson() + "\n\n");
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}
