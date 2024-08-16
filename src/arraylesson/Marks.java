package arraylesson;
import java.util.ArrayList;

public class Marks {
    public static void main(String[] args) {
        String[] studentName = {"Aman Kumar","Sahil Kumar","Sameer kumar","Mrinal Kumar","Sameer Kumar"};
        int [] marksOfScience = {45,65,35,27,67};
        int [] marksInMaths = {55,65,65,75,56};
        int [] marksInEnglish = {76,56,54,34,65};

        for (int i = 0 ; i<5 ; i++){  // using for loop  to print the value of arraylist
            System.out.println("The marks of student "+ studentName[i]);
            System.out.println("Science Marks:" + marksOfScience[i] );
            System.out.println("Maths Marks:" + marksInMaths[i]);
            System.out.println("English Marks:"+ marksInEnglish[i]);
        }








    }

}
