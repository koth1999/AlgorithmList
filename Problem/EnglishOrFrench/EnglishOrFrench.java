package Problem.EnglishOrFrench;

import java.util.Scanner;

public class EnglishOrFrench {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // 숫자 뒤에 남은 개행 제거

        int tCnt = 0;
        int sCnt = 0;

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (char ch : line.toCharArray()) {
                if (ch == 't' || ch == 'T') tCnt++;  // 독립 if
                if (ch == 's' || ch == 'S') sCnt++;  // 독립 if
            }
        }

        if (tCnt > sCnt) {
            System.out.println("English");
        } else {
            // 동률일 때도 French
            System.out.println("French");
        }
    }
}
