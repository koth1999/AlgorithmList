package 문제.괴짜교수;

// 승혁이는 괴짜 교수이다. 그는 미래에 컴퓨터 프로그램을 만들기 위해서는 컴퓨터 프로그램을 병렬로 만들어야 한다고 믿는다.
// 그가 옳다는 것을 확신시키기 위해서 그는 실험을 진행 하길 원했다.
// 실험과정은 다음과 같다: 그는 먼저 몇 개의 문제에 대해 이 프로그램이 다음 해 동안 실행 될 횟수를 예상한다.
// 그리고 그는 그의 조교에게 병렬버전의 프로그램을 개발하고, 그 프로그램을 개발하는 데 걸리는 시간을 측정하라고 지시한다.
// 마지막으로, 그들은 병렬버전과 직렬버전의 실행 시간을 측정한다.
// 이 측정된 데이터를 기반으로, 승혁이는 어떤 경우에 병렬화를 통해 전반적인 작업량을 최소화하는지 알고 싶어한다.
// 이 일에 대한 작업량은 병렬버전을 개발하는 시간과 그 프로그램이 실행될 때까지 기다리는 시간이다.

// 입력
// 첫째 줄에 입력으로 테스트케이스의 개수 T (T ≤ 1000)가 주어진다.
// 각각의 테스트케이스에 대해 정수 d, n, s, p가 한 칸의 공백을 사이로 주어진다.
// d (0 ≤ d ≤ 1000000)는 병렬 버전을 개발하는데 걸리는 시간이다.그리고 n (0 ≤ n ≤ 100000) 은 다음해 동안 이 프로그램이 실행되는 횟수이다.
// s와 p (0 ≤ s, p ≤ 1000) 는  각각 직렬버전과 병렬버전의 실행 시간이다.

// 출력
// 각각의 테스트케이스에 대해 병렬화를 하는게 좋으면 "parallelize" 를 출력하고, 병렬화를 하는게 좋지 않으면 "do not parallelize" 를 출력한다.
// 만약 직렬화와 병렬화를 통한 시간이 같으면 "does not matter" 를 출력한다.

import java.util.Scanner;

public class GeezerProfessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int d = sc.nextInt(); // 병렬버전 개발 시간
            int n = sc.nextInt(); // 다음해 동안 실행되는 프로그램 실행 횟수
            int s = sc.nextInt(); // 직렬 시간
            int p = sc.nextInt(); // 병렬 시간

            int parallelTime = d + n * p;
            int notParallelTime = n * s;

            if(parallelTime > notParallelTime) {
                System.out.println("do not parallelize");
            }else if(parallelTime < notParallelTime) {
                System.out.println("parallelize");
            }else {
                System.out.println("does not matter");
            }
        }
    }
}
