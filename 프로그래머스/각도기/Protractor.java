package 프로그래머스.각도기;

// 각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다.
// 각 angle이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 완성해주세요.

// 예각 : 0 < angle < 90
// 직각 : angle = 90
// 둔각 : 90 < angle < 180
// 평각 : angle = 180

// 제한사항
// 0 < angle ≤ 180
// angle은 정수입니다.

// 입력 : 70
// 출력 : 1

// 입력 : 91
// 출력 : 3

// 입력 : 180
// 출력 : 4

import java.util.Scanner;

public class Protractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle = sc.nextInt();

        if(angle > 0 && angle < 90) {
            System.out.print("1");
        }else if(angle > 90 && angle < 180) {
            System.out.print("3");
        }else if(angle > 180) {
            System.out.print("4");
        }else if(angle == 90) {
            System.out.print("2");
        }
    }
}
