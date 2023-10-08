package 문제.순서쌍;

// 순서쌍은 (a, b)으로 나타낸다. 두 순서쌍 (a1, b1)과 (a2, b2)가 두 조건 a1 = a2 와 b1 = b2 를 만족한다면, 두 순서쌍을 같다고 한다.
// 자연수 N이 주어졌을 때, a × b가 N과 같은 서로 다른 순서쌍 (a, b)의 개수를 구하는 프로그램을 작성하시오.
// a와 b는 자연수이어야 한다.

// 입력
// 첫째 줄에 자연수 N (1 ≤ N ≤ 1,000,000,000)이 주어진다.

// 출력
// 첫째 줄에 곱이 N과 같은 서로 다른 순서쌍의 개수를 출력한다.

// 입력 : 10
// 출력 : 4

import java.util.Scanner;

public class OrderedPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                cnt++;
                if (i != n / i) { // i가 n의 약수일 때 i가 n의 제곱근이 아닌 경우 추가로 하나의 약수를 더 세는 역할
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
