package Problem.Tax;

// The amount of income tax imposed on any taxpayer depends on his/her income.
// For an income less than or equal to 1,000,000 Oshloobs, no tax is paid.
// For an income greater than 1,000,000 and less than or equal to 5,000,000 Oshloobs, the tax is 10% of the income.
// For an income over 5,000,000 Oshloobs, the tax is 20% of the income.
// You should write a program to calculate the net income of any given employee after the deducted tax.

// 입력
// There are multiple lines in the input.
// Each line contains an employee’s income before the tax, which is a positive integer, a multiple of 1000,
// and not greater than 10,000,000. The input terminates with a line containing 0 which should not be processed.

// 출력
// For each employee, output a line containing the net income after the deducted tax.

// 입력
// 10000
// 50000
// 2000000
// 7500000
// 0

// 출력
// 10000
// 50000
// 1800000
// 6000000

import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int income = sc.nextInt();

            if(income == 0) { // 0이면 종료
                break;
            }

            if(income <= 1000000) {
                System.out.println(income);
            }else if(income >= 1000000 && income <= 5000000) {
                System.out.println(Math.round(income * 0.9));
            }else if(income >= 5000000) {
                System.out.println(Math.round(income * 0.8));
            }
        }
    }
}
