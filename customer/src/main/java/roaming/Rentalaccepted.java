
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
    public String getreserveId() {
        return reserveId;
    }

    public void setreserveId(String reserveId) {
        this.reserveId = reserveId;
    }
    public String getrentAcceptDate() {
        return rentAcceptDate;
    }

    public void setrentAcceptDate(String rentAcceptDate) {
        this.rentAcceptDate = rentAcceptDate;
    }
}

