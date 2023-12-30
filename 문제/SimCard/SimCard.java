package 문제.SimCard;

// There are three mobile operators in Iran. Each operator has different prices for call and data usage,
// given in the table below. All prices are in Rials:

// #	Name	Call (per minute)	Data (per megabyte)
// 1	ParsTel	30	40
// 2	ParsCell	35	30
// 3	ParsPhone	40	20
// Some foreign students have arrived Iran to participate in the ACM-ICPC, Tehran Site.
// They already know how many minutes they will call, and how much Internet they will use.
// For each student, you want to recommend an operator to minimize the total cost of call usage and data usage for that student.

// 입력
// Each line of the input contains the information of one student.
// For each student, there are two positive integers c and d (1 ≤ c, d ≤ 1000)
// that show the amount of call (in minutes) and data usage (in megabytes) for the student, respectively.
// The input terminates with “0 0” that should not be processed.

// 출력
// For each student, print a line containing the minimum total cost of call usage and data usage.

import java.util.Scanner;

public class SimCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                break;
            }

            int parsTel = 30 * a + 40 * b;
            int parsCell = 35 * a + 30 * b;
            int parsPhone = 40 * a + 20 * b;

            // 각 통신사별 비용을 계산 후, 가장 작은 비용을 선택하여 출력
            int minCost = Math.min(parsTel, Math.min(parsCell, parsPhone));
            System.out.println(minCost);
        }
    }
}
