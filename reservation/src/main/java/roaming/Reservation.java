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
        if ("Reserved".equals(this.getreserveStatus()))
        {
            Reserved reserved = new Reserved();
            BeanUtils.copyProperties(this, reserved);
            reserved.publishAfterCommit();
            System.out.println("##### send event : Reserved  #####");   
        } 
        else if ("Reservecanceled".equals(this.getreserveStatus()))
        {
            Reservecanceled Reservecanceled = new Reservecanceled();
            BeanUtils.copyProperties(this, Reservecanceled);
            Reservecanceled.publishAfterCommit();
        }               
        else if ("Reservereturned".equals(this.getreserveStatus()) )
        {
            Reservereturned Reservereturned = new Reservereturned();
            BeanUtils.copyProperties(this, Reservereturned);
            Reservereturned.publishAfterCommit();
            System.out.println("##### send event : Reservereturned  #####");  
        }             
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
    public String getphoneId() {
        return phoneId;
    }

    public void setphoneId(String phoneId) {
        this.phoneId = phoneId;
    }
    public String getcountry() {
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
    public String getreturnDate() {
        return returnDate;
    }

    public void setreturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
    public String getcancelDate() {
        return cancelDate;
    }

    public void setcancelDate(String cancelDate) {
        this.cancelDate = cancelDate;
    }
    public String getreserveStatus() {
        return reserveStatus;
    }

    public void setreserveStatus(String reserveStatus) {
        this.reserveStatus = reserveStatus;
    }
    public String getpayType() {
        return payType;
    }

    public void setpayType(String payType) {
        this.payType = payType;
    }
    public String getpayNumber() {
        return payNumber;
    }

    public void setpayNumber(String payNumber) {
        this.payNumber = payNumber;
    }
    public String getpayCompany() {
        return payCompany;
    }

    public void setpayCompany(String payCompany) {
        this.payCompany = payCompany;
    }
    public String getuserPhone() {
        return userPhone;
    }

    public void setuserPhone(String userPhone) {
        this.userPhone = userPhone;
    }




}
