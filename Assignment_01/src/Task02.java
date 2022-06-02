public class Task02 {

    public static void main(String[] args) {
        Student1 student = Student1.getStudent1();
        student.setName1("David");
        student.setRoll_no(179001);
        System.out.println("Student name: " + student.getName1());
        System.out.println("Student Roll No: " + student.getRoll_no());
    }
}

class Student1{
    private static Student1 student1 = new Student1();
    private String name;
    private int roll_no;
    private Student1(){}

    public static Student1 getStudent1(){
        return student1;
    }

    private Student1(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }

    public String getName1() {
        return name;
    }

    public void setName1(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
}