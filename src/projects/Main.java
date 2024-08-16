package projects;

public class Main {
    public static void main(String[] args) {
        Banking Aman = new Banking("Aman kumar",10001111,4000.45,true,"abc");
        Banking Sahil = new Banking("Sahil kumar",10002222,50000.34,true,"abc");
        Banking Mukesh= new Banking("Mukesh kumar",10003333,6765.32,false,"xyz");
        Banking Mrinal = new Banking("Mrinal kumar",10004444,100000.43,true,"xyz");
        System.out.println(("Welcome To the bank of India ").toUpperCase());
        Sahil.accountDetails();

        Sahil.closeAccount();
        Sahil.accountDetails();
        Sahil.withdrawMoney(500);




    }
}
