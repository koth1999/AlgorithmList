package 문제.홀수;

// 7개의 자연수가 주어질 때, 이들 중 홀수인 자연수들을 모두 골라 그 합을 구하고, 고른 홀수들 중 최솟값을 찾는 프로그램을 작성하시오.
// 예를 들어, 7개의 자연수 12, 77, 38, 41, 53, 92, 85가 주어지면 이들 중 홀수는 77, 41, 53, 85이므로 그 합은
// 77 + 41 + 53 + 85 = 256이 되고,
// 41 < 53 < 77 < 85 이므로 홀수들 중 최솟값은 41이 된다.

// 입력 : 12
//       77
//       38
//       41
//       53
//       92
//       85

// 출력 : 256
//       41

import java.util.Scanner;

public class OddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        int sum = 0, max = 100;
        int cnt = 0;

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 1) {
                sum += arr[i];
                if(arr[i] < max) {
                    max = arr[i];
                }
                cnt++;
            }
        }
        if(cnt == 0){
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(max);
        }
    }
}
