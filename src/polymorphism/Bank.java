package polymorphism;

public class Bank {
    public void interestRate(){
        System.out.println("The interest rate of Banks are:");
    }
    public void minimumFirstDeposit(){
        System.out.println("The minimum first deposit of this banks are :");
    }

    public static class SBI extends Bank {
        @Override
        public void interestRate() {
            System.out.println("The interest rate of SBI is 7%");
        }
        @Override
        public void minimumFirstDeposit(){
            System.out.println("The minimum first deposit of SBI is Rs. 4000 :");
        }
    }
    public static class HDFC extends Bank {
        @Override
        public void interestRate() {
            System.out.println("The interest rate of HDFC is 5%");
        }
        @Override
        public void minimumFirstDeposit(){
            System.out.println("The minimum first deposit of HDFC is Rs. 2000:");
        }
    }
    public static class Canara_Bank extends Bank {
        @Override
        public void interestRate() {
            System.out.println("The interest rate of Canara Bank is 7%");
        }

        @Override
        public void minimumFirstDeposit() {
            System.out.println("The minimum first deposit is Rs.1000 ");
        }
    }


}
