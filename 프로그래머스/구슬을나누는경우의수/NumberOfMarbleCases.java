package 프로그래머스.구슬을나누는경우의수;

import java.util.Scanner;

public class NumberOfMarbleCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balls = sc.nextInt();
        int share = sc.nextInt();

        int result = factorial(balls, share);
        System.out.print(result);
    }
    public static int factorial(int balls, int share) {
        long res = 1;
        int index = 1;

        for(int i = share + 1; i <= balls; i++) {
            res *= i;
            res /= index;
            index++;
        }
        return (int) res;
    }
}
