package 문제.숫자로테이션;

// n개의 숫자를 왼쪽으로 하나씩 돌려서 출력하시오.
// ex) 1 2 3 4 5가 입력된 경우,
// 1 2 3 4 5
// 2 3 4 5 1
// 3 4 5 1 2
// 4 5 1 2 3
// 5 1 2 3 4

// 입력 : 5
//       1 2 3 4 5
// 출력 : 1 2 3 4 5
//       2 3 4 5 1
//       3 4 5 1 2
//       4 5 1 2 3
//       5 1 2 3 4

import java.util.Scanner;

public class NumberRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                System.out.print(arr[j]+" ");
            }
            for(int j=0; j<i; j++) {
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
}
