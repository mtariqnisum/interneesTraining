package Feedback;
import java.util.Scanner;
public class Feedback_C {
    private String str3="";
    public Feedback_C() {
        takeString();
    }
    private void takeString() {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Please Enter Your Feedback.Feedback_C:");
        str3= sc.nextLine();              //reads string
    }
    public String getString() {
        return str3;

    }
}
