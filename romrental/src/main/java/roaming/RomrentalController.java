package roaming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

 @RestController
 public class RomrentalController {

    @RequestMapping(value = "/romrentaled",
    method = RequestMethod.POST,
    produces = "application/json;charset=UTF-8")

    public String rentaled(HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        System.out.println("##### /romrentaled  called #####");
     
        String reserveId = request.getParameter("reserveId");
        String rentalDate = request.getParameter("rentalDate");        
        System.out.println("##### reserveId : " + reserveId);
        System.out.println("##### rentalDate : " + rentalDate);

        Romrental Romrental = RomrentalApplication.applicationContext.getBean(roaming.RomrentalRepository.class)
            .findByreserveId(reserveId);

        String status = "Rentaled";                     
        if (Romrental != null) {
            String curStatus = Romrental.getrentalStatus();            
            if ("RentalAccepted".equals(curStatus)) {            
//                Romrental.setrentalDate(rentalDate);
                Romrental.setrentalStatus(status);

                RomrentalApplication.applicationContext.getBean(roaming.RomrentalRepository.class)
                .save(Romrental);
            }
            else {
                status = "reserve status is not RentalAccepted(current : " + curStatus + ")"; 
            }
        }   
        else{
            status = "not found";
        } 

        return status +  " ReserveNumber : " + reserveId; 
    }

    @RequestMapping(value = "/retrieved",
    method = RequestMethod.POST,
    produces = "application/json;charset=UTF-8")

    public String retrieved(HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        System.out.println("##### /retrieved  called #####");
     
        String reserveId = request.getParameter("reserveId");
        String retrieveDate = request.getParameter("retrieveDate");        
        System.out.println("##### reserveId : " + reserveId);
        System.out.println("##### retrieveDate : " + retrieveDate);

        Romrental Romrental = RomrentalApplication.applicationContext.getBean(roaming.RomrentalRepository.class)
            .findByreserveId(reserveId);

        String status = "RentalRetrieved";                     
        if (Romrental != null) {
            String curStatus = Romrental.getrentalStatus();            
            if ("ReturnAccepted".equals(curStatus)) {              
//                Romrental.setrentretrieveDate(retrieveDate);
                Romrental.setrentalStatus(status);

                RomrentalApplication.applicationContext.getBean(roaming.RomrentalRepository.class)
                .save(Romrental);
            }
            else {
                status = "reserve status is not ReturnAccepted(current : " + curStatus + ")"; 
            }            

        }   
        else{
            status = "not found"; 
        } 

        return status +  " ReserveNumber : " + reserveId; 
    }   

 }
