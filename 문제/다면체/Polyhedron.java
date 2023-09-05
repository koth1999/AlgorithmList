package 문제.다면체;

// 수학자가 구를 깎아서 볼록다면체를 만들었다.
// 이 수학자는 임의의 볼록다면체에 대해 (꼭짓점의 수) - (모서리의 수) + (면의 수) = 2가 성립한다는 것을 알고 있다.
// 그래서 구를 깎는 게 취미인 이 사람은 꼭짓점, 모서리와 면의 수를 기록할 때 꼭짓점과 모서리의 수만 세고 면의 수는 세지 않는다.

// 첫 번째 줄에 1 이상 100 이하의 자연수 T가 주어진다.
// 다음 T개의 줄에 4 이상 100 이하의 자연수 V와 E가 공백을 사이에 두고 주어진다.
// V와 E는 각각 꼭짓점의 개수와 모서리의 개수이다.

// 입력 : 2
//       8 12
//       4 6

// 출력 : 6
//       4

import java.util.Scanner;

public class Polyhedron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            int v = sc.nextInt(); // 꼭짓점
            int e = sc.nextInt(); // 모서리

            int f = 2 - v + e; // 면
            System.out.println(f);
        }

    }
}
