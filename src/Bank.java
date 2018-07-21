public class Bank {

    public static void main(String[] args) {

    PersonalAccount p1 = new PersonalAccount("Rafal Kowalski", "23456728192835201928263521");
    CorporateAccount c1 = new CorporateAccount("Jan Nowak", "83741827481748127481748017",12247,124);

    p1.income(20000);
    p1.income(30000);

System.out.println(p1);
p1.closeAccount();
        System.out.println(p1);


    }

}
