package 문제.PassportChecking;

// This task is inspired by the recent MH370 stolen passport incident.
// The Interpol database contains a list of N stolen passport numbers.
// We have another list of M passport numbers to check if they are stolen or not.

// 입력
// The first line of the input contains an integer N. (1 ≤ N ≤ 100,000)
// The next N lines contains the list of N stolen passport numbers, one passport number per line.
// The next line of the input contains an integer M. (1 ≤ M ≤ 100,000)
// The next M lines contains the list of M passport numbers, one passport number per line.
// Passport numbers are alphanumeric (combination of alphabetic and numeric characters) and are of length at most 15

// 출력
// Output the total number of stolen passports in the list of M passports.

// 입력
// 10
// I220232074
// D327045452
// L261687170
// H720628600
// T181830847
// I108428623
// J316167657
// M520837168
// H364436380
// J531555744
// 5
// U133207838
// D327045452
// S374500074
// U882158042
// H364436380

// 출력 : 2

import java.util.HashSet;
import java.util.Scanner;

public class PassportChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String> stolenPassports = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String passportNumber = sc.next();
            stolenPassports.add(passportNumber);
        }

        int m = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < m; i++) {
            String passportNumber = sc.next();
            if (stolenPassports.contains(passportNumber)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
