package general;

public class Administration {
    private String app_name;
    private String owner;
    private int BlueMoon_balance;

    public Administration(String app_name, String owner, int blueMoon_balance) {
        this.app_name = app_name;
        this.owner = owner;
        BlueMoon_balance = blueMoon_balance;
    }

    public void addItem(){

    }

    //Simulation does not exist yet... yet... for a long time...

    public void calculateIncome(){

    }
    public void transferMoney(){

    }
    public void addToCompanyBalance(){

    }
    public String getApp_name() {
        return app_name;
    }

    public String getOwner() {
        return owner;
    }

    public int getBlueMoon_balance() {
        return BlueMoon_balance;
    }
}
