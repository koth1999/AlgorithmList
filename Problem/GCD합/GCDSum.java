package Problem.GCD합;

// 양의 정수 n개가 주어졌을 때, 가능한 모든 쌍의 GCD의 합을 구하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 테스트 케이스의 개수 t (1 ≤ t ≤ 100)이 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있다.
// 각 테스트 케이스는 수의 개수 n (1 < n ≤ 100)가 주어지고, 다음에는 n개의 수가 주어진다. 입력으로 주어지는 수는 1,000,000을 넘지 않는다.

// 출력
// 각 테스트 케이스마다 가능한 모든 쌍의 GCD의 합을 출력한다.

// 입력
// 3
// 4 10 20 30 40
// 3 7 5 12
// 3 125 15 25

// 출력
// 70
// 3
// 35

import java.util.Scanner;

public class GCDSum {
    // GCD(최대공약수)를 구하는 함수
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    // 모든 쌍의 GCD의 합을 구하는 함수
    public static long calculateGCDSum(int[] arr, int n) {
        long sum = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int gcd = findGCD(arr[i], arr[j]);
                sum += gcd;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 테스트 케이스의 개수
        while (t-- > 0) {
            int n = sc.nextInt(); // 수의 개수
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); // 수열 입력 받기
            }

            long result = calculateGCDSum(arr, n); // 가능한 모든 쌍의 GCD 합 구하기
            System.out.println(result);
        }
    }
}
