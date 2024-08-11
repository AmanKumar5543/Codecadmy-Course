package constructor;

public class Find {
    public static void main (String[] args){
        Dog myPet = new Dog(7,"Lucy",true);
        System.out.println(myPet.isAgressive);
        System.out.println(myPet.dogName);
        Dog myPet2 = new Dog (5, "Dollar",false);
        System.out.println(myPet2.dogName);
    }
}
