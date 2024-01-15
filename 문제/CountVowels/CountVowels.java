package 문제.CountVowels;

// Gru has been trying to teach the minions English (they are born knowing only Minionese, which Lucy can’t stand).
// He is currently stuck trying to teach them the difference between vowels and consonants, which the minions are always confused about, especially “y”, which they argue about endlessly (it is not a vowel).
// To help them practice, Gru starts a contest where the minions have to count the number of vowels in a word, i.e., given a word, they have to tell Gru what is the number of vowels in it.
// The winner gets ice cream, which the minions are crazy about. Kevin the Minion wants your help to cheat and eat a lot of ice cream.

// 입력
// The first line in the test data file contains the number of test cases (< 100).
// After that, each line contains one test case, a word, w, (provided as a String).
// You can assume that the words are provided in all lowercase letters (i.e., “gru”, not “Gru”).

// 출력
// For each test case, you are to output the number of vowels in that word.
// The vowels are: “a”, “e”, “i”, “o”, and “u”. The exact format is shown below in the examples.

// 입력
// 3
// despicable
// gru
// nth

// 출력
// The number of vowels in despicable is 4.
// The number of vowels in gru is 1.
// The number of vowels in nth is 0.

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            String word = sc.next();
            int cnt = countVowels(word);
            System.out.println("The number of vowels in " + word + " is " + cnt + ".");
        }
    }

    public static int countVowels(String word) {
        String[] arr = {"a", "e", "i", "u", "o"};
        int cnt = 0;

        for (int j = 0; j < word.length(); j++) {
            String currentChar = String.valueOf(word.charAt(j));
            if (contains(arr, currentChar)) {
                cnt++;
            }
        }
        return cnt;
    }

    public static boolean contains(String[] arr, String target) {
        for (String str : arr) {
            if (str.equals(target)) {
                return true;
            }
        }
        return false;
    }
}
