package Problem.StringKMP;

import java.util.Scanner;


// split() 메소드 이용
public class StringKMPEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] word = str.split("-");

        for(String e : word) {
            System.out.print(e.charAt(0));
        }
    }
}
