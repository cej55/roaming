package roaming;

public class Rentalcanceled extends AbstractEvent {

    private Long id;
    private String reservceId;
    private String rentCancelDate;

    public Rentalcanceled(){
        super();
    }

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
    public String getRentCancelDate() {
        return rentCancelDate;
    }

    public void setRentCancelDate(String rentCancelDate) {
        this.rentCancelDate = rentCancelDate;
    }
}
