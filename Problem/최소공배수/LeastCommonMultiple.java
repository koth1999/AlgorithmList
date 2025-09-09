package Problem.최소공배수;

// 두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다.
// 이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다. 예를 들어, 6과 15의 공배수는 30, 60, 90등이 있으며, 최소 공배수는 30이다.
// 두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스 개수

        for(int i=0; i<t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int min = (a * b) / gcd(a,b);
            System.out.println(min);
        }
    }
    public static int gcd(int a, int b) {
        while(b!=0) { // b가 0이 아닐때까지 반복
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}
