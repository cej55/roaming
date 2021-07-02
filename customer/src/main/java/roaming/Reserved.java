
package roaming;

public class Reserved extends AbstractEvent {

    private Long id;
    private String phoneId;
    private String country;
    private String amount;
    private String reserveDate;
    private String payType;
    private String payNumber;
    private String payCompany;
    private String userPhone;
    private String reserveId;

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
    public String getpayType() {
        return payType;
    }

    public void setPaytype(String payType) {
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

