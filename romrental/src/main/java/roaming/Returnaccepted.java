package roaming;

public class Returnaccepted extends AbstractEvent {

    private Long id;
    private String reservceId;
    private String retAcceptDate;

    public Returnaccepted(){
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
    public String getretAcceptDate() {
        return retAcceptDate;
    }

    public void setretAcceptDate(String retAcceptDate) {
        this.retAcceptDate = retAcceptDate;
    }
}
