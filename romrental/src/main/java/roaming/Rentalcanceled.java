package roaming;

public class Rentalcanceled extends AbstractEvent {

    private Long id;
    private String reservceid;
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
    public String getReservceid() {
        return reservceid;
    }

    public void setReservceid(String reservceid) {
        this.reservceid = reservceid;
    }
    public String getRentCancelDate() {
        return rentCancelDate;
    }

    public void setRentCancelDate(String rentCancelDate) {
        this.rentCancelDate = rentCancelDate;
    }
}
