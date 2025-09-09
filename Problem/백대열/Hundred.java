package Problem.백대열;

// 대열이는 욱제의 친구다.
// “야 백대열을 약분하면 뭔지 알아?”
// “??”
// “십대일이야~ 하하!”
// n:m이 주어진다. 욱제를 도와주자. (...)

// 입력
// n과 m이 :을 사이에 두고 주어진다. (1 ≤ n, m ≤ 100,000,000)

// 출력
// 두 수를 최대한으로 약분하여 출력한다.

// 입력 : 100:10
// 출력 : 10:1

import java.util.Scanner;

public class Hundred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] word = str.split(":");

        int n = Integer.parseInt(word[0]);
        int m = Integer.parseInt(word[1]);
        int max = 0;

        for(int i = 1 ; i <= n && i <= m; i++) {
            if(n % i == 0 && m % i == 0) {
                max = i;
            }
        }
        System.out.print((n / max) + ":" + (m / max));
    }
}
