package 문제.구간합구하기;

// sumArr[i] = sumArr[i-1] + arr[i] 공식을 사용하여 프로그램을 작성

import java.util.Scanner;

public class IntervalSumEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        int[] sumArr = new int[n+1];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            if(i==0) sumArr[i] = arr[i];
            else sumArr[i] = sumArr[i-1] + arr[i];
            // sumArr[i] : 누적된 합을 저장하는 배열
            // sumArr[i-1] : sumArr[i]의 이전 원소의 누적된 합
            // arr[i] : 원래 i번째의 원소
        }

        int left = 0;
        int right = 0;

        while(x!=0) {
            left = sc.nextInt();
            right = sc.nextInt();
            if(left!=1) System.out.println(sumArr[right-1] - sumArr[left-2]);
            else System.out.println(sumArr[right-1]-0);
            x--;
        }
    }
}
