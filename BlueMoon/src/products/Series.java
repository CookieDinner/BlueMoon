package products;

import auxiliaries.Actor;
import auxiliaries.List;
import auxiliaries.Season;
import java.util.Date;

public class Series extends Product{
    private String genre;
    private float price;
    private List<Actor> actors;
    private List<Season> seasons;

    public Series() {}

    public Series(int picture, String name, String description, Date date_of_production, int length, String distributor, String country, float score, String genre, float price) {
        super(picture, name, description, date_of_production, length, distributor, country, score);
        this.genre = genre;
        this.price = price;
    }

    public void generate() {}

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
