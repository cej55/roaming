package roaming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;

@RestController
 public class ReservationController {

    @Autowired
    ReservationRepository ReservationRepository;

    @RequestMapping(value = "/env",
    method = RequestMethod.GET,
    produces = "application/json;charset=UTF-8")

    public void env(HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        System.out.println("##### /env  called #####");

        String env_DB_IP = System.getenv("DB_IP");
        String env_DB_SERVICE_NAME = System.getenv("DB_SERVICE_NAME");

        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");

        PrintWriter writer = response.getWriter();
        writer.write("DB IP : " + env_DB_IP +"\r\n");
        writer.write("DB SERVICE_NAME : " + env_DB_SERVICE_NAME);
        writer.flush();
        writer.close();
    }

    @RequestMapping(value = "/reserve",
    method = RequestMethod.POST,
    produces = "application/json;charset=UTF-8")

    public String reserve(HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        System.out.println("##### /reserve  called #####");
     
        String phoneId = request.getParameter("phoneId");
        String rentalAddr = request.getParameter("rentalAddr");
        String retrieveAddr = request.getParameter("retriveAddr");
        String userPhone = request.getParameter("userPhone");
        String amount = request.getParameter("amount");
        String reserveDate = request.getParameter("reserveDate");
        String payType = request.getParameter("payType");
        String payNumber = request.getParameter("payNumber");
        String payCompany = request.getParameter("payCompany");

        System.out.println("##### phoneId : " + phoneId);
        System.out.println("##### amount : " + amount);
        System.out.println("##### userPhone : " + userPhone);
        System.out.println("##### payType : " + payType);
        System.out.println("##### payNumber : " + payNumber);
        System.out.println("##### payCompany : " + payCompany);

        Reservation Reservation = new Reservation();
        Reservation.setphoneId(phoneId);
        Reservation.setuserPhone(userPhone);

        Reservation.setamount(amount);

        Reservation.setreserveDate(reserveDate);
        Reservation.setpayType(payType);
        Reservation.setpayNumber(payNumber);
        Reservation.setpayCompany(payCompany);
                        
        Reservation  = ReservationRepository.save(Reservation);

        String reserveId = Long.toString(Reservation.getId());        
        System.out.println("##### reserveId : " + reserveId);

        boolean ret = false;
        try {
         //   ret = ReservationApplication.applicationContext.getBean(roaming.external.PaymentService.class)
       //         .pay(reserveId, phoneId, amount, userPhone, payType, payNumber, payCompany);

            System.out.println("##### /payment/pay  called result : " + ret);
        } catch (Exception e) {
            System.out.println("##### /payment/pay  called exception : " + e);
        }

        String status = "";
        if (ret) {
            status = "Reserved";
        } else {
            status = "ReserveFailed";
        } 

        Reservation.setreserveStatus(status);
        Reservation  = ReservationRepository.save(Reservation);

        return status + " ReserveNumber : " + reserveId;          
    }

    @RequestMapping(value = "/cancel",
    method = RequestMethod.POST,
    produces = "application/json;charset=UTF-8")

    public String cancel(HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        System.out.println("##### /cancel  called #####");
     
        String reserveId = request.getParameter("reserveId");
        String cancelDate = request.getParameter("cancelDate");        
        System.out.println("##### reserveId : " + reserveId);
        System.out.println("##### cancelDate : " + cancelDate);        

        Optional<Reservation> ReservationOptional = ReservationRepository.findById(Long.parseLong(reserveId));

        String status = "ReserveCanceled";          

        if (ReservationOptional.isPresent()) {
            Reservation Reservation = ReservationOptional.get();
            String curStatus = Reservation.getreserveStatus();
            if ("Reserved".equals(curStatus)) {
                Reservation.setcancelDate(cancelDate);
                Reservation.setreserveStatus(status);
                ReservationApplication.applicationContext.getBean(roaming.ReservationRepository.class)
                .save(Reservation);
                }
            else {
                status = "reserve status is not Reserved(current : " + curStatus + ")"; 
            }
        }
        else{
            status = "not found"; 
        }     

        return status + " ReserveNumber : " + reserveId;          
    }

    @RequestMapping(value = "/resreturn",
    method = RequestMethod.POST,
    produces = "application/json;charset=UTF-8")

    public String resreturn(HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        System.out.println("##### /resreturn  called #####");
     
        String reserveId = request.getParameter("reserveId");
        String returnDate = request.getParameter("returnDate");        
        System.out.println("##### reserveId : " + reserveId);
        System.out.println("##### returnDate : " + returnDate);

        Optional<Reservation> ReservationOptional = ReservationRepository.findById(Long.parseLong(reserveId));

        String status = "ReserveReturned";                     
        if (ReservationOptional.isPresent()) {
            Reservation Reservation = ReservationOptional.get();
            String curStatus = Reservation.getreserveStatus();
            if ("Reserved".equals(curStatus)) {            
                Reservation.setreturnDate(returnDate);
                Reservation.setreserveStatus(status);

                ReservationApplication.applicationContext.getBean(roaming.ReservationRepository.class)
                .save(Reservation);
            }
            else {
                status = "reserve status is not Reserved(current : " + curStatus + ")"; 
            }            
        }   
        else{
            status = "not found"; 
        } 

        return status + " ReserveNumber : " + reserveId;          
    }   
}

