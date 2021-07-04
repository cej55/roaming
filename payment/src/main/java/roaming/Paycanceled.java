package roaming;

public class Paycanceled extends AbstractEvent {

    private Long id;
    private String reservceId;
    private String payCancelDate;

    public Paycanceled(){
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
    public String getpayCancelDate() {
        return payCancelDate;
    }

    public void setpayCancelDate(String payCancelDate) {
        this.payCancelDate = payCancelDate;
    }
}
