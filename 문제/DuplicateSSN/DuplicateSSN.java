package 문제.DuplicateSSN;

// The U.S. Social Security Administration has made a terrible mistake.
// When assigning new Social Security numbers (SSN) to U.S. citizens they accidently assigned some duplicate numbers.
// Fortunately, they caught this mistake early and have a list all the possible duplicates.
// The Social Security Administration must contact all the people that do not have a unique SSN.
// Your job is to read the list of Social Security numbers and find all the duplicates.
// You will then print the list of duplicates in ascending order.

// 입력
// The input is a list of Social Security numbers, one per line.
// Input will be terminated with the Social Security number 000-00-0000, which is not a duplicate.

// 출력
// A list of all Social Security numbers, in ascending order, that appear more than once as input.

// 예제
// 555-44-6666
// 111-99-4444
// 012-00-1111
// 888-98-9086
// 555-44-6666
// 234-54-3425
// 012-00-1111
// 555-44-6666
// 000-00-0000

// 출력
// 012-00-1111
// 555-44-6666

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateSSN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> phoneNum = new ArrayList<>();

        while (true) {
            String phone = sc.nextLine();

            if (phone.equals("000-00-0000")) {
                break;
            }

            phoneNum.add(phone);
        }

        Collections.sort(phoneNum);

        HashSet<String> duplicates = new HashSet<>();
        for (int i = 0; i < phoneNum.size() - 1; i++) {
            if (phoneNum.get(i).equals(phoneNum.get(i + 1))) {
                duplicates.add(phoneNum.get(i));
            }
        }

        ArrayList<String> ssn = new ArrayList<>(duplicates);
        Collections.sort(ssn);

        for (String duplicate : ssn) {
            System.out.println(duplicate);
        }
    }
}
