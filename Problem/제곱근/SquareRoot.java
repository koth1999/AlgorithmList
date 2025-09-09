package Problem.제곱근;

// 정수 N이 주어졌을 때, N의 제곱근을 구하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 양의 정수 N이 주어진다. 정수 N의 제곱근은 항상 정수이며, N의 길이는 800자리를 넘지 않는다.

// 출력
// 첫째 줄에 정수 N의 제곱근을 출력한다.

import java.math.BigInteger;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = new BigInteger(sc.next());

        BigInteger num = n.sqrt();
        System.out.println(num);
    }
}
