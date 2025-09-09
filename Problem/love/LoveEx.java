package Problem.love;

// 영단어 하나가 입력된다.
// 그 단어가 "love"이면 "I love you."를 출력

import java.util.Scanner;

public class LoveEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if(str.equals("love")) {
            System.out.print("I love you.");
        }else{
            System.out.print("No");
        }
    }
}
