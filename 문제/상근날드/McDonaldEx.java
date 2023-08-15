package 문제.상근날드;

// 상근날드에 가장 잘 팔리는 메뉴는 세트 메뉴이다.
// 주문할 때, 자신이 원하는 햄버거와 음료를 하나씩 골라 세트로 구매하면 가격의 합계에서 50원을 뺀 가격이 세트 메뉴의 가격이 된다.
// 햄버거는 총 3종류 상덕버거, 중덕버거, 하덕버거가 있고, 음료는 콜라, 사이다가 있다.
// 햄버거와 음료의 가격이 주어졌을 때, 가장 싼 세트 메뉴의 가격을 출력하는 프로그램을 작성하시오.

// 예제 입력
// 입력 : 800 1200 600 700 900
// 출력 : 1250


import java.util.Scanner;

public class McDonaldEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] menu = new int[5];

        for(int i=0; i<menu.length; i++) {
            menu[i] = sc.nextInt();
        }

        int minB = menu[0];
        int minD = menu[3];

        for(int i=0; i<menu.length; i++) {
            if((i<3) && minB>menu[i]) minB = menu[i];
            if((i>2) && minD>menu[i]) minD = menu[i];
        }

        System.out.print(minB+minD-50);
    }
}
