public class CorporateAccount extends Account {

    private final int NIP;
    private final int REGON;


    public CorporateAccount(String nameClient, String numberAccount, int nip, int regon) {
        super.openAccount(nameClient, numberAccount);
        this.NIP = nip;
        this.REGON = regon;
    }

    @Override
    TypeOfAccounts getTypeOfAccount() {
        return TypeOfAccounts.CORPORATE;
    }

    

    @Override
    public String toString() {
        return "CorporateAccount {" +
                "NIP=" + NIP +
                ", REGON=" + REGON +
                '}' + super.toString();
    }
}
