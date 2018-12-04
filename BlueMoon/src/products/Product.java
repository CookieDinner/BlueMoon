package products;

import java.util.Date;

public class Product {

    private int picture;
    private String name;
    private String description;
    private Date date_of_production;
    private int length;
    private String distributor;
    private String country;
    private float score;


    protected Product(){}
    protected Product(int picture, String name, String description, Date date_of_production, int length, String distributor, String country, float score) {
        this.picture = picture;
        this.name = name;
        this.description = description;
        this.date_of_production = date_of_production;
        this.length = length;
        this.distributor = distributor;
        this.country = country;
        this.score = score;
    }



    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate_of_production() {
        return date_of_production;
    }

    public void setDate_of_production(Date date_of_production) {
        this.date_of_production = date_of_production;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
