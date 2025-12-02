package extras.exceptions;

public class probleum01 {
    public static int divide(int a , int b){
        return a/b;
    }
    public static void main(String[] args) {
        int[] numerator = {10,200,30,40};
        int[] denominator = {1,2,0,4};

        for (int i = 0; i < numerator.length ; i++) {
            System.out.println(divide(numerator[i],denominator[i]));

        }

        // Exception is statement which stops the actual flow of execution of program.
        // errors types
        // syntax
        // logical
        // runtime error
        // The exception handling is a way to handle the runtime errors so that the normal flow of the
        // application can be maintained.
        //
        // Exception is an event that disrupts the normal flow of the program . it is an object
        // which is thrown at runtime.


        System.out.println("Good Job !");
    }

}
