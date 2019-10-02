package question10;

import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int s = 0;
        System.out.println("Enter string and character you want check");
        String str1 = obj.nextLine();
        char char1 = obj.nextLine().charAt(0);
        int length = str1.length();
        for (int i = 0; i < length; i++) {
            s = str1.indexOf(char1);
        }
        System.out.println(s);
    }
}
