package Problem.SpiralWalk;

// 나선형 알고리즘

// Oh how the cows love to walk in their square pasture with sides of length N (1 <= N <= 750) and which is partitioned into N*N squares.
// They enjoy the sights, the smells, and the general ambience of the grass and trees.
// Bessie has decided to take the cows on the longest possible walk from the upper left corner to the center (or near the center when N is even) of the pasture,
// passing through each and every square along the way after starting.
// She has decided to create the obvious clockwise spiral route (example below) for this evening's stroll.
// Write a program to create a map for her that shows the order of squares she should visit.
// By way of example, for pastures of size N=3 and N=4, here are the routes Bessie should use:
//      1  2  3        1  2  3  4
//      8  9  4       12 13 14  5
//      7  6  5       11 16 15  6
//                    10  9  8  7

// 입력
// Line 1: A single integer: N

// 출력
// Lines 1..N: N space-separated integers

// 입력 : 3

// 출력 : 1 2 3
//       8 9 4
//       7 6 5

import java.util.Scanner;

public class SpiralWalk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printSquare(n);
    }
    public static void printSquare(int n) {
        int[][] square = new int[n][n];
        int value = 1;
        int top = 0, left = 0;
        int bottom = n - 1, right = n - 1;

        while (value <= n * n) {
            for (int i = left; i <= right; i++) {
                square[top][i] = value++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                square[i][right] = value++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                square[bottom][i] = value++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                square[i][left] = value++;
            }
            left++;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }
}
