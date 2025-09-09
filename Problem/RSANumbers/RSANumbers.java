package Problem.RSANumbers;

// When a credit card number is sent through the Internet it must be protected so that other people cannot see it.
// Many web browsers use a protection based on "RSA Numbers."
// A number is an RSA number if it has exactly four divisors.
// In other words, there are exactly four numbers that divide into it evenly.
// For example, 10 is an RSA number because it has exactly four divisors (1, 2, 5, 10).
// 12 is not an RSA number because it has too many divisors (1, 2, 3, 4, 6, 12). 11 is not an RSA number either.
// There is only one RSA number in the range 10...12.

// Write a program that inputs a range of numbers and then counts how many numbers from that range are RSA numbers.
// You may assume that the numbers in the range are less than 1000.

// 입력 : 10 12
// 출력 : The number of RSA numbers between 10 and 12 is 1

import java.util.Scanner;

public class RSANumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;

        for (int i = a; i <= b; i++) {
            int numCnt = countDiv(i);
            if (numCnt == 4) {
                count++;
            }
        }

        System.out.println("The number of RSA numbers between " + a + " and " + b + " is " + count);
    }

    public static int countDiv(int n) {
        int numCnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                numCnt++;
            }
        }
        return numCnt;
    }
}
