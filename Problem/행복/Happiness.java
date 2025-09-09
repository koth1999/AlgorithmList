package Problem.행복;

// 코이  초등학교에 새로 부임하신 교장선생님은 어린 학생들의 행복감과 학생들의 성적 차이 관계를 알아보기로 했다.
// 그래서 이전 성적을 조사하여 학생들의 시험 점수 차이 변화를 알아보려고 한다.
// 예를 들어 2016년 학생 8명의 점수가 다음과 같다고 하자.
// 27, 35, 92, 75, 42, 53, 29, 87
// 그러면 가장 높은 점수는 92점이고 가장 낮은 점수는 27점이므로 점수의 최대 차이는 65이다.
// N명 학생들의 점수가 주어졌을 때, 가장 높은 점수와 가장 낮은 점수의 차이를 구하는 프로그램을 작성하시오.

// 입력 : 5
//       27 35 92 75 42
// 출력 : 65

import java.util.Scanner;

public class Happiness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for(int i=0; i<arr.length; i++) {
            if(min>arr[i]) min = arr[i];
            if(max<arr[i]) max = arr[i];
        }

        int dif = max - min;
        System.out.print(dif);
    }
}
