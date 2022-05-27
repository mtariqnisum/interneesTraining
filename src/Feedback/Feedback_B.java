package Feedback;

import java.util.Scanner;

public class Feedback_B {

        private String str2="";

        public Feedback_B() {
            takeString();

        }
        private void takeString()
        {
            Scanner sc= new Scanner(System.in); //System.in is a standard input stream
            System.out.print("Please Enter Your Feedback.Feedback_B:");
            str2= sc.nextLine();              //reads string
        }
        public String getString() {
            return str2;

        }
}





