
package roaming;

public class Returnaccepted extends AbstractEvent {

    private Long id;
    private String reserveId;
    private String retAcceptDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getreservceId() {
        return reserveId;
    }

    public void setreservceId(String reserveId) {
        this.reserveId = reserveId;
    }
    public String getretAcceptDate() {
        return retAcceptDate;
    }

    public void setretAcceptDate(String retAcceptDate) {
        this.retAcceptDate = retAcceptDate;
    }
}

