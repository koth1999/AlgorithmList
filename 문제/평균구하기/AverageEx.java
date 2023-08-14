package 문제.평균구하기;

import java.util.Scanner;

public class AverageEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        int sum = 0;

        for(int i=0; i<score.length; i++) {
            score[i] = sc.nextInt();
            if(score[i]<40) score[i] = 40;
            sum += score[i];
        }
        System.out.printf("%.3f", (double)sum/n);
    }
}
