package inhabitants;

import auxiliaries.Contract;

public class Distributor {
    private Contract contract;
    private int balance;

    public Distributor() {
    }

    public Distributor(Contract contract, int balance) {
        this.contract = contract;
        this.balance = balance;
    }

    public void createContract(){

    }
    public Contract getContract(){
        return contract;
    }
    public void addBalance(int money){
        this.balance += money;
    }
    public void generate(){

    }
    public void createProduct(){

    }
}
