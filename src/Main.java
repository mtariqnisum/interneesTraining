import java.util.Arrays;

public class Main {

    public static void doNothing() {
        System.out.println("Doing nothing!");
    }

    public static void main(String[] args) {
        String message= "Hello \nNisum";
        System.out.println(message);

        // Arrays practis

        int[] numbers={2,1,4,5,4};
        System.out.println("Length of an array");
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(numbers));

        //Multi dimensional Array

        int [] num = {1,7,3,4,7,9,10};
        //System.out.println(Arrays.deepToString(num));
        for (int j : num) {
            System.out.println(j);
        }



        int[] numb = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;

        // add each element in sum
        for (int number: numb) {
            sum += number;
        }
        // get the total number of elements
        int arrayLength = numb.length;

        // calculate the average
        // convert the average from int to double
        average =  ((double)sum / (double)arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }



}

//Strings


