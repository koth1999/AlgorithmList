package 문제.시험점수;

// 대한고등학교에 재학 중인 민국이와 만세는 4과목(정보, 수학, 과학, 영어)에 대한 시험을 봤다.
// 민국이와 만세가 본 4과목의 점수를 입력하면, 민국이의 총점 S와 만세의 총점 T 중에서 큰 점수를 출력하는 프로그램을 작성하시오.
// 단, 서로 동점일 때는 민국이의 총점 S를 출력한다.

// 입력 : 100 80 70 60
//       80 70 80 90
// 출력 : 320

import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        int[] b = new int[4];
        int s = 0; // 민국이 총점
        int t = 0; // 만세 총점

        for(int i=0; i<a.length; i++) {
            a[i] = sc.nextInt();
            s += a[i];
        }

        for(int i=0; i<b.length; i++) {
            b[i] = sc.nextInt();
            t += b[i];
        }

        if(s>t){
            System.out.print(s);
        }else if(s<t){
            System.out.print(t);
        }else{
            System.out.print(s);
        }
    }
}
