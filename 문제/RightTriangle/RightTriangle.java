package 문제.RightTriangle;

// A right triangle or right-angled triangle is a triangle in which one angle is a right angle (that is, at 90 degrees angle).
// The largest side of such a triangle is called hypotenuse. The relation between the sides of the triangle is
// c^2 = a^2 + b^2, Where c is the hypotenuse
// Given 3 sides of a triangle, your task is to determine whether the given triangle is a right triangle or not.

// 입력
// The first line has a positive integer T, T <= 100000, denoting the number of test cases. This is followed by each test case per line.
// Each test case consists of a line containing 3 integers a,b and c denoting the sides of a triangle. All of these sides will be between 1 and 100, inclusive.
// The sides a,b and c can be given in any order.

// 출력
// For each test case, the output contains a line in the format Case #x: M,
// where x is the case number (starting from 1) and M is “YES” when the given triangle is a right triangle or “NO” otherwise.
// Note that the quotes are not required to be outputted.

// 입력
// 10
// 20 16 12
// 5 3 4
// 15 12 9
// 12 5 13
// 12 13 5
// 28 82 46
// 43 96 92
// 3 4 5
// 13 5 12
// 6 10 8

// 출력
// Case #1: YES
// Case #2: YES
// Case #3: YES
// Case #4: YES
// Case #5: YES
// Case #6: NO
// Case #7: NO
// Case #8: YES
// Case #9: YES
// Case #10: YES

import java.util.Arrays;
import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int[] arr = {a, b, c};

            Arrays.sort(arr);

            System.out.print("Case #" + i + ": ");

            if(arr[2] * arr[2] == (arr[0] * arr[0]) + (arr[1] * arr[1])) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
