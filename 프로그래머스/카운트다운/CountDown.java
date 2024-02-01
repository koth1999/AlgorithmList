package 프로그래머스.카운트다운;

// 정수 start_num와 end_num가 주어질 때, start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 완성해주세요.

// 제한사항
// 0 ≤ end_num ≤ start_num ≤ 50

// 입력 : 10 3
// 출력 : 10 9 8 7 6 5 4 3

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int[] arr = new int[start - end + 1];

        for (int i = start; i >= end; i--) {
            arr[start - i] = i;
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
