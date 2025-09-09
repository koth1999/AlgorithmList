package Problem.수학적호기심;
// 두 정수 n과 m이 주어졌을 때, 0 < a < b < n인 정수 쌍 (a, b) 중에서 (a^2+b^2+m)/(ab)가 정수인 쌍의 개수를 구하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
// 각 테스트 케이스는 한 줄로 이루어져 있으며, n과 m이 주어진다.
// 두 수는 0보다 크고, 100보다 작거나 같다.

// 출력
// 각 테스트 케이스마다 문제의 조건을 만족하는 (a, b)쌍의 개수를 출력한다.

// 입력
// 3
// 10 1
// 20 3
// 30 4

// 출력
// 2
// 4
// 5

import java.util.Scanner;

public class MathematicalCuriosity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int cnt = 0;

            for(int a = 1; a < n; a++) {
                for(int b = a + 1; b < n; b++) {
                    int x = a * a + b * b + m; // 분자
                    int y = a * b; // 분모

                    if(x % y == 0) {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
