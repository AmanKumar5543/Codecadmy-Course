package ifelse;

public class IfElse {
    int x ;
    String name ;
    boolean isIterable = false ;

    public IfElse (int valueX ,String xName){
        x = valueX;
        name = xName;
    }
    public void inc_Xvalue (int incrementXvalue){
        this.x = x + incrementXvalue ;
        this.x = x ;
    }

    public static void main(String[] args) {
        IfElse exampleA = new IfElse(3,"IF");
        IfElse exampleB = new IfElse(56,"ELSE");
        if (exampleB.x>50){
            System.out.println("Niiiiiceeeeeeeeee");
        }else {
            System.out.println("Nooooooo put the value againnnnnnn");
        }
        exampleB.inc_Xvalue(45);
        if (exampleB.x>102){
            System.out.println("Niiiiiceeeeeeeeee");
        }else {
            System.out.println("Nooooooo put the value againnnnnnn");
        }
        System.out.println(exampleB.x);
        System.out.println(exampleB.x);

        if (exampleB.isIterable){
            System.out.println("Good the programme is iterable");
        }else {
            System.out.println("Bad the programme is not iterable at all");
        }
        System.out.println(exampleB.x);
    }


}
