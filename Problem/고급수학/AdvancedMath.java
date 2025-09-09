package Problem.고급수학;

// 준규는 집을 짓고 있다. 준규는 모든 벽 모양을 직각 삼각형으로 만들려고 한다.
// 적절히 나무를 잘라 삼각형을 만들었지만, 준규는 각도를 측정할 수 있는 도구를 가지고 있지 않다.
// 어쩔 수 없이 줄자를 이용해 삼각형 세 변의 길이를 측정한 다음, 직각 삼각형인지 아닌지를 알아보려고 한다.
// 삼각형 세 변의 길이가 주어졌을 때, 직각 삼각형인지 아닌지를 구하는 프로그램을 작성하시오.

// 입력
// 입력의 첫째 줄에는 테스트 케이스의 개수 n이 주어진다.
// 각 테스트 케이스는 세 정수 1 ≤ a, b, c ≤ 40000 으로 이루어져 있다.
// 세 정수는 삼각형 각 변의 길이를 나타낸다.

// 출력
// 각 테스트 케이스마다 "Scenario #i:"를 출력한다. i는 테스트 케이스 번호이며, 1부터 시작한다.
// 그 다음 줄에는 입력으로 주어진 삼각형이 직각 삼각형인 경우에는 "yes", 아닌 경우에는 "no"를 출력한다.
// 각 테스트 케이스 사이에는 빈 줄을 하나 출력한다.

// 입력
// 2
// 36 77 85
// 40 55 69

// 출력
// Scenario #1:
// yes

// Scenario #2:
// no

import java.util.Arrays;
import java.util.Scanner;

public class AdvancedMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println("Scenario #" + i + ":");

            int[] length = {a, b, c};
            Arrays.sort(length);
            int aSquare = length[0] * length[0];
            int bSquare = length[1] * length[1];
            int cSquare = length[2] * length[2];

            if (cSquare == aSquare + bSquare) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            System.out.println(); // 줄바꿈
        }
    }
}
