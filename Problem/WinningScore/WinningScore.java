package Problem.WinningScore;

// You record all of the scoring activity at a basketball game. Points are scored by a 3-point shot, a 2-point field goal, or a 1-point free throw.
// You know the number of each of these types of scoring for the two teams: the Apples and the Bananas.
// Your job is to determine which team won, or if the game ended in a tie.
// The first three lines of input describe the scoring of the Apples,
// and the next three lines of input describe the scoring of the Bananas.
// For each team, the first line contains the number of successful 3-point shots,
// the second line contains the number of successful 2-point field goals,
// and the third line contains the number of successful 1-point free throws.
// Each number will be an integer between 0 and 100, inclusive.
// The output will be a single character. If the Apples scored more points than the Bananas,
// output 'A'. If the Bananas scored more points than the Apples, output 'B'.
// Otherwise, output 'T', to indicate a tie.

// 입력
// 10
// 3
// 7
// 8
// 9
// 6

// 출력
// B

// The Apples scored 10⋅3+3⋅2+7⋅1 = 43 points and the Bananas scored 8⋅3+9⋅2+6⋅1 = 48 points, and thus the Bananas won.

import java.util.Scanner;

public class WinningScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int threeA = sc.nextInt();
        int fieldA = sc.nextInt();
        int freeA = sc.nextInt();

        int threeB = sc.nextInt();
        int fieldB = sc.nextInt();
        int freeB = sc.nextInt();

        int scoreA = threeA * 3 + fieldA * 2 + freeA * 1;
        int scoreB = threeB * 3 + fieldB * 2 + freeB * 1;

        if(scoreA > scoreB) {
            System.out.println("A");
        }else if(scoreA < scoreB) {
            System.out.println("B");
        }else {
            System.out.println("T");
        }
    }
}
