package Problem.JOI와IOI;

// 입력으로 주어지는 문자열에서 연속으로 3개의 문자가 JOI 또는 IOI인 곳이 각각 몇 개 있는지 구하는 프로그램을 작성하시오.
// 문자열은 알파벳 대문자로만 이루어져 있다. 예를 들어, 아래와 같이 "JOIOIOI"에는 JOI가 1개, IOI가 2개 있다.

// 입력
// 첫째 줄에 알파벳 10000자 이내의 문자열이 주어진다.

// 출력
// 첫째 줄에 문자열에 포함되어 있는 JOI의 개수, 둘째 줄에 IOI의 개수를 출력한다.

import java.util.Scanner;

public class JOIAndIOI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int cnt1 = 0;
        int cnt2 = 0;

        // 문자열을 반복해서 검사
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("JOI")) {
                cnt1++;
            }
            if (str.substring(i, i + 3).equals("IOI")) {
                cnt2++;
            }
        }

        System.out.println(cnt1);
        System.out.println(cnt2);
    }
}
