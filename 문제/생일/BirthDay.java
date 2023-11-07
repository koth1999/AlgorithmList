package 문제.생일;

// 어떤 반에 있는 학생들의 생일이 주어졌을 때, 가장 나이가 적은 사람과 가장 많은 사람을 구하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 반에 있는 학생의 수 n이 주어진다. (1 ≤ n ≤ 100)
// 다음 n개 줄에는 각 학생의 이름과 생일이 "이름 dd mm yyyy"와 같은 형식으로 주어진다. 이름은 그 학생의 이름이며, 최대 15글자로 이루어져 있다.
// dd mm yyyy는 생일 일, 월, 연도이다. (1990 ≤ yyyy ≤ 2010, 1 ≤ mm ≤ 12, 1 ≤ dd ≤ 31) 주어지는 생일은 올바른 날짜이며, 연, 월 일은 0으로 시작하지 않는다.
// 이름이 같거나, 생일이 같은 사람은 없다.

// 출력
// 첫째 줄에 가장 나이가 적은 사람의 이름, 둘째 줄에 가장 나이가 많은 사람 이름을 출력한다.

// 입력
// 5
// Mickey 1 10 1991
// Alice 30 12 1990
// Tom 15 8 1993
// Jerry 18 9 1990
// Garfield 20 9 1990

// 출력
// Tom
// Jerry

import java.util.Scanner;

public class BirthDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String maxName = "";
        String minName = "";

        int maxD = Integer.MIN_VALUE;
        int maxM = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        int minD = Integer.MAX_VALUE;
        int minM = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int dd = sc.nextInt();
            int mm = sc.nextInt();
            int yyyy = sc.nextInt();

            if (yyyy > maxY || (yyyy == maxY && mm > maxM) || (yyyy == maxY && mm == maxM && dd > maxD)) {
                maxName = name;
                maxY = yyyy;
                maxM = mm;
                maxD = dd;
            }

            if (yyyy < minY || (yyyy == minY && mm < minM) || (yyyy == minY && mm == minM && dd < minD)) {
                minName = name;
                minY = yyyy;
                minM = mm;
                minD = dd;
            }
        }

        System.out.println(maxName);
        System.out.println(minName);
    }
}
