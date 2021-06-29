package roaming;

public class Reservecanceled extends AbstractEvent {

    private Long id;
    private String canceldate;

    public Reservecanceled(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getCanceldate() {
        return canceldate;
    }

    public void setCanceldate(String canceldate) {
        this.canceldate = canceldate;
    }
}
