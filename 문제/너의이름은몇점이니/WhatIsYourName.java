package 문제.너의이름은몇점이니;

import java.util.Scanner;

public class WhatIsYourName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 이름의 길이 입력
        int nameLength = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리

        // 이름 입력
        String name = sc.nextLine();

        int result = nameScore(name);
        System.out.println(result);
    }

    public static int nameScore(String name) {
        int[] scores = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26
        };

        name = name.replaceAll("\\s+", ""); // 공백 제거
        name = name.toUpperCase(); // 대문자로 변환

        int totalScore = 0;
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            totalScore += scores[letter - 'A'];
        }

        return totalScore;
    }
}
