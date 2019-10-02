package question11;

import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter string and character you want to check and count");
        String str1 = obj.nextLine();
        char char1 = obj.nextLine().charAt(0);
        int length = str1.length();
        for (int i = 0; i < length; i++) {
            if (str1.charAt(i) == char1) {
                System.out.println(i);
            }
        }
    }
}

