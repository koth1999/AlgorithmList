package 문제.쿠폰;

// 당신은 어떤 물건이라도 20% 할인해주는 쿠폰을 가지고 있다.
// 원래 가격이 주어질 때, 쿠폰을 사용하면 얼마가 되는지 알려주는 프로그램을 작성하시오.

// 입력
// 첫 번째 줄에 테스트케이스의 수가 주어진다.
// 각 줄에는 물건의 원래가격이 소수점 둘째자리까지 주어진다.

// 출력
// 할인된 가격을 달러 단위로 출력한다.

// 나누어떨어지지 않을 때는 소수점 셋째 자리에서 반올림해서 둘째 자리까지 출력한다.

// 3
// 100.00
// 59.99
// 20.00

// $80.00
// $47.99
// $16.00

import java.util.Scanner;

public class Coupon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i < t; i++) {
            double price = sc.nextDouble();

            double discountedPrice = price * 0.8;

            // 반올림해서 둘째 자리까지 출력
            System.out.printf("$%.2f\n", Math.round(discountedPrice * 100.0) / 100.0);
        }
    }
}
