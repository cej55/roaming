package roaming;

public class Reservereturned extends AbstractEvent {

    private Long id;
    private String returnDate;

    public Reservereturned(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getreturnDate() {
        return returnDate;
    }

    public void setreturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}
