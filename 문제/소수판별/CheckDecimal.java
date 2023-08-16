package 문제.소수판별;


// 소수는 1과 자기자신 이외에는 나누어지지 않는 수이다.
// 메소드를 이용해 소수를 판별한다.
// 입력 : 7          입력 : 10
// 출력 : true       출력 : false

import java.util.Scanner;

public class CheckDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print(isPrime(num));
    }

    static boolean isPrime(int n) {
        for(int i=2; i<n; i++) {
            if(n%i==0) return false;
        }
        return true;
    }
}
