package 문제.중간계전쟁;

// 중간계에 전쟁이 일어나려고 한다. 간달프는 사우론에 대항하기 위한 군대를 소집했고, 여러 종족이 이 군대에 가담했다.
// 전쟁을 시작하기 전에 간달프는 각 종족에 점수를 매겼다. 간달프의 군대의 각 종족의 점수는 다음과 같다.

// 호빗 - 1
// 인간 - 2
// 엘프 - 3
// 드워프 - 3
// 독수리 - 4
// 마법사 - 10

// 사우론의 군대의 점수는 다음과 같다.
// 오크 - 1
// 인간 - 2
// 워그(늑대) - 2
// 고블린 - 2
// 우럭하이 - 3
// 트롤 - 5
// 마법사 - 10

// 중간계는 매우 신비한 곳이어서 각 전투의 승리는 날씨, 장소, 용맹에 영향을 받지 않는다.
// 전투에 참여한 각 종족의 점수를 합한 뒤, 큰 쪽이 이긴다.
// 전투에 참여한 종족의 수가 주어졌을 때, 어느 쪽이 이기는지 구하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 전투의 개수 T가 주어진다. 각 전투는 두 줄로 이루어져 있다. 첫째 줄에 간달프 군대에 참여한 종족의 수가 주어진다.
// 이 값은 공백으로 구분되어 있으며, 호빗, 인간, 엘프, 드워프, 독수리, 마법사 순서이다. 둘째 줄에는 사우론 군대에 참여한 종족의 수가 주어진다.
// 이 값 역시 공백으로 구분되어 있으며, 오크, 인간, 워그, 고블린, 우럭하이, 트롤, 마법사 순서이다.
// 모든 값은 음이 아닌 정수이고, 각 군대의 점수의 합은 32비트 정수 제한을 넘지 않는다.

// 출력
// 각 전투에 대해서, "Battle"과 전투 번호를 출력한다. 그 다음에 간달프의 군대가 이긴다면 "Good triumphs over Evil"를,
// 사우론의 군대가 이긴다면 "Evil eradicates all trace of Good",
// 점수의 합이 같아 이기는 쪽이 없다면 "No victor on this battle field"를 출력한다.

import java.util.Scanner;

public class MiddleEarthWar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            int[] gandalfArmy = new int[6];
            int[] sauronArmy = new int[7];

            for (int j = 0; j < 6; j++) {
                gandalfArmy[j] = sc.nextInt();
            }

            for (int j = 0; j < 7; j++) {
                sauronArmy[j] = sc.nextInt();
            }

            int gTotal = gandalfArmy[0] + gandalfArmy[1] * 2 + gandalfArmy[2] * 3 +
                    gandalfArmy[3] * 3 + gandalfArmy[4] * 4 + gandalfArmy[5] * 10;

            int sTotal = sauronArmy[0] + sauronArmy[1] * 2 + sauronArmy[2] * 2 +
                    sauronArmy[3] * 2 + sauronArmy[4] * 3 + sauronArmy[5] * 5 + sauronArmy[6] * 10;

            System.out.print("Battle " + i + ": ");

            if (gTotal > sTotal) {
                System.out.println("Good triumphs over Evil");
            } else if (gTotal < sTotal) {
                System.out.println("Evil eradicates all trace of Good");
            } else {
                System.out.println("No victor on this battle field");
            }
        }
    }
}
