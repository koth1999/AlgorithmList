package 문제.DivideAndConquer;

// Given two integers M and N, with 1 ≤ M ≤ N ≤ 5000,
// you must determine the integer numbers X and Y such that
// A. M ≤ X ≤ N; and
// B. Y is the number of divisors of X; and
// C. Y is the largest possible; and
// D. X is the largest possible.

// 입력
// Your program should process several test cases.
// Each test case is composed by a single line contain- ing the two integers M and N (1 ≤ M ≤ N ≤ 5000).
// The end of input is indicated by M = N = 0.
// The input must be read from standard input.

// 출력
// For each test case in the input your program should print a single line,
// containing the two integers X and Y, separated by a space character.
// The output must be written to standard output.

// 예제 입력
// 1 5
// 300 500
// 4500 5000
// 0 0

// 예제 출력
// 4 3
// 480 24
// 4680 48

import java.util.Scanner;

public class DivideAndConquer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int m = sc.nextInt();
            int n = sc.nextInt();

            if (m == 0 && n == 0) {
                break;
            }

            int max = 0;
            int maxCnt = 0;

            for (int i = m; i <= n; i++) {
                int divisors = countDivisors(i);

                if (divisors > maxCnt) {
                    maxCnt = divisors;
                    max = i;
                } else if (divisors == maxCnt && i > max) {
                    max = i;
                }
            }

            System.out.println(max + " " + maxCnt);
        }
    }

    // 약수의 개수를 세는 함수
    public static int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}
