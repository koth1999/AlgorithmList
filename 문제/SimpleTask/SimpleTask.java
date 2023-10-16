package 문제.SimpleTask;

// Given a positive integer n, find the odd integer o and the integer p such that n = o2^p.
// Write a program that:
// reads a positive integer n from the standard input,
// computes the odd integer o and the integer p such that n = o2^p,
// writes the result to the standard output.

// 입력
// The first and only line of the input contains exactly one integer n, 1 ≤ n ≤ 10^6.

// 출력
// The output should contain two integers o and p separated by a single space such that n = o2^p.

// 입력 : 24
// 출력 : 3 3

import java.util.Scanner;

public class SimpleTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int p = 0;
        int o = n; // 입력된 정수를 나누면서 감소하는 변수

        while(o  % 2 == 0) {
            o /= 2; // 변수 o를 2로 나눈 값을 다시 변수에 o에 저장, 변수 o를 2의 배수로 나누는 과정
            p++; // 나눈 횟수
        }
        System.out.print(o + " " + p);
    }
}
