package question01;

import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the String");
        String str1 = obj.nextLine();
        int length = str1.length();
        System.out.print("Index: ");
        for (int i = 0; i < length; i++)
            System.out.print(i + "\t");
        System.out.println();
        System.out.print("Chars: ");
        for (int i = 0; i < length; i++) {
            System.out.print(str1.charAt(i) + "\t");
        }

    }

}

