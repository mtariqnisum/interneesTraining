import java.util.ArrayList;
import java.util.List;

//Encapsulation Task 01
class Student {
    // private field
    private String name;
    private int  age;
    private String rollNumber;

    // getter method

    public String getName(){

        return name;
    }
    // setter method
    public void setName(String name) {
        this.name = name;
    }
    public String getRollNumber(){
        return rollNumber;
    }
    public void setRollNumber(String s){
        this.rollNumber = s;
    }

    public int getAge() {

        return age;
    }
    // setter method
    public void setAge(int age) {

        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<Student>();
        // create an object of Student
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 =new Student();


        // change name using setter
        s1.setName("Ali");
        s2.setAge(20);
        s3.setRollNumber("17-9001");


        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        for(Student student : studentList) {
            student.toString();
        }

        // access name using getter
        System.out.println("My name is:" + s1.getName());

        System.out.print("My Age is:"+ s2.getAge() +"\n" + "MY Roll Number is:" + s3.getRollNumber()+"\n");
    }
}