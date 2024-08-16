package arraylesson;


public class Arrays {
    //Array is a collection of similar type of Datatypes
    public static void main(String[] args) {
//        Array breathing First form
        int[] prices = new int[5];
        String [] names = new String[6];
        double[] tax = new double[8];
        prices[1] = 45;
        prices[2]= 34;
        prices[3]= 456;
        names [1] ="Aman Kumar";
        names[2] ="Swaraj kumar";
        names[3] ="Sameer kumar";
        tax[1] = 34.5 ;
        tax[2] = 56.6;
        tax[3] = 23.4 ;
        System.out.println(prices[2]);
        System.out.println(names[3]);
        System.out.println(tax[1]);

        // first form ends

        //Array breathing Second form

        int [] cost;
        cost =new int [5];
        cost [1] = 45;
        cost [2]= 55;
        cost[3]= 65;
        cost[4] =75;
        System.out.println(cost[3]);
        //Second form ends

        //Array breathing third form

        String[] brothers = {"Aman kumar","Mrinal kumar","Swaraj kumar","Sameer kumar","Sahil kumar"};
//        System.out.println(brothers[1]);
//        System.out.println(brothers[2]);
//        System.out.println(brothers[3]);
//        System.out.println(brothers[0]);
//        System.out.println(brothers[4]);

        //Third form ends
        for (int i=0 ; i < brothers.length ; i++){   //used for loop with array to print the values
            System.out.println(brothers[i]);
        }
      int i=0;
        while (i < brothers.length){
            System.out.println(brothers[i]);   //used while loop with array to print the values
            i++;
        }
        for (String name : brothers){    // used for each loop for printing the value of array
            System.out.println(name);
        }
    }

}
