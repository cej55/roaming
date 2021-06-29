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

    @PostPersist
    public void onPostPersist(){
        Rentalaccepted rentalaccepted = new Rentalaccepted();
        BeanUtils.copyProperties(this, rentalaccepted);
        rentalaccepted.publishAfterCommit();

        Rentalcanceled rentalcanceled = new Rentalcanceled();
        BeanUtils.copyProperties(this, rentalcanceled);
        rentalcanceled.publishAfterCommit();

        Returnaccepted returnaccepted = new Returnaccepted();
        BeanUtils.copyProperties(this, returnaccepted);
        returnaccepted.publishAfterCommit();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getReserveId() {
        return reserveId;
    }

    public void setReserveId(String reserveId) {
        this.reserveId = reserveId;
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
    public String getReservCancelDate() {
        return reservCancelDate;
    }

    public void setReservCancelDate(String reservCancelDate) {
        this.reservCancelDate = reservCancelDate;
    }
    public String getReservReturnDate() {
        return reservReturnDate;
    }

    public void setReservReturnDate(String reservReturnDate) {
        this.reservReturnDate = reservReturnDate;
    }
    public String getRentAcceptDate() {
        return rentAcceptDate;
    }

    public void setRentAcceptDate(String rentAcceptDate) {
        this.rentAcceptDate = rentAcceptDate;
    }
    public String getRentCancelDate() {
        return rentCancelDate;
    }

    public void setRentCancelDate(String rentCancelDate) {
        this.rentCancelDate = rentCancelDate;
    }
    public String getRetAcceptDate() {
        return retAcceptDate;
    }

    public void setRetAcceptDate(String retAcceptDate) {
        this.retAcceptDate = retAcceptDate;
    }
    public String getRetalStatus() {
        return retalStatus;
    }

    public void setRetalStatus(String retalStatus) {
        this.retalStatus = retalStatus;
    }




}
