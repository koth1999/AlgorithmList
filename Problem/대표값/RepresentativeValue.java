package Problem.대표값;

// 어떤 수들이 있을 때, 그 수들을 대표하는 값으로 가장 흔하게 쓰이는 것은 평균이다. 평균은 주어진 모든 수의 합을 수의 개수로 나눈 것이다.
// 예를 들어 10, 40, 30, 60, 30의 평균은 (10 + 40 + 30 + 60 + 30) / 5 = 170 / 5 = 34가 된다.
// 평균 이외의 또 다른 대표값으로 중앙값이라는 것이 있다. 중앙값은 주어진 수를 크기 순서대로 늘어 놓았을 때 가장 중앙에 놓인 값이다.
// 예를 들어 10, 40, 30, 60, 30의 경우, 크기 순서대로 늘어 놓으면
// 10 30 30 40 60이 되고 따라서 중앙값은 30이 된다.
// 다섯 개의 자연수가 주어질 때 이들의 평균과 중앙값을 구하는 프로그램을 작성하시오.

import java.util.Arrays;
import java.util.Scanner;

public class RepresentativeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int avg = sum / 5;
        System.out.println(avg);

        int median = calculate(arr);
        System.out.println(median);
    }
    public static int calculate(int[] arr) {
        Arrays.sort(arr);

        int middleIndex = arr.length / 2;
        int median;

        if(arr.length % 2 == 0) {
            // 배열의 크기가 짝수인 경우
            // 중앙에 위치한 두 개의 요소의 값을 더한 후 2로 나누어 평균값을 계산한다.
            // 중앙값은 배열을 정렬한 후 중앙에 위치한 값들의 평균이다.
            // middleIndex - 1은 중앙값 직전의 인덱스를 가리킨다.
            median = arr[middleIndex-1] + arr[middleIndex] / 2;
        }else {
            // 배열의 크기가 홀수인 경우
            median = arr[middleIndex];
        }
        return median;
    }
}
