package constructor;

public class Dog {
    int dogAge;
    String dogName;
    boolean isAgressive;
    public Dog (int ageOfDog,String nameOfDog, boolean agressiveDog){
        dogAge = ageOfDog;
        dogName = nameOfDog;
        isAgressive = agressiveDog;
        System.out.println("Parameterised constructor");



    }
   public static void main (String[] args){
    }
    public void speak (){
        System.out.println("Hello my pet name is "+ dogName);
    }
    public void setDogAge(){
        System.out.println("Age of my pet "+dogName+ " is " + dogAge +" And yeah..! its " + isAgressive + " that she is a aggressive dog."  );
    }
}
