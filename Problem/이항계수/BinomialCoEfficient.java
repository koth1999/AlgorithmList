package Problem.이항계수;

// 자연수 N과 정수 K가 주어졌을 때 이항계수를 구하는 프로그램을 작성하시오.

// 이항 계수 : n! / k! * (n-k)!

// 입력 : 5 2
// 출력 : 10

import java.util.Scanner;

public class BinomialCoEfficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int result = factorial(n) / (factorial(k) * factorial(n-k));
        System.out.println(result);
    }
    public static int factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
