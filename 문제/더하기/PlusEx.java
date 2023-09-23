package 문제.더하기;

// 숫자와 콤마로만 이루어진 문자열 S가 주어진다. 이때, S에 포함되어있는 자연수의 합을 구하는 프로그램을 작성하시오.
// S의 첫 문자와 마지막 문자는 항상 숫자이고, 콤마는 연속해서 주어지지 않는다. 주어지는 수는 항상 자연수이다.

// 입력
// 첫째 줄에 문자열 S가 주어진다. S의 길이는 최대 100이다.
// 포함되어있는 정수는 1,000,000보다 작거나 같은 자연수이다.

// 출력
// 문자열 S에 포함되어 있는 자연수의 합을 출력한다.

// 입력 : 10,20,30,50,100
// 출력 : 210

import java.util.Scanner;

public class PlusEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] word = str.split(",");
        int sum = 0;

        for(int i = 0; i < word.length; i++) {
            int num = Integer.parseInt(word[i]);
            sum += num;
        }
        System.out.println(sum);
    }
}
