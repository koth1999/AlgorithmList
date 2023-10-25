package 문제.SAHURIMSA;

// Midhat is a Network Security Engineer, based in Sarajevo. He is assigned to do some important consultation projects around the globe in July and August 2013.
// It happened that Ramadhan (the fasting month for Muslim) falls during these months for the year 2013.
// Midhat has to travel to several cities – Istanbul, Kuala Lumpur, Tokyo, Melbourne, Sao Paolo and Chicago.
// Even though it is permissible for Muslims not to fast when travelling, he prefers to continue fasting in Ramadhan.
// Midhat has no problem on this matter except he needs to make himself awake for sahur (early breakfast before dawn) on his own,
// which he is used to be waked by his mother at home.
// Midhat wants to have his sahur 45 minutes before imsa’ (end time for taking sahur). He decided to set his travelling alarm clock 45 minutes before imsa’,
// so that he can take his sahur in time, make his Fajr prayer and ready to work early.
// Since he’s travelling to different parts of the world, the imsa’ time differs from one city to another.
// Midhat wants to set his travelling clock to wake him up on time for all the cities he visits.
// Help Midhat by writing a program that will take one time stamp, in 24-hour notation, and print out a new time stamp, 45 minutes earlier, also in 24-hour notation.
// Note: In 24-hour time notation, it starts with 0:00 (midnight) and ends with 23:59 (one minute before midnight).
// In the input and output we'll ignore the leading zeros and colon for simplicity. So 0:00 will be written as 0 0.

// 입력
// The first line will contain number of test cases, T.
// After that T lines will follow, where each line will contain exactly two integers H and M (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) separated by a single space,
// the input time in 24-hour notation.
// H denotes hours and M minutes.

// 출력
// For each test case, the output contains a line in the format Case #x: followed by a sequence of integers,
// where x is the case number (starting from 1) and output one line with exactly two integers,
// the time 45 minutes before input time.

// 입력
// 4
// 5 0
// 10 10
// 0 30
// 23 47

// 출력
// Case #1: 4 15
// Case #2: 9 25
// Case #3: 23 45
// Case #4: 23 2

import java.util.Scanner;

public class SAHURIMSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            int hour = sc.nextInt();
            int min = sc.nextInt();
            int calc = (hour * 60)  + min;

            if(calc < 45) {
                calc = (24 * 60) + min;
            }
            calc -= 45;
            System.out.println("Case #" + i + ": " + (calc / 60) + " " + (calc % 60));
        }
    }
}
