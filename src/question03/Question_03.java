package question03;

import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a string and the character you want to replace and by which character");
        String s1 = obj.nextLine();
        char char1 = obj.next().charAt(0);
        char char2 = obj.next().charAt(0);
        s1 = s1.replace(char1, char2);
        System.out.println(s1);
    }
}
