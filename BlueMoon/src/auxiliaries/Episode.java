package auxiliaries;

import java.util.Date;

public class Episode {
    private String name;
    private int length;
    private int id;
    private Date airs;

    public Episode() {
    }

    public Episode(String title, int length, int id) {
        this.name = title;
        this.length = length;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getAirs() {
        return airs;
    }

    public void setAirs(Date airs) {
        this.airs = airs;
    }
}
