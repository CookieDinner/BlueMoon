package auxiliaries;

import products.Product;

public class Subscription {
    private String name;
    private float price;
    private int number_of_devices;
    private String max_res;
    private List<Product> applies_to;

    public Subscription() {
    }

    public Subscription(String name, float price, int number_of_devices, String max_res) {
        this.name = name;
        this.price = price;
        this.number_of_devices = number_of_devices;
        this.max_res = max_res;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumber_of_devices() {
        return number_of_devices;
    }

    public void setNumber_of_devices(int number_of_devices) {
        this.number_of_devices = number_of_devices;
    }

    public String getMax_res() {
        return max_res;
    }

    public void setMax_res(String max_res) {
        this.max_res = max_res;
    }
}
