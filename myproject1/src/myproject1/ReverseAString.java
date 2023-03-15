package myproject1;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String originalStr = input.nextLine();
        String reversedStr = reverseString(originalStr);
        System.out.println("Reversed string: " + reversedStr);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}