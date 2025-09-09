package Problem.ThreePointsForWin;

// Three points for a win is a common point system used in competitions such as football (soccer) leagues or group tournaments.
// In this system, a team is awarded 3 points if they win a match, 1 point for a draw, and 0 points if they lose.
// Finally, the team with the most points wins the league.
// Supposed BINUS’ football team joins a league and has played N matches. At the ith match, BINUS’ team scores Ai vs Bi against their opponent.
// If Ai > Bi, then BINUS’ team wins the ith match; if Ai < Bi, then BINUS’ team loses the match; otherwise, if Ai = Bi, then it’s a draw.
// Given the score of each match, your task is to determine the total points accumulated by BINUS’ team.
// For example, let N = 4 where A1..4 = {3, 0, 2, 4} and B1..4 = {1, 1, 2, 3}.
// At the first match, BINUS’ team wins by 3 vs 1.
// At the second match, BINUS’ team loses by 0 vs 1.
// The third match is a draw (both have the same score of 2).
// At the fourth match, BINUS’ team wins by 4 vs 3.
// Therefore, the total points accumulated by BINUS’ team in this example is: 3 + 0 + 1 + 3 = 7.

// 입력
// Input begins with a line containing an integer: N (1 ≤ N ≤ 100) representing the number of matches.
// The next line contains N integers: Ai (0 ≤ Ai ≤ 10) representing the score of BINUS’ team.
// The next line contains N integers: Bi (0 ≤ Bi ≤ 10) representing the score of BINUS’ opponent team.


// 출력
// Output in a line an integer representing the total points accumulated by BINUS’ team.

// 입력
// 4
// 3 0 2 4
// 1 1 2 3

// 출력 : 7

import java.util.Scanner;

public class ThreePointsForWin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] a = new int[t];
        int[] b = new int[t];

        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        int total = 0;

        for(int i = 0; i < t; i++) {
            if(a[i] > b[i]) {
                total += 3;
            }else if(a[i] == b[i]) {
                total += 1;
            }
        }
        
        System.out.println(total);
    }
}
