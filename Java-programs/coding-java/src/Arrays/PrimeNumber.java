package Arrays;

public class PrimeNumber {
    public static void main(String[] args) {
        // print all prime numbers till the input number

        int input = 11;

        // check if given number is prime or not
        System.out.println(isPrime(input)); // false

        // print prime numbers till given number
        // printPrimeNums(input); // 2 3 5 7

        // print prime number till
        // printPrimeNumsInReverseOrder(input); // 7 5 3 2
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

    // print prime numbers in reverse order
    private static void printPrimeNumsInReverseOrder(int num) {

        for (int i = num; i >= 2; i--) {

            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

}
