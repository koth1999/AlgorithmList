package Problem.Divisors;

// Given an integer n, compute the number of divisors of n.
// A divisor is an integer, d (1 <= d <= n) that evenly divides n.
// Example: If n=10, divisors are: 1, 2, 5 and 10. So the result would be 4.
// Example: If n=104717, divisors are 1 and 104717. This is a prime number so the number of divisors is 2.

// 입력
// The first line contains an integer C (1 <= C <= 10) with the amount of numbers you need to process.
// The next C lines will contain an integer n (1 <= n < 10000) each. You have to compute the number of divisors of these values.

// 출력
// For each integer n, print a line with the number n itself, a space and the number of divisors.

// 입력
// 10
// 1
// 2
// 3
// 4
// 5
// 9999
// 31
// 10
// 20
// 1047

// 출력
// 1 1
// 2 2
// 3 2
// 4 3
// 5 2
// 9999 12
// 31 2
// 10 4
// 20 6
// 1047 4

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int cnt = 0;

            for(int j = 1; j <= num; j++) {
                if(num % j == 0) cnt++;
            }
            System.out.println(num + " " + cnt);
        }
    }
}
