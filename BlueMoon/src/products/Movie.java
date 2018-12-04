package products;


import auxiliaries.Actor;
import auxiliaries.List;

public class Movie {
    private List<Actor> actors;
    private float price;
    private String trailer_link;
    private float time_of_ownership;
    private Discount discount;

    public Movie() {}

    public Movie(float price, String trailer_link, float time_of_ownership) {
        this.price = price;
        this.trailer_link = trailer_link;
        this.time_of_ownership = time_of_ownership;
    }


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTrailer_link() {
        return trailer_link;
    }

    public void setTrailer_link(String trailer_link) {
        this.trailer_link = trailer_link;
    }

    public float getTime_of_ownership() {
        return time_of_ownership;
    }

    public void setTime_of_ownership(float time_of_ownership) {
        this.time_of_ownership = time_of_ownership;
    }
}
