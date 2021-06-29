package roaming;

public class Reservereturned extends AbstractEvent {

    private Long id;
    private String returndate;

    public Reservereturned(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getReturndate() {
        return returndate;
    }

    public void setReturndate(String returndate) {
        this.returndate = returndate;
    }
}
