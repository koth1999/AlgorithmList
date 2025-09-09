package Problem.PC방알바;

// 세준이는 피시방에서 아르바이트를 한다. 세준이의 피시방에는 1번부터 100번까지 컴퓨터가 있다.
// 들어오는 손님은 모두 자기가 앉고 싶은 자리에만 앉고 싶어한다.
// 따라서 들어오면서 번호를 말한다. 만약에 그 자리에 사람이 없으면 그 손님은 그 자리에 앉아서 컴퓨터를 할 수 있고, 사람이 없으면 거절당한다,
// 거절당하는 사람의 수를 출력하는 프로그램을 작성하시오.
// 자리에 맨 처음에 모두 비어있고, 어떤 사람이 자리에 앉으면 자리를 비우는 일은 없다.

// 입력 : 5 (손님 수)
//       1 1 2 2 5 (손님이 들어오는 순서대로 각 손님이 앉고 싶어하는 자리)
// 출력 : 2

import java.util.Scanner;

public class PcRoomEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int[] pcRoom = new int[100];

        for(int i=0; i<n; i++) {
            int seatNum = sc.nextInt();
            if(pcRoom[seatNum-1]==1) cnt++;
            else pcRoom[seatNum-1]=1;
        }
        System.out.print(cnt);
    }
}
