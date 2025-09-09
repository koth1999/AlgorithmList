package Problem.문자열비교;

// 사용자에 의해 두 개의 문자열을 입력한다.
// 처음부터 두 개의 문자열을 비교하여 공통의 글자가 몇 개인지 확인한다.
// 공통 부분 문자열과 그 길이를 출력한다.
// 부분 문자열이 없으면 "No CS"로 인쇄하고 0을 길이로 출력한다.

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int cnt = 0;

        for(int i=0; i<a.length(); i++) {
            if(a.charAt(i) == b.charAt(i)) {
                System.out.print(a.charAt(i));
                cnt++;
            }else break;
        }
        System.out.println();

        if(cnt != 0) System.out.println();
        else System.out.print("No CS");
    }
}
