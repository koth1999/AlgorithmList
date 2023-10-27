package 문제.AnimalKingElection;

// King Dragon, the king of Animal Kingdom, passed away this morning. This unfortunate news saddened every animal.
// Since no one sees any other living dragon nowadays, the government of Animal Kingdom cannot find any successor to King Dragon.
// But Animal Kingdom cannot operate without a king. The government of Animal Kingdom decided to elect a new king.
// There are nine voters: Armadillo, Buffalo, Cat, Dog, Elephant, Fox, Goat, Hippo and Zebra and two candidates: Tiger and Lion.
// The votes will be anonymously casted tomorrow.
// The government asked you to write a program to calculate the votes and announce the next king of Animal Kingdom.
// Note that the next king is the one who receives more than half the votes.

// 입력
// The input has exactly nine lines.
// Each of them is a string which is either Tiger or Lion,
// and it represents a casted vote from an anonymous voter.

// 출력
// Output one line containing the next king’s name.

// 제한
// Every string in the input is either Tiger or Lion.
// The next king must be qualified by at least five votes.

// 입력
// Lion
// Lion
// Tiger
// Tiger
// Lion
// Lion
// Tiger
// Tiger
// Tiger

// 출력 : Tiger

import java.util.Scanner;

public class AnimalKingElection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] word = new String[9];
        int cnt1 = 0;
        int cnt2 = 0;

        for(int i = 0; i < word.length; i++) {
            word[i] = sc.next();
        }

        for(int i = 0; i < word.length; i++) {
            if(word[i].equals("Lion")) {
                cnt1++;
            }else if(word[i].equals("Tiger")) {
                cnt2++;
            }
        }

        if(cnt2 > cnt1 && cnt2 >= 5) {
            System.out.println("Tiger");
        }else{
            System.out.println("Lion");
        }
    }
}
