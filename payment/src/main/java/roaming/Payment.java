package roaming;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="Payment_table")
public class Payment {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String reserveId;
    private String phoneId;
    private String amount;
    private String userPhone;
    private String payType;
    private String payNumber;
    private String payCompany;
    private String payStatus;
    private String payDate;
    private String payCancelDate;

    @PostUpdate
    public void onPostUpdate(){
        if ("PayCanled".equals(this.getpayStatus()))
        {
//            PayCanceled payCanceled = new PayCanceled();
//            BeanUtils.copyProperties(this, payCanceled);
//            payCanceled.publishAfterCommit();
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
    public String getamount() {
        return amount;
    }

    public void setamount(String amount) {
        this.amount = amount;
    }
    public String getuserPhone() {
        return userPhone;
    }

    public void setuserPhone(String userPhone) {
        this.userPhone = userPhone;
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
    public String getpayStatus() {
        return payStatus;
    }

    public void setpayStatus(String payStatus) {
        this.payStatus = payStatus;
    }
    public String getpayDate() {
        return payDate;
    }

    public void setpayDate(String payDate) {
        this.payDate = payDate;
    }
    public String getpayCancelDate() {
        return payCancelDate;
    }

    public void setpayCancelDate(String payCancelDate) {
        this.payCancelDate = payCancelDate;
    }




}
