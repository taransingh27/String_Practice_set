package question04;

import java.util.Scanner;

public class Question_04 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine();
        str1 = str1.toLowerCase();
        int length = str1.length();
        for (int i = 0; i < length; i++) {
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' ||
                    str1.charAt(i) == 'u') {
                for (int j = 1; j < length; j += 3) {
                    if (i == j) {
                        System.out.println(str1.replaceAll("[aeiou]", "*"));
                    }
                }
                for (int k = 2; k < length; k += 3) {
                    if (i == k) {
                        System.out.println(str1.replaceAll("[aeiou]", ""));
                    }
                }
                for (int l = 3; l < length; l += 3) {
                    if (i == l) {
                        System.out.println(str1.replaceAll("[aeiou]", "!"));
                    }
                }
            }
        }
    }
}





