public abstract class Account {

private String nameClient;

private String numberAccount;

private boolean stateOfAccount = false;

private double moneyOnAccount;



public enum TypeOfAccounts{
    PERSNAL,
    CORPORATE
}

     void openAccount(String nameClient, String numberAccount){
        this.nameClient=nameClient;
        this.numberAccount=numberAccount;
        this.stateOfAccount=true;
     }

    void closeAccount(String nameClient, String numberAccount){
        this.stateOfAccount=false;
        this.numberAccount="delated";
        this.nameClient="delated";
    }



    public void income(double monay){
    this.moneyOnAccount=monay;
    }


    public double outcome(){
       return this.moneyOnAccount;
    }

    abstract TypeOfAccounts getTypeOfAccount();


    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public boolean isStateOfAccount() {
        return stateOfAccount;
    }

    public void setStateOfAccount(boolean stateOfAccount) {
        this.stateOfAccount = stateOfAccount;
    }

    public double getMoneyOnAccount() {
        return moneyOnAccount;
    }

    public void setMoneyOnAccount(double moneyOnAccount) {
        this.moneyOnAccount = moneyOnAccount;
    }

    @Override
    public String toString() {
        return "{" +
                "nameClient='" + nameClient + '\'' +
                ", numberAccount='" + numberAccount + '\'' +
                ", stateOfAccount=" + stateOfAccount +
                ", moneyOnAccount=" + moneyOnAccount +
                '}';
    }
}
