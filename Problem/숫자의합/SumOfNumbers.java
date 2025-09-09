package Problem.숫자의합;

// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

// 입력 : 5
//       5 4 3 2 1
// 출력 : 15

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num = "";

        while(true) {
            int sum = 0;
            num = sc.next();
            if(num.equals("0")) break;
            for(int i = 0; i<num.length(); i++) {
                sum += num.charAt(i)-'0';
            }
            System.out.println(sum);
        }
    }
}
