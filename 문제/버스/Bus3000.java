package 문제.버스;

// n명의 승객을 태우고 있는 3000번 버스는 강화에서부터 김포를 지나 신촌까지 가는 좌석버스이다. 3000번 버스는 버스 정류장마다 문을 연다.
// 그리고 정류장마다 타고 있는 승객의 수의 정확히 절반과 반 명(0.5명)의 승객이 내린다.
// 총 k개의 정류장에서 승객이 내렸고 마지막 정류장에서 승객이 없었으며 누구도 다치지 않았다면 맨 처음 타고있던 승객은 몇명인가.

// 입력
// 첫 번째 줄은 테스트 케이스의 수를 입력받는다. 각각의 테스트 케이스에는 정류장의 수 k를 입력받는다. 1 ≤ k ≤ 30.

// 출력
// 각각의 테스트 케이스는 한 줄에 처음 버스에 타고있던 승객의 수를 출력한다.

// 2
// 1
// 3

// 1
// 7

import java.util.Scanner;

public class Bus3000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스 수

        for(int i=0; i < t; i++) {
            int n = sc.nextInt(); // 승객 수
            int passengers = (int)(Math.pow(2, n) - 1); // 처음 타고 있던 승객 수
            System.out.println(passengers);
        }
    }
}
