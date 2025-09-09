package Problem.사분면;

// 2차원 좌표 상의 여러 점의 좌표 (x,y)가 주어졌을 때,
// 각 사분면과 축에 점이 몇 개 있는지 구하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 점의 개수 n (1 ≤ n ≤ 1000)이 주어진다.
// 다음 n개 줄에는 점의 좌표 (xi, yi)가 주어진다. (-10^6 ≤ xi, yi ≤ 10^6)

// 입력
// 5
// 0 0
// 0 1
// 1 1
// 3 -3
// 2 2

// 출력
// Q1: 2
// Q2: 0
// Q3: 0
// Q4: 1
// AXIS: 2

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q1 = 0, q2 = 0, q3 = 0, q4 = 0, axis = 0;

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x > 0 && y > 0) {
                q1++;
            }else if(x < 0 && y > 0) {
                q2++;
            }else if(x < 0 && y < 0) {
                q3++;
            }else if(x > 0 && y < 0) {
                q4++;
            }else {
                axis++;
            }
        }

        System.out.println("Q1 : " + q1);
        System.out.println("Q2 : " + q2);
        System.out.println("Q3 : " + q3);
        System.out.println("Q4 : " + q4);
        System.out.println("AXIS : " + axis);
    }
}
