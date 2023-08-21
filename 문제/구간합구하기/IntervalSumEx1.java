package 문제.구간합구하기;

// 수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.

// 입력 : 5 3
//       5 4 3 2 1
//       1 3
//       2 4
//       5 5
// 출력 : 12 9 1

import java.util.Scanner;

public class IntervalSumEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = 0;

        while(x!=0) {
            int sum = 0;
            left = sc.nextInt();
            right = sc.nextInt();
            for(int i=left-1; i<right; i++) {
                sum += arr[i];
            }
            System.out.println(sum);
            x--;
        }
    }
}
