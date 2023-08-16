package 문제.StringKMP;

import java.util.Scanner;

// charAt() 메소드를 이용해 대문자만 추출
public class StringKMPEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
                System.out.print(str.charAt(i));
            }
        }
    }
}
