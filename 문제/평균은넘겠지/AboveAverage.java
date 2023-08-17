package 문제.평균은넘겠지;

// 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.

// 5
// 5 50 50 70 80 100
// 7 100 95 90 80 70 60 50
// 3 70 90 80
// 3 70 90 81
// 9 100 99 98 97 96 95 94 93 91

// 출력
// 40.000%
// 57.143%
// 33.333%
// 66.667%
// 55.556%

import java.util.Scanner;

public class AboveAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCnt = sc.nextInt();
        double[] rst = new double[testCnt];

        for(int i=0; i<rst.length; i++) {
            rst[i] = overRate();
        }

        for(double e : rst) {
            System.out.printf("%.3f%%\n", e);
        }
    }
    static double overRate() {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] score = new int[cnt];
        int sum = 0;
        int overCnt = 0;

        for(int i=0; i<score.length; i++) {
            score[i] = sc.nextInt();
            sum += score[i];
        }

        double aver = (double)sum/cnt;

        for(int e : score) {
            if(e>aver) overCnt++;
        }
        return (double)overCnt/cnt*100;
    }
}
