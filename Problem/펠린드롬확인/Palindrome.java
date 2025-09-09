package Problem.펠린드롬확인;

// 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
// 팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
//level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.

// 입력
// 첫째 줄에 단어가 주어진다. 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.

// 출력
// 첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        boolean isPalindrome = isPalindrome(word);

       if(isPalindrome) {
           System.out.println("1");
       }else {
           System.out.println("0");
       }
    }
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while(left < right) {
            if(word.charAt(left) != word.charAt(right)) {
                return false; // 양쪽 끝이 다르면 false
            }
            left++;
            right--;
        }
        return true; // 같으면 true
    }
}
