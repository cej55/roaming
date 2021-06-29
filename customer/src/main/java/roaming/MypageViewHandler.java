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
    private MypageRepository mypageRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenReserved_then_CREATE_1 (@Payload Reserved reserved) {
        try {

            if (!reserved.validate()) return;

            // view 객체 생성
            Mypage mypage = new Mypage();
            // view 객체에 이벤트의 Value 를 set 함
            mypage.setReservceId(reserved.getId());
            mypage.setPhoneId(reserved.getPhoneid());
            mypage.setAmount(reserved.getAmount());
            mypage.setReserveDate(reserved.getReservedate());
            mypage.setCountry(reserved.getCountry());
            mypage.setStatus("Reseve");
            mypage.setUserPhone(reserved.getUserphone());
            mypage.setPayType(reserved.getPaytype());
            mypage.setPayCompany(reserved.getPaycompany());
            mypage.setPayNumber(reserved.getPaynumber());
            // view 레파지 토리에 save
            mypageRepository.save(mypage);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whenReservecanceled_then_UPDATE_1(@Payload Reservecanceled reservecanceled) {
        try {
            if (!reservecanceled.validate()) return;
                // view 객체 조회

                    List<Mypage> mypageList = mypageRepository.findByReservceId(reservecanceled.getId());
                    for(Mypage mypage : mypageList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    mypage.setCancelDate(reservecanceled.getCanceldate());
                    mypage.setStatus("CANCEL");
                // view 레파지 토리에 save
                mypageRepository.save(mypage);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenReservereturned_then_UPDATE_2(@Payload Reservereturned reservereturned) {
        try {
            if (!reservereturned.validate()) return;
                // view 객체 조회

                    List<Mypage> mypageList = mypageRepository.findByReservceId(reservereturned.getId());
                    for(Mypage mypage : mypageList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    mypage.setReturnDate(reservereturned.getReturndate());
                    mypage.setStatus("RETURN");
                // view 레파지 토리에 save
                mypageRepository.save(mypage);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPaycanceled_then_UPDATE_3(@Payload Paycanceled paycanceled) {
        try {
            if (!paycanceled.validate()) return;
                // view 객체 조회

                    List<Mypage> mypageList = mypageRepository.findByReservceId(paycanceled.getReserveId());
                    for(Mypage mypage : mypageList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    mypage.setPayCancelDate(paycanceled.getPayCancelDate());
                    mypage.setStatus("PAY CANCEL");
                // view 레파지 토리에 save
                mypageRepository.save(mypage);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenRentalaccepted_then_UPDATE_4(@Payload Rentalaccepted rentalaccepted) {
        try {
            if (!rentalaccepted.validate()) return;
                // view 객체 조회

                    List<Mypage> mypageList = mypageRepository.findByReservceId(rentalaccepted.getReservceid());
                    for(Mypage mypage : mypageList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    mypage.setRentAcceptDate(rentalaccepted.getRentAcceptDate());
                    mypage.setStatus("RENT ACCEPT");
                // view 레파지 토리에 save
                mypageRepository.save(mypage);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenRentalcanceled_then_UPDATE_5(@Payload Rentalcanceled rentalcanceled) {
        try {
            if (!rentalcanceled.validate()) return;
                // view 객체 조회

                    List<Mypage> mypageList = mypageRepository.findByReservceId(rentalcanceled.getReservceid());
                    for(Mypage mypage : mypageList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    mypage.setRentCancelDate(rentalcanceled.getRentCancelDate());
                    mypage.setStatus("RENTAL CANCEL");
                // view 레파지 토리에 save
                mypageRepository.save(mypage);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenReturnaccepted_then_UPDATE_6(@Payload Returnaccepted returnaccepted) {
        try {
            if (!returnaccepted.validate()) return;
                // view 객체 조회

                    List<Mypage> mypageList = mypageRepository.findByReservceId(returnaccepted.getReservceid());
                    for(Mypage mypage : mypageList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    mypage.setRetAcceptDate(returnaccepted.getRetAcceptDate());
                    mypage.setStatus("RETURN ACCEPT");
                // view 레파지 토리에 save
                mypageRepository.save(mypage);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

