package Problem.Lunacy;

// 다이어트로 고생하는 몇 달 후, 잭은 몸무게를 줄이자는 생각에 사로잡혔습니다.
// 이상하게도, 그는 단순히 다른 행성에서 태어날 수 있는 행운만 있었다면,
// 그의 몸무게가 훨씬 덜 나갈 수 있었을 것이라고 생각하는 것이 매우 위안이 된다는 것을 알게 됩니다.
// 물론, 그 행성들은 손이 닿지 않는 곳에 있지만, 지구의 달조차도 극적인 무게 감소를 가져올 것입니다.
// 달에 있는 물체들은 지구 무게의 0.167만 무게가 나갑니다.

// 입력
// 입력은 하나 이상의 선들로 구성되며, 각각은 지구 상의 무게(파운드 단위)를 나타내는 단일 부동 소수점 번호를 포함한다.
// 입력의 끝은 음의 부동 소수점 번호로 표시된다.

// 출력
// 입력 데이터의 각 라인에 대해 프로그램은 양식의 한 라인을 출력해야 합니다.
// 지구에서 X의 무게가 나가는 물체는 달에서 Y의 무게를 잰다.
// 여기서 X는 입력에 의한 무게이고 Y는 달에 대한 무게이다. 두 출력 숫자는 소수점 뒤에 2자리 정밀도로 출력되어야 한다.

// 입력
// 100.0
// 12.0
// 0.12
// 120000.0
// -1.0

// 출력
// Objects weighing 100.00 on Earth will weigh 16.70 on the moon.
// Objects weighing 12.00 on Earth will weigh 2.00 on the moon.
// Objects weighing 0.12 on Earth will weigh 0.02 on the moon.
// Objects weighing 120000.00 on Earth will weigh 20040.00 on the moon.


import java.util.Scanner;

public class Lunacy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            double x = sc.nextDouble();

            if(x < 0) {
                break;
            }

            double y = x * 0.167;

            System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n", x, y);
        }
    }
}
