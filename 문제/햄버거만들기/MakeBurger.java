package 문제.햄버거만들기;

// 햄버거 가게에서 일하는 종현이는 햄버거를 만드는 일을 하고 있다. 가게에는 햄버거 빵이 A개, 햄버거 패티가 B개 있는데,
// 이 빵과 패티를 가지고 최대한 햄버거를 많이 만드려고 한다.
// 햄버거를 만드는 과정은 아주 간단한 세 단계로 이루어져 있다.

// 그릇 위에 빵을 놓는다. 빵 위에 패티를 올린다.
// 패티 위에 다시 빵을 올려서 햄버거를 완성시킨다.
// 햄버거 빵 A개와 햄버거 패티 B개로 만들 수 있는 햄버거의 최대 개수는 얼마일까?
// 단, 햄버거 빵은 위에 놓는 빵과 아래에 놓는 빵의 구분이 없으며, 남는 빵이나 패티가 있어도 된다.

// 입력
// 첫째 줄에 햄버거 빵의 개수와 햄버거 패티의 개수를 의미하는
// A, B (1 <= A, B <= 100)가 주어진다.

// 출력
// 만들 수 있는 햄버거의 최대 개수를 출력한다.

// 입력 : 6 3
// 출력 : 3

import java.util.Scanner;

public class MakeBurger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = Math.min(a / 2, b);
        System.out.print(cnt);
    }
}
