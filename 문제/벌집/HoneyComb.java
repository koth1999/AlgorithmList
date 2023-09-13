package 문제.벌집;

// 육각형으로 이루어진 벌집이 있다. 숫자 N이 주어졌을 때, 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다.
// 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오.
// 예를 들면, 13까지는 3개, 58까지는 5개를 지난다.

// 입력
// 첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.

// 출력
// 입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.

// 입력 : 13
// 출력 : 3

import java.util.Scanner;

public class HoneyComb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int cnt = 0;

        while(n > sum) {
            sum += cnt * 6;
            cnt += 1;
            if(n <= sum + 1) {
                System.out.print(cnt);
                break;
            }
        }
    }
}
