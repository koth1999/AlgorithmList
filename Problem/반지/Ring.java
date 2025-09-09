package Problem.반지;

// 당신은 N개의 반지를 가지고 있다. 각각의 반지는 대문자 10 문자로 이루어진 문자열이 새겨져 있다.
// 반지는 문자열의 시작과 끝이 연결된 형태로 문자가 새겨져 있다. 반지에 각인된 문자열을 거꾸로 읽는 걱정은 없다.
// 찾고자하는 문자열이 주어졌을 때 그 문자열을 포함하는 반지가 몇 개인지를 발견하는 프로그램을 작성하라.

// 입력
// 입력은 총 2 + N 줄 이다.
// 첫 번째 줄에는 1 자 이상 10 자 이하의 대문자로 구성된 찾고자 하는 문자열이 적혀있다.
// 두 번째 줄에는 반지의 개수 N (1 ≦ N ≦ 100)이 적혀있다.
// 2+i 줄(1 ≦ i ≦ N)엔 i개의 반지에 새겨져있고, 10 문자로 이루어진 문자열이 적혀있다.

// 출력
// 찾고자하는 문자열을 포함 반지의 개수를 나타내는 정수를 한 줄로 출력하라.

// 입력
// ABCD
// 3
// ABCDXXXXXX
// YYYYABCDXX
// DCBAZZZZZZ

// 출력 : 2


import java.util.Scanner;

public class Ring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ringName = sc.next();
        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String ring = sc.next(); // 반지 문자열을 하나의 문자열로 읽음

            if (isSubring(ring, ringName)) { // 찾고자 하는 문자열이 반지에 포함되어 있는지 확인
                cnt++;
            }
        }
        System.out.print(cnt);
    }

    // 문자열이 시작과 끝이 연결되어 있는지 확인하는 함수
    public static boolean isSubring(String ring, String target) {
        // 반지 문자열을 확장하여 두 번 이어붙임
        String extendedRing = ring + ring;

        // 확장된 문자열에서 찾고자 하는 문자열이 존재하는지 확인
        return extendedRing.contains(target);
    }
}
