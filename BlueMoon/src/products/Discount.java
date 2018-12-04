package products;


import java.util.Date;

public class Discount {
    private float percentage;
    private Date start;
    private Date end;

    public Discount() {}

    public Discount(float percentage, Date start, Date end) {
        this.percentage = percentage;
        this.start = start;
        this.end = end;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
