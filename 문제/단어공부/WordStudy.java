package 문제.단어공부;

// 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
// 단, 대소문자와 소문자를 구분하지 않는다.

// 입력 : baaa   출력 : A
// 입력 : baba 출력 : ?

import java.util.Scanner;

public class WordStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int max = 0;
        char result = 0;
        int[] alphabet = new int[26];

        for(int i=0; i<word.length(); i++) {
            if(word.charAt(i)>='A') alphabet[word.charAt(i)-'a']++;
            else alphabet[word.charAt(i)-'A']++;
        }

        for(int i=0; i<alphabet.length; i++) {
            if(alphabet[i]==max) result = '?';
            else if(alphabet[i]>max){
                max = alphabet[i];
                result = (char)('A'+i);
            }
        }
        System.out.print(result);
    }
}
