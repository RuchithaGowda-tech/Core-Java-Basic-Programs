package CoreJava;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String reverse = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}