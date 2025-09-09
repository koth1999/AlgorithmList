package Problem.그룹단어체커;

// 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
// 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고,
// kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
// 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.

// 출력
// 첫째 줄에 그룹 단어의 개수를 출력한다.

// 입력
// 3
// happy
// new
// year

// 출력 : 3

import java.util.Scanner;

public class GroupWordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int cnt = 0;

        for (int i = 0; i < t; i++) {
            String word = sc.next();

            if (isGroupWord(word)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }

    public static boolean isGroupWord(String word) {
        int[] alphabet = new int[26];

        // word의 첫번째 문자를 가져와 preChar에 저장
        char prevChar = word.charAt(0);
        alphabet[prevChar - 'a'] = 1; // 위치를 1로 설정

        // i가 1인 이유는 이미 첫번째 문자를 처리했기 때문
        for (int i = 1; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            if (currentChar != prevChar) {
                if (alphabet[currentChar - 'a'] != 0) {
                    return false;
                } else {
                    alphabet[currentChar - 'a'] = i;
                }
            }

            // prevChar 변수를 currentChar로 업데이트
            prevChar = currentChar;
        }

        return true;
    }
}
