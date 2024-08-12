package gettersetter;

import java.sql.SQLOutput;

public class CheckingAccount{
    public static void main(String[] args){
        Bank accountOne = new Bank ("Zeus", 100, "1");
        Bank accountTwo = new Bank ("Hades", 200, "2");
        Bank accountThree = new Bank ("Aman kumar",60000,"3");
        System.out.println(accountOne.getBalance());
        accountOne.setBalance(5000);
        System.out.println(accountOne.getBalance());
        System.out.println(accountOne.getName());
        System.out.println(accountTwo.getId());
        accountThree.setName("Swaraj kumar");
        System.out.println(accountThree.getName());
//        Syntex of Getter
//        System.out.println(object.getVariable());  getter is a method
//          SYNTEX OF SETTER
//          object.setVariable("Value change");  setter is a method


    }

}
