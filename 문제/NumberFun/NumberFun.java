package 문제.NumberFun;

// Ms. Greene is trying to design a game for her third-grade class to practice their addition, subtraction, multiplication, and division.
// She would like for every student in her class to be able to "think mathematically" and determine
// if any two given numbers can be added, subtracted, multiplied, or divided in any way to produce a third given number.
// However, she would like to be able to check her students' work quickly without having to think about it herself.
// Help Ms. Greene by writing a program that inputs two given numbers and determines whether or not it is possible to add, subtract, multiply,
// or divide those two numbers in any order to produce the third number.
// Only one operation may be used to produce the third number.

// 입력
// Each input file will start with a single integer N (1 <= N <= 10000) denoting the number of test cases.
// The following N lines will contain sets of 3 numbers a, b, c (1 <= a, b, c <= 10000).

// 출력
// For each test case, determine whether or not it is possible to produce the third number,
// c, using the first two numbers, a and b, using addition, subtraction, multiplication, or division.

// 입력
// 6
// 1 2 3
// 2 24 12
// 5 3 1
// 9 16 7
// 7 2 14
// 12 4 2

// 출력
// Possible
// Possible
// Impossible
// Possible
// Possible
// Impossible

import java.util.Scanner;

public class NumberFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            boolean possible = false;

            if (a + b == c || a - b == c || b - a == c || a * b == c) {
                possible = true;
            } else if (b != 0 && a % b == 0 && a / b == c) {
                possible = true;
            } else if (a != 0 && b % a == 0 && b / a == c) {
                possible = true;
            }

            if (possible) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }
}
