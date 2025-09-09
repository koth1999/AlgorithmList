package Problem.행렬곱셈;

// N*M크기의 행렬 A와 M*K크기의 행렬 B가 주어졌을 때, 두 행렬을 곱하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 행렬 A의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 순서대로 주어진다. 그 다음 줄에는 행렬 B의 크기 M과 K가 주어진다. 이어서 M개의 줄에 행렬 B의 원소 K개가 차례대로 주어진다. N과 M, 그리고 K는 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

// 출력
// 첫째 줄부터 N개의 줄에 행렬 A와 B를 곱한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.

// 입력
// 3 2
// 1 2
// 3 4
// 5 6
// 2 3
// -1 -2 0
// 0 0 3

// 출력
// -1 -2 6
// -3 -6 12
// -5 -10 18

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 행렬의 크기 입력
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 첫 번째 행렬 입력
        int[][] arr1 = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // 두 번째 행렬의 크기 입력
        int x = sc.nextInt();
        int k = sc.nextInt();

        // 두 번째 행렬 입력
        int[][] arr2 = new int[x][k];
        for(int i = 0; i < x; i++) {
            for(int j = 0; j < k; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // 두 행렬 곱셈 결과 계산
        if (m != x) {
            System.out.println(0);
            return;
        }

        int[][] result = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < m; l++) {
                    result[i][j] += arr1[i][l] * arr2[l][j];
                }
            }
        }

        // 행렬 곱셈 결과 출력
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < k; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
