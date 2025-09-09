package Problem.소수의합;

// 입력 받은 정수보다 작은 소수의 합을 구하는 함수를 만드세요.
// ex) 12이면 2+3+5+7+11 = 28

import java.util.Scanner;

public class PrimeSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for(int i=2; i<num; i++) sum+=primeSum(i);
        System.out.print(sum);
    }
    static int primeSum(int n) {
        boolean isPrime = true;
        for(int i=2; i<n; i++) {
            if(n%i==0) isPrime = false;
        }
        if(isPrime) return n;
        else return 0;
    }
}
