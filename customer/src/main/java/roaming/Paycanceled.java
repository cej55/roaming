
package roaming;

public class Paycanceled extends AbstractEvent {

    private Long id;
    private String reserveId;
    private String payCancelDate;

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
    public String getpayCancelDate() {
        return payCancelDate;
    }

    public void setpayCancelDate(String payCancelDate) {
        this.payCancelDate = payCancelDate;
    }
}

