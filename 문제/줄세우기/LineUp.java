package 문제.줄세우기;

// 악독한 코치 주혁은 선수들을 이름 순으로 세우는 것을 좋아한다.
// 더 악독한 것은 어떤 순서로 서야할지도 알려주지 않았다!
// 선수들의 이름이 주어질 때 어떤 순서로 이루어져있는지 확인해보자.

// 입력
// 첫째 줄에 N개의 이름이 주어진다. (2 ≤ N ≤ 20)

// 다음 N개의 줄에는 각 선수들의 이름이 주어진다. 이름은 2 이상 12 이하의 대문자로만 이루어져있다.
// 선수의 이름은 중복되지 않는다.

// 출력
// 이름이 증가하는 순으로 나타나면 INCREASING, 감소하는 순이면 DECREASING을 한 줄에 출력한다.
// 만약 위의 두 경우가 아니라면 NEITHER를 출력한다.

// 입력
// 5
// JOE
// BOB
// ANDY
// AL
// ADAM

// 출력 : DECREASING

import java.util.Scanner;

public class LineUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] word = new String[n];

        for (int i = 0; i < n; i++) {
            word[i] = sc.next();
        }

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < n; i++) {
            if (word[i - 1].compareTo(word[i]) > 0) {
                increasing = false;
            } else if (word[i - 1].compareTo(word[i]) < 0) {
                decreasing = false;
            }
        }

        if (increasing && !decreasing) {
            System.out.println("INCREASING");
        } else if (!increasing && decreasing) {
            System.out.println("DECREASING");
        } else {
            System.out.println("NEITHER");
        }
    }
}
