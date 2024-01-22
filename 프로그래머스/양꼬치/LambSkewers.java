package 프로그래머스.양꼬치;

// 머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.
// 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다.
// 정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지 값을 완성해보세요.

// 제한사항
// 0 < n < 1,000
// n / 10 ≤ k < 1,000
// 서비스로 받은 음료수는 모두 마십니다.

// 입력 : 10 3
// 출력 : 124000

import java.util.Scanner;

public class LambSkewers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 양꼬치
        int k = sc.nextInt(); // 음료수

        int sum = (12000 * n) + ((k - (n / 10)) * 2000); // 서비스 음료수 빼기
        System.out.print(sum);
    }
}
