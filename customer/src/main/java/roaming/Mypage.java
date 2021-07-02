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
        public String getreservceId() {
            return reservceId;
        }

        public void setreservceId(String reservceId) {
            this.reservceId = reservceId;
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
        public String getcountry() {
            return country;
        }

        public void setcountry(String country) {
            this.country = country;
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
        public String getstatus() {
            return status;
        }

        public void setstatus(String status) {
            this.status = status;
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
        public String getpayCancelDate() {
            return payCancelDate;
        }

        public void setpayCancelDate(String payCancelDate) {
            this.payCancelDate = payCancelDate;
        }
        public String getuserPhone() {
            return userPhone;
        }

        public void setuserPhone(String userPhone) {
            this.userPhone = userPhone;
        }
        public String getphoneId() {
            return phoneId;
        }

        public void setphoneId(String phoneId) {
            this.phoneId = phoneId;
        }
        public String getpayType() {
            return payType;
        }

        public void setpayType(String payType) {
            this.payType = payType;
        }
        public String getpayCompany() {
            return payCompany;
        }

        public void setpayCompany(String payCompany) {
            this.payCompany = payCompany;
        }
        public String getpayNumber() {
            return payNumber;
        }

        public void setpayNumber(String payNumber) {
            this.payNumber = payNumber;
        }

}
