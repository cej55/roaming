
package roaming;

public class Rentalcanceled extends AbstractEvent {

    private Long id;
    private String reserveId;
    private String rentCancelDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getreservceId() {
        return reserveId;
    }

    public void setReservceid(String reserveId) {
        this.reserveId = reserveId;
    }
    public String getrentCancelDate() {
        return rentCancelDate;
    }

    public void setrentCancelDate(String rentCancelDate) {
        this.rentCancelDate = rentCancelDate;
    }
}

