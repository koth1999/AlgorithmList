package 문제.ClassTime;

// It’s the first day of class! Tom is teaching class and first has to take attendance to see who is in class.
// He needs to call the students’ names in alphabetical order by last name.
// If two students have the same last name, then he calls the students with that same last name in alphabetical order by first name.
// Help him!

// 입력
// The first line of input contains an integer n (1 ≤ n ≤ 100), the number of students in Tom’s class.
// Each of the following n lines contains the name of a single student: first name, followed by a single space, then last name.
// The first and last name both start with an uppercase letter (‘A’–‘Z’) and then be followed by one or more lowercase letters (‘a’–‘z’).
// The first and last name of each student is no more than 10 letters long each.
//
// It is guaranteed that no two students have exactly the same name, though students may share the same first name,
// or the same last name.

// 출력
// Output n lines, the names of the students as Tom calls them in the desired order.

// 입력
// 3
// John Adams
// Bob Adam
// Bob Adams

// 출력
// Bob Adam
// Bob Adams
// John Adams

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ClassTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine(); // 개행 문자 처리

        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            names.add(name);
        }

        // 이름을 성(last name)을 기준으로 정렬
        Collections.sort(names, (name1, name2) -> {
            String[] parts1 = name1.split(" ");
            String[] parts2 = name2.split(" ");
            String lastName1 = parts1[1];
            String lastName2 = parts2[1];

            int result = lastName1.compareTo(lastName2);
            if (result == 0) {
                // 성(last name)이 동일한 경우 이름(first name)을 기준으로 정렬
                String firstName1 = parts1[0];
                String firstName2 = parts2[0];
                result = firstName1.compareTo(firstName2);
            }
            return result;
        });

        for (String name : names) {
            System.out.println(name);
        }
    }
}
