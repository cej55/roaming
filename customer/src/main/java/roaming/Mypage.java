package roaming;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Mypage_table")
public class Mypage {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String reservceId;
        private String amount;
        private String reserveDate;
        private String country;
        private String returnDate;
        private String cancelDate;
        private String status;
        private String rentAcceptDate;
        private String rentCancelDate;
        private String retAcceptDate;
        private String payCancelDate;
        private String userPhone;
        private String phoneId;
        private String payType;
        private String payCompany;
        private String payNumber;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public String getReservceId() {
            return reservceId;
        }

        public void setReservceId(String reservceId) {
            this.reservceId = reservceId;
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
        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
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
        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
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
        public String getPayCancelDate() {
            return payCancelDate;
        }

        public void setPayCancelDate(String payCancelDate) {
            this.payCancelDate = payCancelDate;
        }
        public String getUserPhone() {
            return userPhone;
        }

        public void setUserPhone(String userPhone) {
            this.userPhone = userPhone;
        }
        public String getPhoneId() {
            return phoneId;
        }

        public void setPhoneId(String phoneId) {
            this.phoneId = phoneId;
        }
        public String getPayType() {
            return payType;
        }

        public void setPayType(String payType) {
            this.payType = payType;
        }
        public String getPayCompany() {
            return payCompany;
        }

        public void setPayCompany(String payCompany) {
            this.payCompany = payCompany;
        }
        public String getPayNumber() {
            return payNumber;
        }

        public void setPayNumber(String payNumber) {
            this.payNumber = payNumber;
        }

}
