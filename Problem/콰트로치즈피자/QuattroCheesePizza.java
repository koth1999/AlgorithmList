package Problem.콰트로치즈피자;

// 치즈와 피자에 환장하는 비행씨는 매일같이 치즈피자를 사 먹다가 지갑이 거덜 나고 말았다.
// 만들어 먹는 것이 사 먹는 것보다 싸다는 것을 안 비행씨는 여러 가지 토핑을 가져와서 직접 피자를 만들어 먹기로 했다.
// 콰트로치즈피자는 이름 그대로, 서로 다른 네 종류의 치즈가 토핑으로 들어가야 한다.
// 수많은 치즈피자를 먹어 온 비행씨는 토핑의 이름이 Cheese로 끝나면 이 토핑이 치즈라는 사실을 알고 있다.
// 비행씨가 가져온 토핑의 목록을 보고, 이 토핑의 일부 혹은 전부를 이용하여 콰트로치즈피자를 만들 수 있는지 답해 보자.

// 입력
// 첫 번째 줄에 토핑의 개수가 1 이상 100 이하의 정수로 주어진다.
// 두 번째 줄에는 한 줄로 구성된 토핑의 목록이 주어진다. 각 토핑들은 공백으로 구분되어 있으며,
// 1개 이상 100개 이하의 영문 대소문자로 구성되어 있다. 대소문자를 구분함에 유의하라.

// 출력
// 입력으로 주어진 토핑의 목록으로 콰트로치즈피자를 만들 수 있으면 yummy, 만들 수 없으면 sad를 출력하라.

// 입력
// 4
// CheddarCheese MozzarellaCheese GoudaCheese GranaPadanoCheese

// 출력 : yummy

import java.util.HashSet;
import java.util.Scanner;

public class QuattroCheesePizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리

        HashSet<String> toppings = new HashSet<>();

        // 토핑 목록을 HashSet에 저장
        String[] toppingList = sc.nextLine().split(" ");
        for (String topping : toppingList) {
            toppings.add(topping);
        }

        int cheeseCnt = 0;

        // 'Cheese'로 끝나는 토핑 개수 확인
        for (String topping : toppings) {
            // endsWith : 해당 문자열이 특정 문자열로 끝나는지 여부를 확인
            if (topping.endsWith("Cheese")) {
                cheeseCnt++;
            }
        }

        // 콰트로치즈피자 만들기 여부 출력
        if (cheeseCnt >= 4) {
            System.out.println("yummy");
        } else {
            System.out.println("sad");
        }
    }
}
