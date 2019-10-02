package question09;

import java.util.Scanner;

public class Question_09 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine();
        int l = str1.length();
        int s = 0;
        int j = 0;
        for (int i = 0; i < l; i++) {
            if (str1.charAt(i) >= 65 && str1.charAt(i) <= 90) {
                s = s + str1.charAt(i);
            } else if (str1.charAt(i) >= 97 && str1.charAt(i) <= 122) {
                j = j + str1.charAt(i);
            }
        }
        if (s > j)
            System.out.println(s - j);
        else
            System.out.println(j - s);
    }
}
