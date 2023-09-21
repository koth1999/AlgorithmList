package 문제.제리와톰;

// 톰은 마트에서 치즈 1kg 을 사서 집으로 돌아왔습니다.
// 그런데 톰이 한눈을 판 사이 제리가 와서 A/B kg 만큼 훔쳐갔습니다.
// 제리가 치즈를 훔쳐 간 후 톰이 가지고 있는 치즈의 무게는 얼마인가요?

// 입력
// 첫 번째 줄에 두 정수 A, B (1 ≤ A < B ≤ 9) 가 주어집니다.

// A와 B는 서로소임이 보장됩니다.

// 출력
// 정답을 기약분수로 표현했을 때 P/Q kg 이라면 첫 번째 줄에 P와 Q를 공백을 사이에 두고 출력합니다.

import java.util.Scanner;

public class JerryAndTom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // A와 B를 입력받음
        int A = sc.nextInt();
        int B = sc.nextInt();

        // 톰이 가지고 있는 치즈의 무게를 계산
        int numerator = B - A; // 분자
        int denominator = B;  // 분모

        // 최대공약수를 구함
        int gcdValue = gcd(numerator, denominator);

        // 기약분수로 만듦
        numerator /= gcdValue;
        denominator /= gcdValue;

        // 결과 출력
        System.out.println(numerator + " " + denominator);
    }

    // 최대공약수를 계산하는 함수
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
