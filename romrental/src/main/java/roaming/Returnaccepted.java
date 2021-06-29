package roaming;

public class Returnaccepted extends AbstractEvent {

    private Long id;
    private String reservceid;
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
    public String getReservceid() {
        return reservceid;
    }

    public void setReservceid(String reservceid) {
        this.reservceid = reservceid;
    }
    public String getRetAcceptDate() {
        return retAcceptDate;
    }

    public void setRetAcceptDate(String retAcceptDate) {
        this.retAcceptDate = retAcceptDate;
    }
}
