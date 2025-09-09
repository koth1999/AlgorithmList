package Problem.RaceResults;

// The herd has run its first marathon!
// The N (1 <= N <= 5,000) times have been posted in the form of Hours (0 <= Hours <= 99),
// Minutes (0 <= Minutes <= 59), and Seconds (0 <= Seconds <= 59).
// Bessie must sort them (by Hours, Minutes, and Seconds) into ascending order, smallest times first.
// Consider a simple example with times from a smaller herd of just 3 cows (note that cows do not run 26.2 miles so very quickly):

//    11:20:20
//    11:15:12
//    14:20:14
// The proper sorting result is:
//    11:15:12
//    11:20:20
//    14:20:14

// 입력
// Line 1: A single integer: N
// Lines 2..N+1: Line i+1 contains cow i's time as three space-separated integers: Hours, Minutes, Seconds

// 출력
// Lines 1..N: Each line contains a cow's time as three space-separated integers

// 입력
// 3
// 11 20 20
// 11 15 12
// 14 20 14

// 출력
// 11 15 12
// 11 20 20
// 14 20 14

import java.util.Arrays;
import java.util.Scanner;

public class RaceResults {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] times = new int[t][3]; // 시간, 분, 초를 저장할 배열

        for (int i = 0; i < t; i++) {
            int hour = sc.nextInt();
            int min = sc.nextInt();
            int sec = sc.nextInt();

            times[i][0] = hour;
            times[i][1] = min;
            times[i][2] = sec;
        }

        // 시간, 분, 초를 기준으로 정렬(람다식)
        Arrays.sort(times, (t1, t2) -> {
            if (t1[0] != t2[0]) {
                return Integer.compare(t1[0], t2[0]);
            } else if (t1[1] != t2[1]) {
                return Integer.compare(t1[1], t2[1]);
            } else {
                return Integer.compare(t1[2], t2[2]);
            }
        });

        for (int[] time : times) {
            System.out.println(time[0] + " " + time[1] + " " + time[2]);
        }
    }
}
