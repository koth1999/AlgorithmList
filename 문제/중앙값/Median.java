package 문제.중앙값;

// 중앙값(median)은 어떤 주어진 값들을 정렬했을 때 가장 중앙에 위치하는 값을 의미한다.
// 예를 들어 1, 2, 100의 세 값이 있을 때, 2가 가장 중앙에 있기 때문에 2가 중앙값이다. 값이 짝수개일 때에는 중앙값이 유일하지 않고 두 개가 될 수도 있다.
// 이 경우 그 두 값의 평균을 취한다. 예를 들어 1, 10, 90, 200 네 수의 중앙값은 10과 90의 평균인 50이 된다.
// 5개의 자연수가 주어질 때, 중앙값을 찾아내는 프로그램을 작성하시오.
// 예를 들어, 다음의 수에 대하여 중앙값은, 57 34 87 83 47
// 크기 순서상으로 57이 가운데 있고 이 값이 중앙값이 된다.

// 입력 : 58 35 77 59 68
// 출력 : 59

import java.util.Arrays;
import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 중앙값 계산 및 출력
        int median = calculateMedian(arr);
        System.out.println(median);
    }
    static int calculateMedian(int[] arr) {
        // 배열을 오름차순으로 정렬
        Arrays.sort(arr);

        // 중앙값 계산
        int middleIndex = arr.length / 2;
        int median;

        if(arr.length % 2 == 0) {
            // 배열의 크기가 짝수인 경우
            // 중앙에 위치한 두 개의 요소의 값을 더한 후 2로 나누어 평균값을 계산한다.
            // 중앙값은 배열을 정렬한 후 중앙에 위치한 값들의 평균이다.
            // middleIndex - 1은 중앙값 직전의 인덱스를 가리킨다.
            median = (arr[middleIndex-1] + arr[middleIndex]) / 2;
        } else {
            // 배열의 크기가 홀수인 경우
            median = arr[middleIndex];
        }
        return median;
    }
}
