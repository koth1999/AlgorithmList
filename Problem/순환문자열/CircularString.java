package Problem.순환문자열;

// 영어 소문자로 구성된 단어 S1, S2, S3가 있을 때, S1의 마지막 문자가 S2의 첫 글자와 같고,
// S2의 마지막 글자가 S3의 첫 글자와 같고, S3의 마지막 글자가 S1의 첫 글자와 같으면 순환 문자열이라고 한다.
// 예를 들어 turtle, error, robot인 경우 순환 문자열이다.
// 세 단어가 주어졌을 때 순환 문자열이면 "good"을 출력 아니면 "bad"를 출력한다.

import java.util.Scanner;

public class CircularString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        char[] c = str3.toCharArray();

        if(a[0]==c[c.length-1]) {
            if(b[0]==a[a.length-1]) {
                if(c[0]==b[b.length-1]) {
                    System.out.print("good");
                }else System.out.print("bad");
            }else System.out.print("bad");
        }else System.out.print("bad");
    }
}
