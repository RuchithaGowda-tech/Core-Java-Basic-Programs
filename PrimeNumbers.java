package CoreJava;

public class PrimeNumbers {

    static boolean isPrime(int num) {

        if (num < 2)
            return false;

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int start = 1;
        int end = 50;

        System.out.println("Prime numbers:");

        for (int i = start; i <= end; i++) {

            if (isPrime(i))
                System.out.print(i + " ");
        }
    }
}