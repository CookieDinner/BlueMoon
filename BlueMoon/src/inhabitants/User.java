package inhabitants;

import auxiliaries.Subscription;

import java.util.Date;

public class User {
    private String name;
    private int id;
    private Date birthday;
    private String email;
    private int card_id;
    private Subscription subscription;
    private Date date_of_subscription;

    public User() {
    }

    public User(String name, int id, Date birthday, String email, int card_id, Subscription subscription) {
        this.name = name;
        this.id = id;
        this.birthday = birthday;
        this.email = email;
        this.card_id = card_id;
        this.subscription = subscription;
    }

    public void buySub(){

    }
    public void buyOne(){

    }
    public void generate(){

    }
    public void watch(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCard_id() {
        return card_id;
    }

    public void setCard_id(int card_id) {
        this.card_id = card_id;
    }

    public Date getDate_of_subscription() {
        return date_of_subscription;
    }

    public void setDate_of_subscription(Date date_of_subscription) {
        this.date_of_subscription = date_of_subscription;
    }
}
