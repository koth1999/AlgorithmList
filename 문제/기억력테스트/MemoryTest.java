package 문제.기억력테스트;

// 주현이는 5살이라서 아직 기억력이 좋지 않은 편이다. 주현이 엄마는 주현이의 기억력을 향상 시키기 위해 매일 훈련을 시킨다.
// 어느 날, 주현이 엄마는 주현이에게 10개의 숫자를 차례대로 말한 다음 "k번째 숫자는 뭘까요?"하고 물어본다.
// 이번에는 주현이가 좋아하느 "또봇"이라는 로봇변신 자동차가 상품으로 걸려있다. 주현이가 "또봇"을 가질 수 있도록 프로그래밍 하시오.

// 입력 : 10 9 8 7 6 5 4 3 2 1
//       3
// 출력 : 8

import java.util.Scanner;

public class MemoryTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        System.out.print(arr[k-1]);
    }
}
