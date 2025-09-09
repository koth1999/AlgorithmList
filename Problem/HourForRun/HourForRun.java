package Problem.HourForRun;

import java.util.Scanner;

public class HourForRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int n = sc.nextInt();

        int total = v * n;

        for (int i = 1; i <= 9; i++) {
            int result = (int) Math.ceil(total * (i * 10) / 100.0);
            System.out.print(result + " ");
        }
    }
}
