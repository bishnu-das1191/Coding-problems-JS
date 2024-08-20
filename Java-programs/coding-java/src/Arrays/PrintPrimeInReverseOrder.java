package Arrays;

public class PrintPrimeInReverseOrder {
    public static void main(String[] args) {
        int input = 11;

        // print prime numbers in reverse order
        printPrimeNumsInReverseOrder(input); // 7 5 3 2
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

    // print prime numbers in reverse order
    private static void printPrimeNumsInReverseOrder(int num) {

        for (int i = num; i >= 2; i--) {

            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
