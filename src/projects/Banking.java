package projects;

public class Banking {
    String name ;
    int accountNumber;
    double balance;
    boolean isActive;
    String branch;

    public Banking(String name,int accountNumber,double balance,boolean isActive,String branch){

        this.name    = name;
        this.accountNumber    = accountNumber;
        this.balance    = balance;
        this.isActive    = isActive;
        this.branch   = branch;

    }
    public void accountDetails() {
        System.out.println("Account name : " +  (this.name).toUpperCase());
        System.out.println("Account number : " + this.accountNumber);
        System.out.println("Account Balance : " + this.balance);
        System.out.println("Account Branch : " + (this.branch).toUpperCase());
        System.out.println("Account active : " + this.isActive);

    }
    public void showBalance(){
        System.out.println("The balance of" + this.accountNumber +" is  Rs." + this.balance);
    }
    public void depositMoney(double depositAmount){
        if (depositAmount<=0){
            System.out.println("Deposit amount can not be o or negative");
        }else if(this.isActive == false) {
            System.out.println("your account is not active currently .please contact your branch");
        }else{
        double newBalance  = this.balance + depositAmount;
        this.balance = newBalance;
    }
    }
    public void withdrawMoney(double withdrawAmount){
        if (withdrawAmount >= this.balance){
            System.out.println("You Can not withdraw total amount or more then your current balance");
        }
        else if(this.isActive == false) {
            System.out.println("your account is not active currently .please contact your branch");
        }else{
            double newBalance =  this.balance - withdrawAmount;
            this.balance= newBalance;
        }

    }
    public void closeAccount(){
        this.isActive = false;
        System.out.println("Your Account has been deactivated");
    }

    }



