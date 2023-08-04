import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        //1. R2H Version
////        public static void main(String[] args) {
//            int number = 5;
//            int result = Factorial.factorial(number);
//            System.out.println("Factorial of " + number + " is: " + result);
//        }
//    }

        //1. My Version
        int n = 5; // the integer that will be passed
        // as an argument through the method
        //capture the result of the method in a variable
        int factorialResult = Factorial.factorial(n);
        // console log the captured result with added text for comprehension
        System.out.println("This is Problem 1!");
        System.out.println("Factorial of " + n + " is: " + factorialResult + " :)");

        //2.
        //declare the number we want to check in our class's method
        System.out.println("This is Problem 2!");
        int number = 17;
        // Class needed to be invoked first before using its method 'primeNumber before .isPrime(number)
        if (primeNumber.isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        //3.
        //
        System.out.println("This is Problem 3!");
        int[] numbers = {5, 2, 8, 1, 9};
        Arrays.sort(numbers);
        System.out.print("Sorted Array: ");
        for (int numbern : numbers) {
            System.out.print(numbern + " ");
        }

    }
}
