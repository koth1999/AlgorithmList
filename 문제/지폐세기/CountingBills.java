package 문제.지폐세기;

// 대한민국 지폐는 천 원권, 오천 원권, 만 원권, 오만 원권으로 총 네 종류가 있다.
// 각 지폐의 세로 길이는 68mm로 모두 같지만, 가로 길이는 모두 다르다. 천 원권의 가로 길이는
// 136mm, 오천 원권의 가로 길이는 142mm, 만 원권의 가로 길이는 148mm, 오만 원권의 가로 길이는
// 154mm 이다. 따라서 가로의 길이를 통해서 지폐의 종류를 구분할 수 있다.

// 수민이는 대한민국 지폐 N장을 가지고 있다.
// 수민이는 종이의 크기를 재는 기계를 이용하여 각 지폐의 가로, 세로 길이를 알아냈다.
// 수민이가 가진 지폐의 총액을 구해보자.
//
// 입력
// 첫째 줄에 정수
// N(1 <= N <= 100)이 주어진다.
//
// 둘째 줄부터 N개의 줄에 각 지폐의 가로, 세로 길이가 공백으로 구분되어 mm 단위로 주어진다.
// 주어지는 지폐의 가로, 세로 길이의 길이는 정수이고 천 원권, 오천 원권, 만 원권, 오만 원권의 가로, 세로 길이 중 하나이다.

// 출력
// 수민이가 가진 지폐의 총액을 출력한다.

// 입력
// 4
// 136 68
// 142 68
// 148 68
// 154 68

// 출력 : 66000

import java.util.Scanner;

public class CountingBills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < n; i++) {
            int width = sc.nextInt(); // 가로
            int height = sc.nextInt(); // 세로

            if(width == 136) {
                sum += 1000;
            }else if(width == 142) {
                sum += 5000;
            }else if(width == 148) {
                sum += 10000;
            }else if(width == 154) {
                sum += 50000;
            }
        }
        System.out.println(sum);
    }
}
