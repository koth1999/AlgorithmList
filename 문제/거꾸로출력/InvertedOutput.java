package 문제.거꾸로출력;

// 데이터의 개수가 n개가 들어오고, n개의 데이터를 거꾸로 출력하는 프로그램을 작성하시오.

// 입력 : 5
//       1 3 4 5 8
// 출력 : 8 5 4 3 1

import java.util.Scanner;

public class InvertedOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
