package Problem.문자열자르기;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split(":");

        int hour = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[1]);
        int sec = Integer.parseInt(arr[2]);

        if(hour>12) {
            System.out.printf("오후 %02d시 %02d분 %02d초", (hour-12), min, sec);
        }else{
            System.out.printf("오전 %02d시 %02d분 %02d초", hour,min,sec);
        }
    }
}
