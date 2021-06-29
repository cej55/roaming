
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
    public String getReservceid() {
        return reserveId;
    }

    public void setReservceid(String reserveId) {
        this.reserveId = reserveId;
    }
    public String getRetAcceptDate() {
        return retAcceptDate;
    }

    public void setRetAcceptDate(String retAcceptDate) {
        this.retAcceptDate = retAcceptDate;
    }
}

