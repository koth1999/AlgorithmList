package Problem.Euclid;

// The famous Euclidean algorithm is found in Book VII of the Elements. The Elements was written in 300 B.C. by the Greek mathematician Euclid.
// It is rumored that King Ptolemy, having looked through the Elements, hopefully asked Euclid if there were not a shorter way to geometry, to which Euclid sternly answered:
// “In geometry there is no royal road!” Probably we should not blame the King for looking for short cuts, for there are thirteen books in the Elements!
// The books consist mainly of the mathematical knowledge amassed by Euclid, and possibly some discoveries of his own.
// The great achievement of Euclid is the beautifully systematic presentation of material as an organic whole.
// The Elements remained a standard work for over two thousand years.
// The original Euclidean algorithm uses subtraction to find the greatest common divisor (gcd) of two positive integers A and B.
// It is based on the observation that a common divisor of A and B is also a common divisor of the integers min(A, B) and max(A, B) − min(A, B).
// Thus the gcd of A and B can be found as
// 1. If A = B then the gcd is B and the algorithm ends.
// 2. Replace A by max(A, B) − min(A, B), B by min(A, B). Go to Step 1.
// With the original Euclidean algorithm or otherwise, find the gcd of two positive integers.

// Let A = 24, B = 15. The original Euclidean algorithm computes
// 1. A = 24 − 15 = 9, B = 15
// 2. A = 15 − 9 = 6, B = 9
// 3. A = 9 − 6 = 3, B = 6
// 4. A = 6 − 3 = 3, B = 3
// That is, gcd(24, 15) = 3.

// 입력
// The input contains one line. The line contains two positive integers (each not larger than 32767) separated by spaces.

// 출력
// The output contains one integer which is the gcd of the two given positive integers.

// 입력 : 24 15
// 출력 : 3

import java.util.Scanner;

public class Euclid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = 0;

        for(int i = 1; i <= a && i <= b; i++) {
            if(a % i == 0 && b % i == 0) {
                max = i;
            }
        }
        System.out.print(max);
    }
}
