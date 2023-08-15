package 문제.대소문자;

// 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로
// 바꾸어 출력하는 프로그램을 작성하시오.

// 입력 : WrongAnswer
// 출력 : wRONGaNSWER

import java.util.Scanner;

public class LowerUpperEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch;

        for(int i=0; i<str.length(); i++) {
            ch = str.charAt(i);
            if(ch<'a') System.out.print((char)(ch+('a'-'A')));
            else System.out.print((char)(ch-('a'-'A')));
        }
    }
}
