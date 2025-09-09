package Problem.MP3Songs;

// Sue loves her mp3 player but she hates the fact that her shuffle mode plays her tracks randomly.
// Because she loves order and patterns she would like the tunes on her mp3 player to be played in alphabetical order.
// In this problem you have to help Sue by sorting her tunes into alphabetical order of tune name.

// 입력
// Input consists of a number of scenarios, each beginning with a single positive integer, n,
// the number of music tracks that require sorting (1 < n <= 200).
// The last line of input is a single 0 – this scenario should not be processed.

// Each scenario consists of n lines, each line containing a tune name.
// No line will contain more than 250 characters. Each name will begin with an alphabetic character.

// 출력
// Output will consist of the scenario number, the first being 1, on a line on its own.
// This will be followed by n lines showing the tune names from the input list, sorted in alphabetical order, one name per line.
// Case should be ignored.

// 10
// Forever
// Take A Bow
// Always On My Mind
// Lollipop
// Love In This Club
// No Air
// Sweet About Me
// Party People
// Mercy
//American Boy
// 8
// Partita
// Air on a 'G' string
// Sinfonia in D
// Jesu, joy of man's desiring
// Arioso
// Violin Concerto in A Minor
// Brandenburg Concerto 2
// Concerto for 2 violins
// 0

// 출력
// 1
// Always On My Mind
// American Boy
// Forever
// Lollipop
// Love In This Club
// Mercy
// No Air
// Party People
// Sweet About Me
// Take A Bow
// 2
// Air on a 'G' string
// Arioso
// Brandenburg Concerto 2
// Concerto for 2 violins
// Jesu, joy of man's desiring
// Partita
// Sinfonia in D
// Violin Concerto in A Minor

import java.util.Arrays;
import java.util.Scanner;

public class MP3Songs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;

        while(true) {
            int n = sc.nextInt();
            sc.nextLine();

            if (n == 0) {
                break;
            }

            String[] word = new String[n];

            for (int i = 0; i < n; i++) {
                word[i] = sc.nextLine();
            }

            // 대소문자 구분하지 않고 알파벳 순서 정렬
            Arrays.sort(word, String.CASE_INSENSITIVE_ORDER);

            System.out.println(num);
            num++;

            for (int i = 0; i < n; i++) {
                System.out.println(word[i]);
            }
        }
    }
}

