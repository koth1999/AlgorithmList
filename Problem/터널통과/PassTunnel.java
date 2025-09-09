package Problem.터널통과;

// 어떤 차의 높이가 170cm이다. 이 차는 3개의 터널 a,b,c를 차례대로 지나게 될 것이다.
// 각 터널의 높이의 차가 높이보다 같거나 낮으면 차는 터널과 충돌하여 사고가 날 것이다.
// 각 터널 a,b,c의 높이가 차례대로 3개 입력되면, 터널을 무사히 잘 통과하면 "PASS"를 출력,
// 사고가 난다면 "CRASH"와 처음 충돌하는 터널의 높이를 출력하시오.

// 입력 : 171 168 165
// 출력 : CRASH 168

import java.util.Scanner;

public class PassTunnel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int car = 170;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a<=170) {
            System.out.print("CRASH : "+a);
        }else if(b<=170) {
            System.out.print("CRASH : "+b);
        }else if(c<=170) {
            System.out.print("CRASH : "+c);
        }else {
            System.out.print("PASS");
        }
    }
}
