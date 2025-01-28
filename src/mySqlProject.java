import java.util.Scanner;

public class mySqlProject { public static void main(String[] args) {
    System.out.println("Welcome to My HelpLine");
        Scanner name = new Scanner(System.in);
        System.out.println("Give me the name of the formulae you want to remember".toUpperCase());
        int a = name.nextInt();
        if (a == 1){
            System.out.println("CREATE TABLE employees (\n" +
                    "    id INT PRIMARY KEY,\n" +
                    "    name VARCHAR(100),\n" +
                    "    age INT,\n" +
                    "    salary DECIMAL(10, 2)\n" +
                    ");\n");
        }else if (a == 2){
            System.out.println("Insert into Table_name (column ,column_two) \n  values ();");
        }else if (a == 3){
            System.out.println("Select * from table_name");
            System.out.println("Select column ,column_two");
        }else if (a == 4){
            System.out.println("Alter Table_name \n set column = value \n where column = value;" );
        }else if (a == 5) {
            System.out.println(" SELECT column1, column2 ");
            System.out.println(" FROM table_name");
            System.out.println(" ORDER BY column1 ASC|DESC");
        }else if (a== 6) {
            System.out.println("SELECT name, salary FROM employees ORDER BY salary DESC;");
        }else if (a== 7){
            System.out.println("NUPDATE table_name\n" +
                    "SET column1 = value1, column2 = value2, ...\n" +
                    "WHERE condition;\n");
        }else if (a== 8){
            System.out.println("DELETE FROM table_name\n" +
                    "WHERE condition;\n");
            System.out.println("Example".toUpperCase());
            System.out.println("DELETE FROM employees \n WHERE age < 25;");
        }else if (a== 9) {
            System.out.println("SELECT columns\n" +
                    "FROM table1\n" +
                    "INNER JOIN table2 ON table1.column = table2.column;\n");
        } else if (a==10) {
            System.out.println("SELECT column1, COUNT(*)\n" +
                    "FROM table_name\n" +
                    "GROUP BY column1;\n");
            System.out.println("Example".toUpperCase());
            System.out.println("SELECT department_id, COUNT(*) \n" +
                    "FROM employees \n" +
                    "GROUP BY department_id;\n");
         }else{
            System.out.println("Na");}


}
}