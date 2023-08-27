package 문제.영화표예매;

// 메뉴는 [1]예매하기, [2]종료하기
// 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다. (좌석은 10개이다.)
// [V] [V] [V] [  ] [  ] [  ] [  ] [  ] [  ] [  ]
// 예매가 완료되면 해당 좌석 값을 1로 변경한다.
// 이미 예매가 완료된 좌석은 재구매할 수 없다.
// 한 좌석당 예매 가격은 12000원이다.
// 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieSell movieSell = new MovieSell();
        while(true) {
            System.out.println("[1] 예매하기");
            System.out.println("[2] 종료");
            int selMenu = sc.nextInt();
            if(selMenu == 1) movieSell.selectSeat();
            else {
                System.out.println("총 판매 금액 : "+movieSell.totalAmount());
                break;
            }
        }
    }
}

class MovieSell {
    int[] seat = new int[10];
    // 좌석 판매상태
    void printSeat() {
        for(int i=0; i<seat.length; i++) {
            if(seat[i]==0) System.out.print("[]");
            else System.out.print("[V]");
        }
        System.out.println();
    }
    // 판매를 위해 좌석을 선택하도록 하는 메뉴
    void selectSeat() {
        printSeat();
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석을 선택해주세요 : ");
        int seatNum = sc.nextInt();
        if(seat[seatNum-1]==0) {
            seat[seatNum-1]=1;
            printSeat();
        }else{
            System.out.println("이미 판매된 좌석입니다. 다른 좌석을 선택하세요.");
        }
    }
    // 총 금액
    int totalAmount() {
        int cnt = 0;
        for (int e : seat) {
            if (e == 1) cnt++;
        }
        return cnt * 12000;
    }
}
