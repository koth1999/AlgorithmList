package 문제.X보다작은수;

// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
// 이때 A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

// 입력 : 10 5
//       1 10 4 9 2 3 8 5 7 6
// 출력 : 1 4 2 3

import java.util.Scanner;

public class LessX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]<x) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
