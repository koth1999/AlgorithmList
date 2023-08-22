package 문제.t찾기;

// 어떤 문자열이 있을 때 문자 t의 위치를 모두 찾아 출력하시오.

// 입력 : test
// 출력 : 1 4

import java.util.Scanner;

public class FindT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] word = str.toCharArray();

        for(int i=0; i<word.length; i++) {
            if(word[i]=='t') System.out.print(i+1+" ");
        }
    }
}
