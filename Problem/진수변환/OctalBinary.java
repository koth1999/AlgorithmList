package Problem.진수변환;

// 8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.
// 입력 : 314
// 출력 : 11001100

import java.util.Scanner;

public class OctalBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] bin1 = {"000", "001", "010", "011", "100", "101", "110", "111"};
        String[] bin2 = {"", "1", "10", "11", "100", "101", "110", "111"};
        String oct = sc.next();

        for(int i = 0; i<oct.length(); i++) {
            if(oct.length()==1 && oct.charAt(i)-'0' == 0) {
                System.out.print("0");
                break;
            }
            if(i==0) {
                System.out.print(bin2[oct.charAt(0)-'0']);
            }else {
                System.out.print(bin1[oct.charAt(i)-'0']);
            }
        }

    }
}
