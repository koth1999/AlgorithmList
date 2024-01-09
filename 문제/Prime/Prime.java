package 문제.Prime;

// A prime number is a natural number which has exactly two distinct natural number divisors: 1 and itself.
// The first prime number is 2. Can you write a program that computes the nth prime number, given a number n ≤ 10000?

// 입력
// The input contains just one number which is the number n as described above. The maximum value of n is 10000.

// 출력
// The output consists of a single integer that is the nth prime number.

// 입력 : 30
// 출력 : 113

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int num = 2;

        // cnt가 n보다 작을 때
        while (cnt < n) {
            if (isPrime(num)) {
                cnt++;
                if (cnt == n) {
                    System.out.println(num);
                    break;
                }
            }
            num++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
