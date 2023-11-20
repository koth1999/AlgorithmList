package 문제.Banana;

// After NASA discovered water on Mars, they decided to expand their exploration hoping to find some alien intelligence on the planet.
// After months of exploration, they were actually surprised to find out that the planet has been inhabited by minions.
// NASA started communications with the minions and the first message they received was Mo amo Banana.
// At first, it was really hard to decipher the message but after sometime they managed to workout a dictionary that maps English words to Minionese words.
// You are going to help NASA build the translator to ease their communication with Minions for the good and prosperity of mankind and minionkind.

// 입력
// The first line of input will contain a single integer N, the number of words in the dictionary (1 ≤ N ≤ 100).
// The following N lines will each contain a sentence of the format x = y where x is an English word and y is a Minionese word.
// The next line will contain an integer T, the number of test cases (1 ≤ T ≤ 100). Each test case will start with a line containing an integer K,
// the number of words in the sentence (1 ≤ K ≤ 100) and the next line will contain K space separated English words.
// All the English words in the test cases exist in the defined dictionary.
// Also, all the words consist only of English alphabet, and will be at most 20 characters long.

// 출력
// For each test case, print a single line containing the space separated Minionese words after translation.

// 입력
// 4
// I = mo
// love = amo
// icecream = gelatooo
// banana = banana
// 2
// 3
// I love banana
// 3
// I love icecream

// 출력
// mo amo banana
// mo amo gelatooo

import java.util.HashMap;
import java.util.Scanner;

public class Banana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 개행문자 처리

        HashMap<String, String> wordMap = new HashMap<>(); // 영어와 미니언어 매핑을 저장할 HashMap

        // 영어와 미니언어 단어 매핑하기
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" = ");
            wordMap.put(input[0], input[1]);
        }

        int t = sc.nextInt();
        sc.nextLine(); // 개행문자 처리

        // 테스트 케이스 처리
        for (int i = 0; i < t; i++) {
            int cnt = sc.nextInt();
            sc.nextLine(); // 개행문자 처리

            String result = "";

            for (int j = 0; j < cnt; j++) {
                String word = sc.next();
                result += wordMap.get(word) + " "; // word키에 해당값 반환
            }

            System.out.println(result.trim()); // 문자열 앞 뒤공백 제거
        }
    }
}
