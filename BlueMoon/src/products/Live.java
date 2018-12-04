package products;

public class Live {
    private float price;
    private Discount discount;

    public Live() {}

    public Live(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
