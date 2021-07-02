package roaming;

import roaming.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class MypageViewHandler {


    @Autowired
    private MypageRepository MypageRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenReserved_then_CREATE_1 (@Payload Reserved Reserved) {
        try {

            if (!Reserved.validate()) return;

            // view 객체 생성
            Mypage Mypage = new Mypage();
            // view 객체에 이벤트의 Value 를 set 함
//            Mypage.setreservceId(Reserved.getId());
            Mypage.setphoneId(Reserved.getphoneId());
            Mypage.setamount(Reserved.getamount());
            Mypage.setreserveDate(Reserved.getreserveDate());
            Mypage.setcountry(Reserved.getcountry());
            Mypage.setstatus("Reseve");
            Mypage.setuserPhone(Reserved.getuserPhone());
            Mypage.setpayType(Reserved.getpayType());
            Mypage.setpayCompany(Reserved.getpayCompany());
            Mypage.setpayNumber(Reserved.getpayNumber());
            // view 레파지 토리에 save
//            MypageRepository.save(Mypage);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whenReservecanceled_then_UPDATE_1(@Payload Reservecanceled Reservecanceled) {
        try {
            if (!Reservecanceled.validate()) return;
                // view 객체 조회

//                    List<Mypage> MypageList = MypageRepository.findByreservceId(Reservecanceled.getId());
//                    for(Mypage Mypage : MypageList){
//                    // view 객체에 이벤트의 eventDirectValue 를 set 함
//                    Mypage.setcancelDate(Reservecanceled.getcancelDate());
//                    Mypage.setstatus("CANCEL");
                // view 레파지 토리에 save
//                MypageRepository.save(Mypage);
//                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenReservereturned_then_UPDATE_2(@Payload Reservereturned Reservereturned) {
        try {
            if (!Reservereturned.validate()) return;
                // view 객체 조회

//                    List<Mypage> MypageList = MypageRepository.findByreservceId(Reservereturned.getId());
//                    for(Mypage Mypage : MypageList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
//                    Mypage.setreturnDate(Reservereturned.getreturnDate());
//                    Mypage.setstatus("RETURN");
                // view 레파지 토리에 save
//                MypageRepository.save(Mypage);
//                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
//    @StreamListener(KafkaProcessor.INPUT)
//    public void whenPaycanceled_then_UPDATE_3(@Payload Paycanceled paycanceled) {
//        try {
//            if (!paycanceled.validate()) return;
                // view 객체 조회

//                    List<Mypage> MypageList = MypageRepository.findByreservceId(paycanceled.getReserveId());
//                    for(Mypage Mypage : MypageList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
//                    Mypage.setPayCancelDate(paycanceled.getPayCancelDate());
//                    Mypage.setstatus("PAY CANCEL");
                // view 레파지 토리에 save
//                MypageRepository.save(Mypage);
//                }

//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenRentalaccepted_then_UPDATE_4(@Payload Rentalaccepted Rentalaccepted) {
        try {
            if (!Rentalaccepted.validate()) return;
                // view 객체 조회

                    List<Mypage> MypageList = MypageRepository.findByreservceId(Rentalaccepted.getreserveId());
                    for(Mypage Mypage : MypageList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    Mypage.setrentAcceptDate(Rentalaccepted.getrentAcceptDate());
                    Mypage.setstatus("RENT ACCEPT");
                // view 레파지 토리에 save
                MypageRepository.save(Mypage);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenRentalcanceled_then_UPDATE_5(@Payload Rentalcanceled Rentalcanceled) {
        try {
            if (!Rentalcanceled.validate()) return;
                // view 객체 조회

//                    List<Mypage> MypageList = MypageRepository.findByreservceId(Rentalcanceled.getreservceid());
//                    for(Mypage Mypage : MypageList){
//                    // view 객체에 이벤트의 eventDirectValue 를 set 함
//                    Mypage.setrentCancelDate(Rentalcanceled.getrentCancelDate());
//                    Mypage.setstatus("RENTAL CANCEL");
                // view 레파지 토리에 save
//                MypageRepository.save(Mypage);
//                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenReturnaccepted_then_UPDATE_6(@Payload Returnaccepted returnaccepted) {
        try {
            if (!returnaccepted.validate()) return;
                // view 객체 조회

                    List<Mypage> MypageList = MypageRepository.findByreservceId(returnaccepted.getReservceid());
                    for(Mypage Mypage : MypageList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
//                    Mypage.setretAcceptDate(returnaccepted.getretAcceptDate());
                    Mypage.setstatus("RETURN ACCEPT");
                // view 레파지 토리에 save
                MypageRepository.save(Mypage);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

