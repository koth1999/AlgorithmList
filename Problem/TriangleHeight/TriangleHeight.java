package Problem.TriangleHeight;

// Your Math teacher asked you to write a program to help him generate homework solutions. The program will need to find the height of a triangle given its area and its base length.
//Formula: a = (h * b) / 2 (a – area, b – base length, h – height)

// 입력
// The first line will contain a single integer n that indicates the number of lines that follow. Each line will include the area and base length of a triangle with the two values separated by a single space.
// area base

// 출력
// For each input display the height of the triangle with 2 decimal places, in the following format:
// The height of the triangle is #.## units

// 입력
// 4
// 200.533 40.5
// 10.6 1.11
// 30 30
// 3333 50.7

// 출력
// The height of the triangle is 9.90 units
// The height of the triangle is 19.10 units
// The height of the triangle is 2.00 units
// The height of the triangle is 131.48 units

import java.util.Scanner;

public class TriangleHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            double area = sc.nextDouble();
            double base = sc.nextDouble();

            double height = 2 * area / base;

            System.out.printf("The height of the triangle is %.2f units\n", height);
        }
    }
}
