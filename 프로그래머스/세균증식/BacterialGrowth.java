package 프로그래머스.세균증식;

// 어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
// 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 완성해주세요.

// 제한사항
// 1 ≤ n ≤ 10
// 1 ≤ t ≤ 15

// 입력 : 2 10
// 출력 : 2048

// 입력 : 7 15
// 출력 : 229376

import java.util.Scanner;

public class BacterialGrowth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int result = (int)Math.pow(2, t);
        int answer = result * n;
        System.out.print(answer);
    }
}
