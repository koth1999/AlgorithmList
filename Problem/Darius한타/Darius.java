package Problem.Darius한타;

// 아무래도 우리 팀 다리우스가 고수인 것 같다. 그의 K/D/A를 보고 그가 [진짜]인지 판별해 보자.
// K + A < D 이거나, D = 0이면 그는 [가짜]이고, 그렇지 않으면 [진짜]이다.

// 가짜이면 "hasu"를 출력, 진짜이면 "gosu"를 출력

// 입력 : 0/5/3        입력 : 12/4/5
// 출력 : hasu         출력 : gosu

import java.util.Scanner;

public class Darius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String[] word = str.split("/");

        int k = Integer.parseInt(word[0]);
        int d = Integer.parseInt(word[1]);
        int a = Integer.parseInt(word[2]);

        if(k + a < d || d == 0) {
            System.out.println("hasu");
        }else{
            System.out.println("gosu");
        }
    }
}
