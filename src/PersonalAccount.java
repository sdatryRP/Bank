public class PersonalAccount extends Account {


    public PersonalAccount(String nameClient, String numberAccount) {
        super.openAccount(nameClient, numberAccount);

    }

    @Override
    public TypeOfAccounts getTypeOfAccount() {
        return TypeOfAccounts.PERSNAL;
    }

    @Override
    public String toString() {
        return "PersonalAccount "+super.toString();
    }
}
