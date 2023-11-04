package 문제.FinalScore;

// We have had a problem with one of our hard disks and we lost the final score of some football matches.
// However, we have been able to recover the names of the players that scored and found the members of each team on Wikipedia.

// 입력
// The first line will contain three integers A, B and G representing the number of players in team A and team B
// and the number of goals scored in the match.
// The second line will contain A strings separated by spaces.
// The names of the players of team A.
// The third line will contain B strings separated by spaces.
// The names of the players of team B.
// The fourth line will contain G strings. The names of the players that scored.
// There will be at most 20 players in each team and at most 100 goals.
// The names of the players are lowercase latin letters and they will have at most 20 characters each.

// 출력
// Print "A" if the team A scored more than team B.
// Print "B" if the team B scored more than team A.
// Print "TIE" if both scored the same number of goals.

// 입력
// 3 3 5
// messi neymar suarez
// ronaldo bale james
// messi messi messi bale james

// 출력 : A

import java.util.HashSet;
import java.util.Scanner;

public class FinalScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int g = sc.nextInt();

        HashSet<String> aPlayers = new HashSet<>();
        HashSet<String> bPlayers = new HashSet<>();

        int teamA = 0;
        int teamB = 0;

        for (int i = 0; i < a; i++) {
            aPlayers.add(sc.next());
        }

        for (int i = 0; i < b; i++) {
            bPlayers.add(sc.next());
        }

        for (int i = 0; i < g; i++) {
            String scorer = sc.next();
            if (aPlayers.contains(scorer)) {
                teamA++;
            } else if (bPlayers.contains(scorer)) {
                teamB++;
            }
        }

        if (teamA > teamB) {
            System.out.println("A");
        } else if (teamB > teamA) {
            System.out.println("B");
        } else {
            System.out.println("TIE");
        }
    }
}
