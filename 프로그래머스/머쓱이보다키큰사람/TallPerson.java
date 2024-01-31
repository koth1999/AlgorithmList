package 프로그래머스.머쓱이보다키큰사람;

// 머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
// 머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때,
// 머쓱이보다 키 큰 사람 수를 구하시오.

// 제한사항
// 1 ≤ array의 길이 ≤ 100
// 1 ≤ height ≤ 200
// 1 ≤ array의 원소 ≤ 200

// 입력
// 4
// 149 180 192 170
// 167

// 출력 : 3

// 입력
// 3
// 180 120 140
// 190

// 출력 : 0

import java.util.Scanner;

public class TallPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int height = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > height) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
