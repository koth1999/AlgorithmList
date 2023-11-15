package 문제.Polling;

// Midterm elections are here! Help your local election commission by counting votes and telling them the winner.
// If more than one candidate ties with the most votes, print out all of their names in alphabetical order.

// 입력
// Each input will consist of a single test case. Note that your program may be run multiple times on different inputs.
// Each test case will begin with an integer n (1 ≤ n ≤ 1,000), indicating the number of votes.
// The next n lines will hold the votes.
// The candidates’ names will appear one per line, and consist of between 1 and 20 capital letters only.

// 출력
// Output the name of the candidate with the most votes.
// If there is a tie, output out all of the names of candidates with the most votes, one per line, in alphabetical order.
// Do not output any spaces, and do not output blank lines between names.

// 입력
// 5
// FRED
// BARNEY
// FRED
// FRED
// BARNEY

// 출력 : FRED

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Polling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int maxCount = 0;
        ArrayList<String> maxNames = new ArrayList<>();
        ArrayList<String> allNames = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            allNames.add(name);
            // 특정 요소의 빈도수를 반환하는 데 사용
            int count = Collections.frequency(allNames, name);

            if (count > maxCount) {
                maxCount = count;
                maxNames.clear(); // 컬렉션을 비우는 역할
                maxNames.add(name);
            } else if (count == maxCount && !maxNames.contains(name)) {
                // 동점 후보자 처리
                maxNames.add(name);
            }
        }

        Collections.sort(maxNames);
        for (String winner : maxNames) {
            System.out.println(winner);
        }
    }
}
