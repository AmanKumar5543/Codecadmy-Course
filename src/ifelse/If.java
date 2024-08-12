package ifelse;

public class If {
    public static void main(String[] args) {
        int x = 24;
        boolean isIterable = true;
        String name = "Aman Kumar";
       if ( x < 25 ){
           System.out.println("smaller number then 24");
       }

        if (isIterable){
            System.out.println("Process is iterable");
        }
        if (name != "Aman Kumar"){
            System.out.println("The person is a genius");
        }

    }
}



