public class Emp extends Person {

    public Emp(String name, int acc_Number, int identity_Number) {
        super(name, acc_Number, identity_Number);
    }

    public void walk() {
        System.out.println("Person Detail");
    }

    public static void main(String args[]) {

        Person emp = new Emp("Adam", 01001 - 99991, 9901);
        emp.walk();
        System.out.println("Employee" + emp.getName());

    }
}
