package gettersetter ;
public class Bank {
    public String name;
    private int balance;
    private String id;


    public Bank(String inputName, int inputBalance, String inputId) {
        name = inputName;
        balance = inputBalance;
        id = inputId;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getName () {
        return this.name;
    }
    public String getId(){
        return this.id;
    }



    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }
    public void setName(String newName){
        this.name = newName;
    }
//   SYNTEX OF GETTER
//    public datatype getVariable(){}
//    return this.variable ;
//
//
//    SYNTEX OF SETTER
//   public void setVariable(DataType newVariable){
//        this.variable = newVariable;      this is used for setting the new value in place of old value


}

