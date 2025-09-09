package Problem.윤년;

// 2월이 29일까지 있는 해를 윤년이라고 한다.

// 한 자연수를 입력받아서 윤년인지 아닌지를 판단하는 프로그램을 작성하시오.
// 단, 윤년은 다음 두 조건 중 하나만 만족하면 된다.
// (1) 400의 배수이면 무조건 윤년이다.
// (2) 4의 배수이며, 100의 배수가 아니면 윤년이다.
// 예시)
// 2000 년 ====> 윤년 (1번 조건)
// 2004 년 ====>  윤년(2번 조건)
// 1900 년 ====> 윤년 아님
// 1999 년 ====> 윤년 아님

// 입력 : 2012
// 출력 : Leap

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if((year%400==0) || (year%4==0 && year%100!=0)) {
            System.out.print("Leap");
        }else{
            System.out.print("No");
        }
    }
}
