
package roaming;

public class Reservecanceled extends AbstractEvent {

    private Long id;
    private String cancelDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getCanceldate() {
        return cancelDate;
    }

    public void setCanceldate(String cancelDate) {
        this.cancelDate = cancelDate;
    }
}

