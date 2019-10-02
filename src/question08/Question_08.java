package question08;

import java.util.Scanner;

public class Question_08 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine();
        int l = str1.length();
        int s = 0;
        for (int i = 0; i < l; i++) {
            if (str1.charAt(i) >= 65 && str1.charAt(i) <= 90) {
                s = s + str1.charAt(i);
            }
        }
        System.out.println(s);
    }
}
