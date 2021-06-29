
package roaming;

public class Reservereturned extends AbstractEvent {

    private Long id;
    private String returnDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getReturndate() {
        return returnDate;
    }

    public void setReturndate(String returnDate) {
        this.returnDate = returnDate;
    }
}

