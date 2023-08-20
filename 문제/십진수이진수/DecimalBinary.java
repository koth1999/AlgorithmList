package 문제.십진수이진수;

// 10진수가 주어지면 2진수로 변경하고 이를 다시 2진수로 변경합니다.
// 입력 : 11
// 출력 : 1011
//       11

import java.util.Scanner;

public class DecimalBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        val = decToBin(val);
        System.out.println(val);
        val = binToDec(val);
        System.out.print(val);
    }
    static int decToBin(int dec) {
        int bin;
        int sum = 0;
        int pos = 1;
        while(dec!=0) {
            bin = dec % 2;
            sum = sum + bin * pos;
            dec = dec / 2;
            pos = pos * 10;
        }
        return sum;
    }
    static int binToDec(int bin) {
        int tmp = 0, i = 0, dec = 0;
        while(bin!=0) {
            tmp = bin % 10;
            bin = bin / 10;
            dec += tmp * Math.pow(2, i++);
        }
        return dec;
    }
}
