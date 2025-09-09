package Problem.Welcome;

// 당신은 웹사이트 제작자이다. ID를 입력하고 엔터를 누르면 환영 메세지를 띄우려고 한다. ID가 "anaki"인 경우
// "welcome! anaki"를 출력한다.

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] word = str.toCharArray();
        System.out.print("welcome! ");

        for(int i=0; i<word.length; i++) {
            System.out.print(word[i]);
        }
    }
}
