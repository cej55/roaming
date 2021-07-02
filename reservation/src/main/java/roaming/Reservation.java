package roaming;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="Reservation_table")
public class Reservation {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String phoneId;
    private String country;
    private String amount;
    private String reserveDate;
    private String returnDate;
    private String cancelDate;
    private String reserveStatus;
    private String payType;
    private String payNumber;
    private String payCompany;
    private String userPhone;

    @PostUpdate
    public void onPostUpdate(){
        if ("Reserved".equals(this.getReserveStatus()))
        {
            Reserved reserved = new Reserved();
            BeanUtils.copyProperties(this, reserved);
            reserved.publishAfterCommit();
            System.out.println("##### send event : Reserved  #####");   
        } 
//        else if ("ReserveCanceled".equals(this.getReserveStatus()))
//        {
//            ReserveCanceled reserveCanceled = new ReserveCanceled();
//            BeanUtils.copyProperties(this, reserveCanceled);
//            reserveCanceled.publishAfterCommit();
//        }               
//        else if ("ReserveReturned".equals(this.getReserveStatus()) )
//        {
//            ReserveReturned reserveReturned = new ReserveReturned();
//            BeanUtils.copyProperties(this, reserveReturned);
//            reserveReturned.publishAfterCommit();
//            System.out.println("##### send event : ReserveReturned  #####");  
//        }             
    }

    @PostRemove
    public void onPostRemove(){

    }

    @PrePersist
    public void onPrePersist(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getReserveDate() {
        return reserveDate;
    }

    public void setReserveDate(String reserveDate) {
        this.reserveDate = reserveDate;
    }
    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
    public String getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(String cancelDate) {
        this.cancelDate = cancelDate;
    }
    public String getReserveStatus() {
        return reserveStatus;
    }

    public void setReserveStatus(String reserveStatus) {
        this.reserveStatus = reserveStatus;
    }
    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }
    public String getPayNumber() {
        return payNumber;
    }

    public void setPayNumber(String payNumber) {
        this.payNumber = payNumber;
    }
    public String getPayCompany() {
        return payCompany;
    }

    public void setPayCompany(String payCompany) {
        this.payCompany = payCompany;
    }
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }




}
