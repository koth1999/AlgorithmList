package 문제.배수찾기;

// 정수 n(0 < n < 1000)과 수의 목록이 주어졌을 때, 목록에 들어있는 수가 n의 배수인지 아닌지를 구하는 프로그램을 작성하시오.
// 목록은 0으로 끝난다.

// 입력 : 3 1 9 0
// 출력 : 1 is NOT a multiple of 3.
//       9 is a multiple of 3.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp;
        List<Integer> list = new ArrayList<>();

        while(true) {
            tmp = sc.nextInt();
            if(tmp == 0) break;
            list.add(tmp);
        }

        for(Integer e : list) {
            if(e % n == 0) System.out.println(e+" is a multiple of "+n);
            else System.out.println(e+" is NOT a multiple of "+n);
        }
    }
}
