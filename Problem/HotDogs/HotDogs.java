package Problem.HotDogs;

// In 2012 a new world record was set in the famous Nathan’s Hot Dog Eating Competition: the champion, Joey Chestnut, ate 68 hot dogs in ten minutes,
// an amazing increase from the 62 hot dogs eaten by the same Chestnut in 2011.
// Nathan’s Famous Corporation, in Brooklyn, NY, is responsible for the contest. They make delicious hot dogs, famous worldwide,
// but when it comes to math they are not so good. They want to apply for being listed in the Guinness World of Records,
// but for that they need to fill up a form describing basic facts about the competition. In particular,
// they are required to inform the average number of hot dogs eaten by participants during the contest.
// Can you help them? They promised to pay you with one of their tasty hot dogs.
// Given the total number of hot dogs consumed and the total number of participants in the contest,
// you must write a program to determine the average number of hot dogs eaten by participants.

// 입력
// Each test case is described using one line.
// The line contains two integers H and P representing respectively the total number of hot dogs consumed and the total number of participants in the contest (1 ≤ H, P ≤ 1000).

// 출력
// For each test case output a line with a rational number representing the average number of hot dogs eaten by participants.
// The result must be output as a rational number with exactly two digits after the decimal point, rounded if necessary.

// 입력
// 10 90
// 840 11
// 1 50
// 33 1000
// 34 1000
// 36 1000
// 37 1000
// 1 1000

// 출력
// 0.11
// 76.36
// 0.02
// 0.03
// 0.03
// 0.04
// 0.04
// 0.00

import java.util.Scanner;

public class HotDogs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) { // 무한 루프를 시작하며, 입력 스트림에 더 읽을 데이터가 있는지 확인
            int hotDog = sc.nextInt();
            int person = sc.nextInt();
            double total = (double) hotDog / person;

            System.out.printf("%.2f", total);
        }
    }
}
