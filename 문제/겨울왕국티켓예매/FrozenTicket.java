package 문제.겨울왕국티켓예매;

// 정휘는 애니메이션계의 영원한 명작이자 최고의 흥행작 겨울왕국 2를 자그마치 싱어롱으로 관람하려고 한다!
// 겨울왕국에 등장하는 캐릭터 중 엘사를 너무 좋아하는 정휘는 L4, 즉 L열의 네 번째 자리에 앉으려고 한다.
// 그러나 정휘가 가려는 영화관은 좌석 번호가 자연수 하나로 표현되기 때문에 예매를 하기가 힘들다.
// 정휘가 겨울왕국을 관람하는 영화관은 세로로 N칸, 가로로 M칸인 좌석들로 구성되어 있다.
// 좌석의 번호는 좌상단 끝에 있는 A열의 첫 번째 자리부터 1번으로 시작하여 오른쪽으로 번호가 하나씩 증가하다가 끝에 다다르면 B열의 첫 번째 자리부터 또 오른쪽으로,
// C열의 첫 번째 자리부터 또 오른쪽으로 진행하는 것을 반복하면서 숫자가 증가해 나간다.
// 정휘가 좌석 L4를 빠르게 선점하여 Show Yourself를 신나게 부를 수 있도록 L열의 네 번째 자리의 좌석 번호를 구해주자.

// 입력
// 첫 번째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 20)이 주어진다.
// 각 테스트 케이스는 한 줄로 구성되며, 각각 두 개의 자연수 N, M(1 ≤ N ≤ 26, 1 ≤ M ≤ 9)이 주어진다.
// N은 영화관 자리의 열 개수, M은 영화관 한 열에 속한 좌석 개수를 의미한다.


// 출력
// 각 테스트 케이스에 대해, 한 줄에 하나씩 L열의 네 번째 자리의 좌석 번호를 출력한다.
// 만약 영화관에 L열 네 번째 자리가 존재하지 않는다면 -1을 출력한다.

// 입력
// 1
// 13 4

// 출력 : 48

import java.util.Scanner;

public class FrozenTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int n = sc.nextInt(); // 열
            int m = sc.nextInt(); // 좌석

            int L4 = 11 * m + 4;

            if(n < 12 || m < 4) {
                System.out.println("-1");
            }else {
                System.out.println(L4);
            }
        }
    }
}
