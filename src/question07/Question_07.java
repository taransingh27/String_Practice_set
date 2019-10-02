package question07;

import java.util.Scanner;

public class Question_07 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine();
        int length = str1.length();
        int s = 0;
        for (int i = 0; i < length; i++) {
            s = s + str1.charAt(i);
        }
        System.out.println(s);
    }

}
