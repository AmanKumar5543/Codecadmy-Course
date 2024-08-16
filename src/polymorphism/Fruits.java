package polymorphism;
public class Fruits{                          //PARENT CLASS
    String nameProduct;
    int halfPrice;
    int fullPrice;
    boolean isPreservable;
    public Fruits(String nameProduct,int halfPrice,int fullPrice,boolean isPreservable){
        this.nameProduct = nameProduct;
        this.halfPrice = halfPrice;
        this.fullPrice = fullPrice;
        this.isPreservable = isPreservable;

     }
     public void menu(){
         System.out.println("Welcome to Aman da Juice Shop");
         System.out.println("We have" + nameProduct);
         System.out.println("Price of full glass is"+ fullPrice);
         System.out.println("Price of half glass is "+ halfPrice);
         System.out.println("it is preservable:" + isPreservable);
     }

}
