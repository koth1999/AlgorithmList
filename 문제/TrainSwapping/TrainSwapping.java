package 문제.TrainSwapping;

// At an old railway station, you may still encounter one of the last remaining "train swappers".
// A train swapper is an employee of the railroad, whose sole job it is to rearrange the carriages of trains.
// Once the carriages are arranged in the optimal order, all the train driver has to do is drop the carriages off, one by one, at the stations for which the load is meant.
// The title "train swapper" stems from the first person who performed this task, at a station close to a railway bridge.
// Instead of opening up vertically, the bridge rotated around a piller in the center of the river. After rotating the bridge 90 degrees, boats could pass left or right.
// The first train swapper had discovered that the bridge could be operated with at most two carriages on it.
// By rotating the bridge 180 degrees, the carriages switched place, allowing him to rearrange the carriages (as a side effect, the carriages then faced the opposite directions, but train carriages can move either way, so who cares).
// Now that almost all train swappers have died out, the railway company would like to automate their operation. Part of the program to be developed is a routine which decides, for a given train, the least number of swaps of two adjacent carriages necessary to order the train.
// Your assignment is to create a routine that computes the minimal number of swaps.

// Questions
// For a given train T, let m[T] denote the minimal number of swaps to order train T. What is the largest value of m[T] over all trains T with L > 0 carriages?
// Write a program that satisfies the specification below.

// 입력
// The input contains on the first line the number of test cases (N). Each test case consists of two input lines.
// The first line of a test case contains an integer L, determining the length of the train (0 ≤ L ≤ 50). The second line of a test case contains a permutation of the numbers 1 through L, indicating the current order of the carriages.
// The carriages should be ordered such that carriage 1 comes first, then 2, etc., with carriage L coming last.

// 출력
// For each test case output the sentence: "Optimal train swapping takes S swaps." where S is an integer representing the minimal number of swaps to order the train.

// 입력
// 3
// 3
// 1 3 2
// 4
// 4 3 2 1
// 2
// 2 1

// 출력
// Optimal train swapping takes 1 swaps.
// Optimal train swapping takes 6 swaps.
// Optimal train swapping takes 1 swaps.

import java.util.Scanner;

public class TrainSwapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int cnt = 0;

            for(int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }

            // 정렬된 상태에서 원래 순서대로 몇 번의 스왑이 필요한지 계산
            cnt = minSwaps(arr.clone());

            System.out.println("Optimal train swapping takes " + cnt + " swaps.");
        }
    }

    // 최소 스왑 횟수 계산하는 함수
    public static int minSwaps(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    // 두 칸을 교환하고 스왑 횟수 증가
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    count++;
                }
            }
        }
        return count;
    }
}
