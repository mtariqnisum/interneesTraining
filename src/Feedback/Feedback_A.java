package Feedback;
import java.util.*;
public class Feedback_A {
    private String str1="";
    public Feedback_A() {
       takeString();
    }
    private void takeString() {
            Scanner sc= new Scanner(System.in); //System.in is a standard input stream
            System.out.print("Please Enter Your Feedback.Feedback_A:");
            str1= sc.nextLine();              //reads string
    }
        public String getString() {
          return str1;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }
}

