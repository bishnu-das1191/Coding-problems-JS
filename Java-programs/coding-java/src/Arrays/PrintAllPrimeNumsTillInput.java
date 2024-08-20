package Arrays;

public class PrintAllPrimeNumsTillInput {
    public static void main(String[] args) {
        // print all prime numbers till the input number

        int input = 11;

        // print prime numbers till given number
        printPrimeNums(input); // 2 3 5 7

    }

     // check if given number is prime or not
     private static boolean isPrime(int num) {

        if (num < 2)
            return false;

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }


    // print prime number till the input number
    private static void printPrimeNums(int num) {

        if (num < 2) {
            System.out.println("Invalid Input");
        }

        for (int i = 2; i <= num; i++) {

            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
