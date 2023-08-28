package 문제.생년월일;

// 주민등록번호의 출생년도, 출생월, 출생일 및 성별을 출력하는 프로그램을 작성하시오.
// 출생년도는 주민등록번호 앞 2자리이고, 출생월은 주민등록번호 3, 4자리, 출생일은 주민등록번호 5, 6 자리
// 성별은 ‘-’ 문자 다음에 나오는 숫자가 1이면 2000년 이전에 출생한 남자, 2면 2000년 이전에 출생한 여자로 한다.
// 만약, ‘-’ 문자 다음에 3이면 2000년 이후에 출생한 남자, 4면 2000년 이후에 출생한 여자로 한다.
// 출력시 남자는 ‘M’, 여자는 ‘F’로 출력한다.

// 입력 : 781201-1273845
// 출력 : 1978/12/01 M

import java.util.Scanner;

public class BirthDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] word = str.split("-");

        String birthYear = word[0].substring(0,2); // 연도
        String birthMonth = word[0].substring(2,4); // 월
        String birthDay = word[0].substring(4,6); // 일
        int genderCode = Integer.parseInt(word[1].substring(0,1)); // 성별

        String gender;
        if(genderCode == 1 || genderCode == 3) {
            gender = "M";
        }else if(genderCode == 2 || genderCode == 4) {
            gender = "F";
        } else {
            gender = "Unknown";
        }

        int yearPrefix = (genderCode == 3 || genderCode == 4) ? 2000 : 1900; // 뒷자리 7자리
        int birthYearInt = Integer.parseInt(birthYear);
        int fullBirthYear = yearPrefix + birthYearInt;

        System.out.printf("%d/%s/%s %s\n", fullBirthYear, birthMonth, birthDay, gender);

    }
}
