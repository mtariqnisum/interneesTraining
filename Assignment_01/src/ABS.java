abstract class Person{
    private String name;
    private int acc_Number;
    private int identity_Number;


    public Person(String name,int acc_Number,int identity_Number){
      this.name = name;
      this.acc_Number = acc_Number;
      this.identity_Number = identity_Number;
    }
    // Declaring abstract method
    public abstract void walk() ;
    public String getName(){
    return name;
    }

    public int getIdentity_Number(){
        return identity_Number;
    }

}
public class Employee extends Person {

    public Employee(String name, int acc_Number, int identity_Number) {
        super(name, acc_Number, identity_Number);
    }
    public void walk() {
        System.out.println("Person Detail");
    }

    public static void main(String args[]) {

        Person emp = new Employee("Adam",01001-99991,9901);
        emp.walk();
        System.out.println("Employee"+emp.getName());

    }
}



