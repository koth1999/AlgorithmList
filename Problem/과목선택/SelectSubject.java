package Problem.과목선택;

// JOI는 물리, 화학, 생물, 지구과학, 역사, 지리 총 6 과목의 시험을 봤다. 각 시험의 만점은 100점이다.
// JOI는 물리, 화학, 생물, 지구과학 4과목 중에서 3 과목을 선택하고 역사, 지리 2 과목 중에서 한 과목을 선택한다.
// 시험 점수의 합이 가장 높게 나오도록 과목을 선택할 때, JOI가 선택한 과목의 시험 점수의 합을 구하시오.

//입력
// 입력은 6행으로 되어있으며, 각 행에 1개의 정수가 주어진다.
// 1행에는 JOI의 물리 시험의 점수 A가 주어진다.
// 2행에는 JOI의 화학 시험의 점수 B가 주어진다.
// 3행에는 JOI의 생물 시험의 점수 C가 주어진다.
// 4행에는 JOI의 지구과학의 시험 점수 D가 주어진다.
// 5행에는 JOI의 역사 시험의 점수 E가 주어진다.
// 6행에는 JOI의 지리 시험의 점수 F가 주어진다.
// 입력한 정수 A, B, C, D, E, F는 모두 0이상 100이하이다.

// 출력
// JOI가 선택한 과목의 총 점수를 1행에 출력하시오.

// 100
// 34
// 76
// 42
// 10
// 0

// 228

import java.util.Scanner;

public class SelectSubject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 네 과목 중에서 최저 점수를 찾아서 빼기
        int minScore = Math.min(Math.min(arr[0], arr[1]), Math.min(arr[2], arr[3]));
        int totalScore = arr[0] + arr[1] + arr[2] + arr[3] - minScore;

        // 역사와 지리 중에서 높은 점수 선택하여 합산
        int history = arr[4];
        int Geography = arr[5];
        int historyOrGeography = Math.max(history, Geography);
        totalScore += historyOrGeography;

        // 결과 출력
        System.out.println(totalScore);
    }
}
