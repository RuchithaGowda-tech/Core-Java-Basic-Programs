package CoreJava;

import java.util.Scanner;

public class NonRepeated {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        int[] count = new int[256];

        // Count each character
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        // Print characters which occur only once
        System.out.print("Non-repeated characters: ");

        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                System.out.print(str.charAt(i));
            }
        }
    }
}