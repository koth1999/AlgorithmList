package 문제.PizzaDeal;

// There’s a pizza store which serves pizza in two sizes: either a pizza slice, with area A1 and price P1,
// or a circular pizza, with radius R1 and price P2.
// You want to maximize the amount of pizza you get per dollar. Should you pick the pizza slice or the whole pizza?

// 입력
// The first line contains two space-separated integers A1 and P1.
// Similarly, the second line contains two space-separated integers R1 and P2.
// It is guaranteed that all values are positive integers at most 103.
// We furthermore guarantee that the two will not be worth the same amount of pizza per dollar.

// 출력
// If the better deal is the whole pizza, print ‘Whole pizza’ on a single line.
// If it is a slice of pizza, print ‘Slice of pizza’ on a single line.

// 입력 : 8 4 7 9
// 출력 : Whole pizza

// 입력 : 841 108 8 606
// 출력 : Slice of pizza

import java.util.Scanner;

public class PizzaDeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a1 = sc.nextDouble();
        double p1 = sc.nextDouble();

        double a2 = sc.nextDouble();
        double p2 = sc.nextDouble();

        double x = a1 / p1;
        double y = Math.PI * a2 * a2 / p2;

        if(x < y) {
            System.out.println("Whole pizza");
        }else {
            System.out.println("Slice of pizza");
        }
    }
}
