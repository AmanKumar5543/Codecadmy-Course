package inheritence;

public class Parent {
    protected int height ;
    protected String colorOfEyes ;
    protected String shapeOfNose;
    protected boolean sameSmile = true ;

    public Parent (int height,String colorOfEyes,String shapeOfNose){
         this.height = height;
         this.colorOfEyes = colorOfEyes;
         this.shapeOfNose =shapeOfNose;
    }

    public static void main(String[] args) {
        Parent myDad = new Parent(6,"black", "long");
        System.out.println(myDad.colorOfEyes);
    }
}
