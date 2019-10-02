package question05;

import java.util.Scanner;

public class Question_05 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter string and sub string you want to replace ");
        String str1 = obj.nextLine();
        String str2 = obj.nextLine();
        String str3 = obj.nextLine();
        String newString = str1.replace(str2, str3);
        System.out.println("new string: " + newString);

    }
}
