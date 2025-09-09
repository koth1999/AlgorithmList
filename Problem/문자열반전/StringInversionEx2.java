package Problem.문자열반전;

import java.util.Scanner;

public class StringInversionEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int index = str.length();

        while(index > 0) {
            index--;
            System.out.print(str.charAt(index));
        }
    }
}
