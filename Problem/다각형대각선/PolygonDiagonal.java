package Problem.다각형대각선;

// 세 대각선이 한 점에서 만나지 않는 볼록 N각형이 주어졌을 때, 대각선의 교차점의 개수를 세는 프로그램을 작성하시오.
// 모든 내부각이 180도보다 작은 다각형을 볼록 다각형이라고 한다.

// 입력 : 3       입력 : 4      입력 : 6
// 출력 : 0       출력 : 1      출력 : 15

import java.util.Scanner;

public class PolygonDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = (n * (n-1) * (n-2) * (n-3)) / 24;
        // (n-1)은 한 점에서 시작한 첫 번째 대각선이 교차하는 점의 수, 이때 n-1개의 다른 꼭지점이 교차점이 된다.
        // (n-2)는 두 번째 대각선이 교차하는 점의 수, n-2개의 다른 꼭지점이 교차점이 된다. 첫 번째 대각선과 겹치는 점은
        // 이미 계산되서 제외된다.
        // (n-3)은 세번째 대각선이 교차하는 점의 수, n-3개의 다른 꼭지점이 교차점이 된다.
        // 첫 번째와 두 번째 대각선과 겹치는 점은 이미 계산되서 제외된다.
        // 24로 나누는 이유는 중복 계산을 제거하고 교차점의 개수를 정확하게 계산하기 위함이다.
        System.out.print(result);
    }
}
