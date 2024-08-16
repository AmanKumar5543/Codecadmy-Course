package arraylesson;
import java.util.ArrayList;
import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        //ARRAYLIST BREATHING FIRST FORM
//        String[] studentName = {"Aman Kumar","Sahil Kumar","Sameer kumar","Mrinal Kumar","Sameer Kumar"};
//        int [] marksOfScience = {45,65,35,27,67};
//        int [] marksInMaths = {55,65,65,75,56};
//        int [] marksInEnglish = {76,56,54,34,65};
//
//        for (int i = 0 ; i<5 ; i++){  // using for loop  to print the value of arraylist
//            System.out.println("The marks of student "+ studentName[i]);
//            System.out.println("Science Marks:" + marksOfScience[i] );
//            System.out.println("Maths Marks:" + marksInMaths[i]);
//            System.out.println("English Marks:"+ marksInEnglish[i]);

        // ARRAY BREATHING SECOND FORM
        ArrayList<String> names = new ArrayList<>();
        names.add("Aman kumar");
        names.add("Swaraj kumar"); // .add keyword is used to add element
        names.add("Sameer kumar");
        names.add("Sahil kumar");
        names.add("Mukesh kumar");
        names.add("Sahil sharma");
        names.add("Priyansh");
        names.add (5,"Mrinal kumar");
//        names.set(3,"Yamini Suman"); // set the new element on the chosen index
//        names.remove(2); //.add can als be used to create element on a particular index
//        names.remove("Aman kumar");
//        System.out.println(names.getFirst());  // prints the first elements of the Arraylist
//        System.out.println(names.getLast()); // prints the last elements of the Arraylist
//        System.out.println(names.getClass());
//
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }
//        System.out.println(names.indexOf("Mrinal kumar")); // .index is used to find the index of an element
//        System.out.println(names.get(3)); // .get is to print the index value of the array
//        System.out.println(names.size()); // .get prints the array length
//        System.out.println(names.listIterator(2));
//        System.out.println(names.clone()); // prints all the elements in [ a,b,c,f,d,g ] form
//        System.out.println(names.contains("Aman kumar")); // to find if the element is present in the arraylist
//        System.out.println(names.subList(3,7)); //to print element from  a certain index to another in an arraylist
//        System.out.println(names.reversed()); //to print element in reversed order as list
//        System.out.println("Here are some Arraylist methods");
//        System.out.println(names.toArray());
//        System.out.println(names.lastIndexOf("Sahil kumar"));


        //ARRAY BREATHING THIRD FORM
        Scanner index = new Scanner(System.in);
        System.out.println("Enter the index and i will show the element");
        int i = index.nextInt();
        System.out.println("The name on index " + i + " is " + names.get(i));
    }
}


