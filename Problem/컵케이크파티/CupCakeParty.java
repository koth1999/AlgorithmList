package Problem.컵케이크파티;


// 정규 박스에는 8개의 컵케이크가 들어가고, 작은 박스에는 3개의 컵케이크가 들어간다.
// 총 28명의 학생이 있고, 적어도 28개의 컵케이크가 필요하다.
// 각 학생이 한 개의 컵케이크를 받는다면 남는 컵케이크의 수를 계산하시오.
//
// 입력
// 입력은 두 줄로 구성된다.
//
// 첫 번째 줄에는 0 이상의 정수 R이 주어지며, 이는 정규 박스의 수를 나타낸다.
// 두 번째 줄에는 0 이상의 정수 S가 주어지며, 이는 작은 박스의 수를 나타낸다.

// 출력
// 남는 컵케이크의 수를 출력

// 입력
// 2
// 5

// 출력
// 3

import java.util.Scanner;

public class CupCakeParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int s = sc.nextInt();
        int people = 28;

        int remain = r * 8 + s * 3 - people;
        System.out.println(remain);
    }
}
