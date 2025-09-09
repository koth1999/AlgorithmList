package Problem.간판만들기;

// 재석이는 대문에 붙이는 호수판 제작업체의 직원이다. 고객에게 전달할 호수판은 숫자의 숫자
// 사이 그리고 왼쪽 오른쪽으로 적당히 여백이 들어가 줘야하고 숫자마다 차지하는 간격이 조금씩 상이하다.
// 규칙은 매우 간단하다.
// 1. 각 숫자 사이에는 1cm의 여백이 들어가야한다.
// 2. 1은 2cm의 너비를 차지하고, 0은 4cm의 너비를 차지하고, 나머지 숫자는 3cm의 너비를 차지한다.
// 3. 호수판의 경계와 숫자 사이에는 1cm의 여백이 들어가야한다.

// 입력 : 120  출력 : 13
// 0을 입력하면 종료된다.


import java.util.Scanner;

public class SignBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numSize = {4,2,3,3,3,3,3,3,3,3};
        String num = "";

        while(true) {
            int sum = 0;
            num = sc.next();
            if(num.equals("0")) break;
            for(int i=0; i<num.length(); i++) {
                sum+=numSize[num.charAt(i)-'0']+1;
            }
            System.out.println(sum+1);
        }
    }
}
