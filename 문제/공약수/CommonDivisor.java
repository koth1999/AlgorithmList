package 문제.공약수;

// 자연수 n개가 주어진다. 이 자연수의 공약수를 모두 구하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 n이 주어진다. n은 2 또는 3이다. 둘째 줄에는 공약수를 구해야 하는 자연수 n개가 주어진다. 모든 자연수는 10^8 이하이다.

// 출력
// 입력으로 주어진 n개 수의 공약수를 한 줄에 하나씩 증가하는 순서대로 출력한다.

// 입력
// 2
// 75 125

// 출력
// 1 5 25

import java.util.Scanner;

public class CommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 입력된 숫자들을 배열에 저장
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 첫 번째 숫자를 기준으로 최대공약수를 구함
        int gcd = arr[0];
        for (int i = 1; i < n; i++) {
            gcd = findGCD(gcd, arr[i]);
        }

        // 최대공약수의 약수들을 출력
        for (int i = 1; i <= gcd; i++) {
            if (gcd % i == 0) {
                System.out.println(i);
            }
        }
    }

    // 최대공약수를 구하는 메소드
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
