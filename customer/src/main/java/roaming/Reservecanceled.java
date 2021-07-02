
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
    public String getcancelDate() {
        return cancelDate;
    }

    public void setcancelDate(String cancelDate) {
        this.cancelDate = cancelDate;
    }
}

