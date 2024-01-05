package 문제.SpeedLimit;

// Bill and Ted are taking a road trip. But the odometer in their car is broken, so they don't know how many miles they have driven. Fortunately, Bill has a working stopwatch, so they can record their speed and the total time they have driven. Unfortunately, their record keeping strategy is a little odd, so they need help computing the total distance driven.
// You are to write a program to do this computation.
// For example, if their log shows
// Speed in miles per hour	Total elapsed time in hours
// 20	2
// 30	6
// 10	7
// this means they drove 2 hours at 20 miles per hour, then 6-2=4 hours at 30 miles per hour, then 7-6=1 hour at 10 miles per hour.
// The distance driven is then (2)(20) + (4)(30) + (1)(10) = 40 + 120 + 10 = 170 miles.
// Note that the total elapsed time is always since the beginning of the trip, not since the previous entry in their log.

// 입력
// The input consists of one or more data sets. Each set starts with a line containing an integer n, 1 ≤ n ≤ 10,
// followed by n pairs of values, one pair per line. The first value in a pair, s, is the speed in miles per hour and the second value, t, is the total elapsed time.
// Both s and t are integers, 1 ≤ s ≤ 90 and 1 ≤ t ≤ 12.  The values for t are always in strictly increasing order. A value of -1 for n signals the end of the input.

// 출력
// For each input set, print the distance driven, followed by a space, followed by the word "miles".

// 입력
// 3
// 20 2
// 30 6
// 10 7
// 2
// 60 1
// 30 5
// 4
// 15 1
// 25 2
// 30 3
// 10 5
// -1

// 출력
// 170 miles
// 180 miles
// 90 miles


import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int t = sc.nextInt();
            int sum = 0;

            if (t == -1) {
                break;
            }

            int prevTime = 0;

            for (int i = 0; i < t; i++) {
                int speed = sc.nextInt();
                int time = sc.nextInt();

                sum += speed * (time - prevTime);
                prevTime = time;
            }
            System.out.println(sum + " miles");
        }
    }
}
