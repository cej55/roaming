package roaming;

public class Rentalaccepted extends AbstractEvent {

    private Long id;
    private String reservceId;
    private String rentAcceptDate;

    public Rentalaccepted(){
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
    public String getRentAcceptDate() {
        return rentAcceptDate;
    }

    public void setRentAcceptDate(String rentAcceptDate) {
        this.rentAcceptDate = rentAcceptDate;
    }
}
