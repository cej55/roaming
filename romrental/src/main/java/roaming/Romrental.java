package roaming;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="Romrental_table")
public class Romrental {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String reserveId;
    private String phoneId;
    private String country;
    private String amount;
    private String reserveDate;
    private String reservCancelDate;
    private String reservReturnDate;
    private String rentAcceptDate;
    private String rentCancelDate;
    private String retAcceptDate;
    private String retalStatus;
    private String rentalStatus;
    
    @PostPersist
    public void onPostPersist(){
        if ("Rentalaccepted".equals(this.getretalStatus())) {        
            Rentalaccepted Rentalaccepted = new Rentalaccepted();
            BeanUtils.copyProperties(this, Rentalaccepted);
            Rentalaccepted.publishAfterCommit();
        }
    }
//rentalStatus
    @PostUpdate
    public void onPostUpdate(){
//        if ("Rentaled".equals(this.getrentalStatus())) {        
//            Rentaled rentaled = new Rentaled();
//            BeanUtils.copyProperties(this, rentaled);
//            rentaled.publishAfterCommit();
//        }
        if ("Rentalcanceled".equals(this.getretalStatus())) {        
            Rentalcanceled Rentalcanceled = new Rentalcanceled();
            BeanUtils.copyProperties(this, Rentalcanceled);
            Rentalcanceled.publishAfterCommit(); 
        }
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getreserveId() {
        return reserveId;
    }

    public void setreserveId(String reserveId) {
        this.reserveId = reserveId;
    }
    public String getphoneId() {
        return phoneId;
    }

    public void setphoneId(String phoneId) {
        this.phoneId = phoneId;
    }
    public String getCountry() {
        return country;
    }

    public void setcountry(String country) {
        this.country = country;
    }
    public String getamount() {
        return amount;
    }

    public void setamount(String amount) {
        this.amount = amount;
    }
    public String getreserveDate() {
        return reserveDate;
    }

    public void setreserveDate(String reserveDate) {
        this.reserveDate = reserveDate;
    }
    public String getreservCancelDate() {
        return reservCancelDate;
    }

    public void setreservCancelDate(String reservCancelDate) {
        this.reservCancelDate = reservCancelDate;
    }
    public String getreservReturnDate() {
        return reservReturnDate;
    }

    public void setreservReturnDate(String reservReturnDate) {
        this.reservReturnDate = reservReturnDate;
    }
    public String getrentAcceptDate() {
        return rentAcceptDate;
    }

    public void setrentAcceptDate(String rentAcceptDate) {
        this.rentAcceptDate = rentAcceptDate;
    }
    public String getrentCancelDate() {
        return rentCancelDate;
    }

    public void setrentCancelDate(String rentCancelDate) {
        this.rentCancelDate = rentCancelDate;
    }
    public String getretAcceptDate() {
        return retAcceptDate;
    }

    public void setretAcceptDate(String retAcceptDate) {
        this.retAcceptDate = retAcceptDate;
    }
    public String getretalStatus() {
        return retalStatus;
    }

    public void setretalStatus(String retalStatus) {
        this.retalStatus = retalStatus;
    }

    public String getrentalStatus() {
        return rentalStatus;
    }

    public void setrentalStatus(String rentalStatus) {
        this.rentalStatus = rentalStatus;
    }



}
