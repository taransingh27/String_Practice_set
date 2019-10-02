package question02;

import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
        System.out.println("Enter a String and indexes:");
        Scanner obj = new Scanner(System.in);
        String Str1 = obj.nextLine();
        int lowerIndex = obj.nextInt();
        int upperIndex = obj.nextInt();
        System.out.println(Str1.substring(lowerIndex, upperIndex));
    }
}

