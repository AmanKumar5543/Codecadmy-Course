package stringmethods;

public class Strings {
    public static void main(String[] args) {
        String name = "Aman kumar";
        System.out.println(name.toLowerCase());   // for changing all alphabets to small letter
        System.out.println(name.toUpperCase()); // for changing all alphabets to capital letter
        System.out.println(name.indent(5)); // giving spaces at the starting of the String
        System.out.println(name.charAt(5));  // finding the index opf any character
        System.out.println(name.replace("kumar", "Dubey")); // replacing any part of string with something other
        System.out.println(name.replaceAll("Aman kumar","Swaraj kumar")); // replace the whole string
        System.out.println(name.contains("Sharma")); // checks whether the sting contains the given parameter and returns boolean as result
        System.out.println(name.concat(" Srivastava")); // add the given string at the end of the Main String
        System.out.println(name.length()); //provides the length of the string
        System.out.println(name.endsWith("kumar"));  // Checks if the main string ends with the given parameter
        System.out.println(name.startsWith("Sam"));  // Checks if the main string starts with the given parameter
        System.out.println(name.getClass());  // Shows the class in which we are working
    }


}
