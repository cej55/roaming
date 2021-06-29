
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getPhoneid() {
        return phoneId;
    }

    public void setPhoneid(String phoneId) {
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
    public String getReservedate() {
        return reserveDate;
    }

    public void setReservedate(String reserveDate) {
        this.reserveDate = reserveDate;
    }
    public String getPaytype() {
        return payType;
    }

    public void setPaytype(String payType) {
        this.payType = payType;
    }
    public String getPaynumber() {
        return payNumber;
    }

    public void setPaynumber(String payNumber) {
        this.payNumber = payNumber;
    }
    public String getPaycompany() {
        return payCompany;
    }

    public void setPaycompany(String payCompany) {
        this.payCompany = payCompany;
    }
    public String getUserphone() {
        return userPhone;
    }

    public void setUserphone(String userPhone) {
        this.userPhone = userPhone;
    }
}

