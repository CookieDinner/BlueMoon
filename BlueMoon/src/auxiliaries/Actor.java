package auxiliaries;

public class Actor {
    private String name;
    private String surname;

    public Actor() {
    }

    public Actor(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String showInfo(){
        return name+" "+surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
