package method;

class Students{
   int rollNo ;
   String name ;
   String gender;
   boolean isAverage;
   int classes ;
   int givenFee;

   public Students(int rollNo,String name,String gender,boolean isAverage,int classes,int givenFee){
       this.rollNo = rollNo;
       this.name = name;
       this.gender = gender;
       this.isAverage = isAverage;
       this.classes = classes;
       this.givenFee = givenFee;

   }
   public void averageStudents(){   //  here we create the method to differentiate between average and other students
       if (this.isAverage){
       System.out.println("This Student is average . Do some hard work");
   }
}
public void sections(){    // here we created a method to  differentiate students on the basis of their gender
       if (this.gender == "male"){  // and send them is boys or gils section
           System.out.println("Add the Student to boys section");
       }else{
           System.out.println("Add the student to Girls section");
       }
}
public void classFee(){    // here we made a method to find the fess of each and every student
    System.out.println("The free of this Student is Rs: " + this.givenFee );
 }
 public void classTeacher(){ // here we created a function to assign class teacher oto the students
       if (classes<=7){    //on the basis of their class and also used a string function here
           System.out.println(("Your class teacher will be Batman").toUpperCase());
       }else{
           System.out.println(("Your class teacher will be Superman ").toUpperCase());
       }
 }
 public void inflation (){
        int newFee =  this.givenFee + 10000;
        this.givenFee = newFee;
 }

public static class School {
    public static void main(String[] args) {
        Students first = new Students(101,"Aman kumar","male",true, 5,3400);
        Students second = new Students(102,"Sahil kumar","male",true,6,4500);
        Students third = new Students(103,"Sameer kumar","male",false,10,6544);
        Students forth = new Students(104,"Yamini Suman","female",false,8,7600);
        Students fifth = new Students(105,"Mrinal kumar","male",false,9,8700);

        System.out.println(("Information about Student number 1").toUpperCase());
        System.out.println(first.name +" "+ first.gender +" "+ first.rollNo );
        first.averageStudents();
        first.sections();
        first.classTeacher();
        first.inflation();
        first.classFee();

        System.out.println(("Information about Student number 2").toUpperCase());
        System.out.println(second.name+ " " + second.gender + "  " + second.rollNo);
        second.averageStudents();
        second.sections();
        second.inflation();
        second.classFee();
        second.classTeacher();

        System.out.println(("Information about Student number 3").toUpperCase());
        System.out.println(third.name+ " " + third.gender + "  " + third.rollNo);
        third.averageStudents();
        third.sections();
        third.classFee();
        third.classTeacher();



    }
}


}
