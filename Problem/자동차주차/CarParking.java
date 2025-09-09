package Problem.자동차주차;

// 같은 차종의 빨간색 자동차 A대, 초록색 자동차 B대, 파란색 자동차 C대를 N칸의 주차장에 1대씩 주차하려고 한다.
// 모든 자동차를 한 칸에 한 대씩 주차할 수 있는 경우의 수를 구하라.

// 입력
// 첫 번째 줄에 양의 정수 N, A, B, C가 공백으로 구분되어 주어진다.

// 출력
// 첫 번째 줄에 정답을 출력한다.

// 제한
// A+B+C = N <= 15

// 입력 : 7 2 2 3
// 출력 : 210

import java.util.Scanner;

public class CarParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        System.out.println(fact(a) / fact(b) / fact(c) / fact(d));
    }
    public static long fact(long x) {
        if(x == 0) return 1;
        return x * fact(x - 1);
    }
}
