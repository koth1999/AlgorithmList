package 프로그래머스.아이스아메리카노;

// 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다.
// 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
// 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 완성해보세요.

// 제한사항
// 0 < money ≤ 1,000,000

// 입력 : 5500
// 출력 : 1 0

// 입력 : 15000
// 출력 : 2 4000

import java.util.Scanner;

public class IceAmericano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int coffee = 5500;

        int cnt = coffee / money;
        int remain = (money - (cnt * coffee));

        System.out.print(cnt + " " + remain);
    }
}
