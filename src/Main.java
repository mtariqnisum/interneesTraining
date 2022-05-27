import Feedback.Feedback_A;
import Feedback.Feedback_B;
import Feedback.Feedback_C;

public class Main {

    public static void main(String args[]){
        Feedback_A feedback_a=new Feedback_A();
        Feedback_B feedback_b=new Feedback_B();
        Feedback_C feedback_c=new Feedback_C();
        System.out.println("Your Final Feedback Respectively:"+feedback_a.getString()+","+feedback_b.getString()+","+feedback_c.getString()+".");

    }
 }



