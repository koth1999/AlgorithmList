package Problem.애너그램;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 테스트 케이스 개수
        for (int i = 0; i < t; i++) {
            String word1 = sc.next();
            String word2 = sc.next();

            if (isAnagram(word1, word2)) {
                System.out.println(word1 + " & " + word2 + " are anagrams.");
            } else {
                System.out.println(word1 + " & " + word2 + " are NOT anagrams.");
            }
        }
    }

    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
