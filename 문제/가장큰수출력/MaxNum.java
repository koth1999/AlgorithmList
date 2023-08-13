package 문제.가장큰수출력;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int a, b, c;

        a = num/100;
        b = (num%100)/10;
        c = num%10;

        if(a>b){
            System.out.print(Math.max(a,c));
        }else{
            System.out.print(Math.max(b,c));
        }
    }
}
