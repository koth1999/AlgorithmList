package Problem.도비의영어공부;

// 꿍은 도비의 자유를 위해 영어를 가르치기로 결심했다. 하지만 도비는 바보라 ABC부터 배워야 한다.
// 그래서 꿍은 영어 문장과 알파벳 하나가 주어지면 그 알파벳이 문장에서 몇 번 나타나는지를 세는 문제들을 내주었다.
// 하지만 도비는 마법사고 컴공도 마법사다.
// 여러분은 도비를 위해 문제의 답을 알려주는 프로그램을 만들수 있을것이다!

// 입력
// 입력은 몇 개의 줄들로 이루어진다.
// 각 줄에는 하나의 소문자와 영어 문장이 공백으로 구분되어 주어진다.
// 각 문장은 길이가 1에서 250이며 입력의 마지막은 #이다.

// 출력
// 출력의 각 줄은 입력으로 주어진 소문자와 그 소문자 알파벳이 나타난 횟수로 이루어진다.
// 이때 문장에서 해당 알파벳이 소문자로 나타나던 대문자로 나타나던 모두 세야 한다.

// 입력
// g Programming Contest
// n New Zealand
// x This is quite a simple problem.
// #

// 출력
// g 2
// n 2
// x 0

import java.util.Scanner;

public class DobbyEnglish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String word = sc.next();

            // 종료 조건 확인
            if (word.equals("#")) {
                break;
            }

            String sentence = sc.nextLine().trim().toLowerCase(); // 문장을 소문자로 변환

            word = word.toLowerCase(); // 대소문자를 구분하지 않기 위해 단어를 소문자로 변환

            int cnt = 0;
            int index = 0;

            // 단어가 문장 안에 있는지 확인하고, 모든 발생을 세기
            while ((index = sentence.indexOf(word, index)) != -1) {
                cnt++;
                index += word.length(); // 현재 단어 다음 위치로 이동
            }

            System.out.println(word + " " + cnt);
        }
    }
}
