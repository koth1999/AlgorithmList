package Problem.Rectangles;

// My young son is struggling with his maths homework, can you help him please?
// He is working on the area of a rectangle – you know, area = length x width. His teacher has given him a table of lengths, widths and areas.
// Each row on the table has one of the 3 values missing; my son has to work out the missing value and write it in the table such that the values on each line represent the length,
// width and area of one rectangle.

// 입력
// Input is a series of lines, each containing 3 integers, l, w, and a ( 0 ≤ l w ≤100, 0 ≤ a ≤ 10,000) representing the length,
// width and area of a rectangle in that order. The integers are separated by a single space. In each row, only one of the values has been replaced by a zero.
// The final row contains 0 0 0 and should not be processed.

// 출력
// Output is the same series of lines but with the zero in each line replaced by the correct value for the length, width or area as appropriate.
// The new value is always an integer.

// 입력
// 2 0 6
// 6 5 0
// 0 8 80
// 9 0 45
// 0 0 0

// 출력
// 2 3 6
// 6 5 30
// 10 8 80
// 9 5 45

import java.util.Scanner;

public class Rectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int length = sc.nextInt(); // 길이
            int width = sc.nextInt(); // 너비
            int area = sc.nextInt(); // 면적

            if(length == 0 && width == 0 && area == 0) {
                break;
            }

            if(length == 0) {
                length = area / width;
            }else if(width == 0) {
                width = area / length;
            }else if(area == 0) {
                area = length * width;
            }
            System.out.println(length + " " + width + " " + area);
        }
    }
}
