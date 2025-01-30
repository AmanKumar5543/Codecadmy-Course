package ifelse;

import java.util.Scanner;

public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price and selling price:");
        double CP = sc.nextDouble();
        double SP = sc.nextDouble();

        if (SP > CP){
            System.out.println("Profit = " + (SP-CP));
            System.out.println("Congrats won");
        }
         System.out.println("Loss = " + (CP - SP));
        System.out.println("Sorry you lost");

    }
}
