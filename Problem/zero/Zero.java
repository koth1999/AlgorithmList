package Problem.zero;

import java.util.Scanner;

public class Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int next = t + 1;

            while(String.valueOf(next).contains("0")) {
                next++;
            }

            System.out.println(next);
        }
    }
}
