package 문제.이제는더이상물러날곳이없다;

// 건덕이와 건구스는 N개의 칸이 가로로 놓인 전장에서 승부를 겨루고 있다.
// 처음에는 가장 왼쪽 칸에 건덕이가, 가장 오른쪽 칸에 건구스가 자리 잡고 있으며, 승자는 아래 규칙에 따라 정해진다.
// 자신의 차례에 아래 두 가지 행동 중 하나를 반드시 수행해야 한다. 전장을 벗어나도록 이동할 수 없으며, 행동을 마친 뒤에는 상대방의 차례가 된다.
// 좌우로 인접한 칸으로 이동한다.좌우로 인접한 칸에 상대방이 있다면, 상대방을 공격한다.
// 상대방을 공격하는 경우 승리한다. 전장의 크기가 주어졌을 때, 누가 승리하는지 판단하자. 둘 다 최선을 다해서 승부를 겨루며, 처음 행동을 수행하는 사람은 건덕이다.

// 입력
// 전장에 놓인 칸의 개수 N이 주어진다.
// ( 3 <= N <= 200,000)

// 출력
// 건덕이가 이길 경우 "Duck"을, 건구스가 이길 경우 "Goose"를 출력한다.

// 입력 : 3
// 출력 : Goose

// 입력 : 4
// 출력 : Duck

import java.util.Scanner;

public class NoPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 == 1) {
            System.out.print("Goose");
        }else {
            System.out.print("Duck");
        }
    }
}
