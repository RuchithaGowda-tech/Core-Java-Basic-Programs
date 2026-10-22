package CoreJava;

public class Armstrong {
    
    static boolean isArmstrong(int num) {

        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit * digit * digit;
            num = num / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        System.out.println("Armstrong numbers from 1000 to 3000:");

        for (int i = 1000; i <= 3000; i++) {

            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}