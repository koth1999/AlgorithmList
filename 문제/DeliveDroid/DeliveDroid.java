package 문제.DeliveDroid;

// In the game, Deliv-e-droid, a robot droid has to deliver packages while avoiding obstacles.
// At the end of the game, the final score is calculated based on the following point system:
// Gain 50 points for every package delivered.
// Lose 10 points for every collision with an obstacle.
// Earn a bonus $500$ points if the number of packages delivered is greater than the number of collisions with obstacles.
// Your job is to determine the final score at the end of a game.

// 입력
// The input will consist of two lines. The first line will contain a non-negative integer
// P, representing the number of packages delivered. The second line will contain a non-negative integer
// C, representing the number of collisions with obstacles.

// 출력
// The output will consist of a single integer F, representing the final score.

// 입력 : 5 2
// 출력 : 730

import java.util.Scanner;

public class DeliveDroid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int c = sc.nextInt();

        int bonus = 0;

        int totalP = p * 50;
        int totalC = c * 10;

        if(p > c) {
            bonus += 500;
            System.out.println(totalP - totalC + bonus);
        } else {
            bonus += 0;
            System.out.println(totalP - totalC + bonus);
        }
    }
}
