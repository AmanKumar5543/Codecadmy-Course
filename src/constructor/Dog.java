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
}
