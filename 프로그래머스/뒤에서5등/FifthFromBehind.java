package 프로그래머스.뒤에서5등;

// 정수로 이루어진 리스트 num_list가 주어집니다.
// num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 완성해주세요.

// 제한사항
// 6 ≤ num_list의 길이 ≤ 30
// 1 ≤ num_list의 원소 ≤ 100

// 입력
// 7
// 12 4 15 46 38 1 14

// 출력 : 1 4 12 14 15

import java.util.Arrays;
import java.util.Scanner;

public class FifthFromBehind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 배열 정렬
        Arrays.sort(arr);

        // 가장 작은 5개의 수 출력
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
