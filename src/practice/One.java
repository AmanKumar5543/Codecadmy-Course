package practice;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("enter the length of array".toUpperCase());
        int arrayLength = info.nextInt();
        String lengthOFArray[] = new String[arrayLength+1];
        System.out.println("enter the elements of the array".toUpperCase());
        for (int i = 0 ; i < lengthOFArray.length ; i++ ){
            lengthOFArray[i] = info.nextLine();
        }
        for (int i = 0 ; i < lengthOFArray.length ; i++){
            System.out.println(lengthOFArray[i]);
        }
    }
}
