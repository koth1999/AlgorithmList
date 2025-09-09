package Problem.HOMWRK;

// In one of the beautiful cities of Afghanistan two sisters are going to program a simple game to help them solve their mathematics homework.
// Their homework asks them to calculate the sum and multiplication of two numbers.
// Your task is to help them to build a simple program for their homework.
// 입력
// First line contains the number of test cases (T).
// T test cases follow. For each test case, the first line represents the number of problems.
// Next N lines contains two integer numbers Ai, Bi.

// 출력
// For every input expecting two integer numbers,
// first one represents the addition of two given numbers and second represents the multiplication separated by space.

// 제한
// 1 ≤ T ≤ 10
// 1 ≤ N ≤ 50
// 0 ≤ Ai, Bi ≤ 20000

// 입력
// 1
// 2
// 20 30
// 40 60

// 출력
// 50 600
// 100 2400

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();

            for(int j = 0; j < n; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                int sum = a + b;
                int mul = a * b;

                System.out.println(sum + " " + mul);
            }
        }
    }
}
