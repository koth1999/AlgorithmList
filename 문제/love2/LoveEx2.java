package 문제.love2;

// 영어 문장이 입력된다. 그 문장에서 "love"가 몇 번 나오는지 출력하시오.

// 입력 : love lovely
// 출력 : 2

import java.util.Scanner;

public class LoveEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] word = str.toCharArray();
        int cnt = 0;

        for(int i=0; i<word.length; i++) {
            if(i!=word.length-3)
                // 현재 인덱스 i가 word 배열의 길이에서 3을 뺀 값과 같지 않을 때 조건문 내부를 실행하고,
                // 이 조건은 "love"가 배열 끝에 위치하는 경우를 방지하기 위한 것이다.
                if(word[i]=='l')
                    if(word[i+1]=='o')
                        if(word[i+2]=='v')
                            if(word[i+3]=='e') cnt++;
        }
        System.out.print(cnt);
    }
}
