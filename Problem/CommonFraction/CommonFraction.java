package Problem.CommonFraction;

// A common fraction or simple fraction is a rational number written as a/b, where the integers a and b are called the numerator and the denominator, respectively.
// The denominator cannot be zero.
// Dividing the numerator and denominator of a fraction by the same non-zero number will also yield an equivalent fraction.
// This is called reducing or simplifying the fraction. A simple fraction in which the numerator and denominator are coprime
// (that is, the only positive integer that can divide both the numerator and denominator is 1) is said to be irreducible, in lowest terms, or in simplest terms.
// For example, 3/9 is not in lowest terms because both 3 and 9 can be exactly divided by 3.
// In contrast, 3/8 is in lowest terms, the only positive integer that goes into both 3 and 8 evenly is 1.
// Your task is to write a program to find the lowest terms of given fractions.

// 입력
// The first number is n (1 ≤ n ≤ 104) which determines the number of common fractions.
// The following n lines contain the input fractions.
// Each line contains 2 positive non-zero integers a and b which is the numerator and the denominator of the fraction, respectively.
// The integers a and b may range from 1 to 10^6.

// 출력
// Each line of the output is the lowest terms of each fraction of the input.
// The numerator and the denominator of the fraction are separated by a single space.

// 입력
// 5
// 1 2
// 3 9
// 63 462
// 11 22
// 13 14

import java.util.Scanner;

public class CommonFraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int max = 0;

        for(int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j = 1; j <= a && j <= b; j++) {
                if(a % j == 0 && b % j == 0) max = j;
            }
            System.out.println((a / max) + " " + (b / max));
        }
    }
}
