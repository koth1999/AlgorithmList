package Problem.단어의개수;

// 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
// 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

// 입력
// 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다.
// 단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.

// 출력
// 첫째 줄에 단어의 개수를 출력한다.

// 입력 : The Curious Case of Benjamin Button
// 출력 : 6

import java.util.Scanner;

public class NumberOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().trim();

        // 입력 문자열이 공백인 경우 단어는 없으므로 0 출력
        if (word.isEmpty()) {
            System.out.println(0);
            return;
        }

        int wordCnt = 1; // 단어의 개수를 세는 변수, 최소한 한 단어는 존재

        // 공백을 기준으로 단어의 개수를 센다
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                wordCnt++;
            }
        }

        System.out.println(wordCnt);
    }
}
