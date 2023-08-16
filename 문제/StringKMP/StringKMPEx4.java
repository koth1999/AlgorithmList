package 문제.StringKMP;

import java.util.Scanner;

// 0번째 문자 이용
public class StringKMPEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i=0; i<str.length(); i++) {
            if(i==0) System.out.print(str.charAt(i));
            else if(str.charAt(i)=='-') {
                System.out.print(str.charAt(i+1));
            }
        }
    }
}
