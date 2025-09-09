package Problem.화성수학;

// 겨울 방학에 달에 다녀온 상근이는 여름 방학 때는 화성에 갔다 올 예정이다. (3996번) 화성에서는 지구와는 조금 다른 연산자 @, %, #을 사용한다.
// @는 3을 곱하고, %는 5를 더하며, #는 7을 빼는 연산자이다. 따라서, 화성에서는 수학 식의 가장 앞에 수가 하나 있고, 그 다음에는 연산자가 있다.

// 입력
// 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 다음 줄에는 화성 수학식이 한 줄에 하나씩 주어진다.
// 입력으로 주어지는 수는 정수이거나 소수 첫째 자리까지 주어지며, 0 이상 100 이하이다. 연산자는 최대 3개 주어진다.

// 출력
// 각 테스트 케이스에 대해서, 화성 수학식의 결과를 계산한 다음에, 소수점 둘째 자리까지 출력한다.

// 입력
// 3
// 3 @ %
// 10.4 # % @
// 8 #

// 출력
// 14.00
// 25.20
// 1.00

import java.util.Scanner;

public class MarsMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String[] word = sc.nextLine().split(" ");
            double n = Double.parseDouble(word[0]);
            double result = n;

            for (int j = 1; j < word.length; j++) {
                char c = word[j].charAt(0);
                result = getWord(c, result);
            }

            System.out.printf("%.2f%n", result);
        }
    }

    public static double getWord(char c, double n) {
        switch (c) {
            case '@':
                return n * 3;
            case '%':
                return n + 5;
            case '#':
                return n - 7;
            default:
                return 0;
        }
    }
}
