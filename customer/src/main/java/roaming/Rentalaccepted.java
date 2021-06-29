
package roaming;

public class Rentalaccepted extends AbstractEvent {

    private Long id;
    private String reserveId;
    private String rentAcceptDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getReservceid() {
        return reserveId;
    }

    public void setReservceid(String reserveId) {
        this.reserveId = reserveId;
    }
    public String getRentAcceptDate() {
        return rentAcceptDate;
    }

    public void setRentAcceptDate(String rentAcceptDate) {
        this.rentAcceptDate = rentAcceptDate;
    }
}

