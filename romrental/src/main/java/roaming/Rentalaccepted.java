package roaming;

public class Rentalaccepted extends AbstractEvent {

    private Long id;
    private String reservceid;
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
    public String getReservceid() {
        return reservceid;
    }

    public void setReservceid(String reservceid) {
        this.reservceid = reservceid;
    }
    public String getRentAcceptDate() {
        return rentAcceptDate;
    }

    public void setRentAcceptDate(String rentAcceptDate) {
        this.rentAcceptDate = rentAcceptDate;
    }
}
