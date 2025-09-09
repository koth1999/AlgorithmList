package Problem.NoBrainer;

// Zombies love to eat brains. Yum.

// 입력
// The first line contains a single integer n indicating the number of data sets.
// The following n lines each represent a data set. Each data set will be formatted according to the following description:
// A single data set consists of a line "X Y",
// where X is the number of brains the zombie eats and Y is the number of brains the zombie requires to stay alive.

// 출력
// For each data set, there will be exactly one line of output.
// This line will be "MMM BRAINS" if the number of brains the zombie eats is greater than or equal to the number of brains the zombie requires to stay alive.
// Otherwise, the line will be "NO BRAINS".

// 입력
// 3
// 4 5
// 3 3
// 4 3

// 출력
// NO BRAINS
// MMM BRAINS
// MMM BRAINS

import java.util.Scanner;

public class NoBrainer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int x = sc.nextInt(); // 좀비가 먹는 뇌의 수
            int y = sc.nextInt(); // 좀비가 생존하기 위해 필요한 뇌의 수

            if(x > y || x == y) {
                System.out.println("MMM BRAINS");
            }else{
                System.out.println("NO BRAINS");
            }
        }
    }
}
