package 문제.홀수;

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
