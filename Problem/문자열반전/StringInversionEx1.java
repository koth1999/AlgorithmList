package Problem.문자열반전;

// 문자열을 입력으로 사용
// 역기능으로 입력 문자열을 반전하여 출력한다.
// 역함수를 만들어야 한다.

import java.util.Scanner;

public class StringInversionEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i=str.length()-1; i>=0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
