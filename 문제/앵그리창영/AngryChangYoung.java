package 문제.앵그리창영;

// 창영이는 화가나서 성냥을 바닥에 던졌다. 상근이는 바닥이 더러워진 것을 보고 창영이를 매우 혼냈다.
// 강산이는 근처에서 박스를 발견했다. 상덕이는 강산이가 발견한 박스를 상근이에게 주었다.
// 상근이는 박스에 던진 성냥을 모두 담아오라고 시켰다. 하지만, 박스에 들어가지 않는 성냥도 있다.
// 이런 성냥은 박스에 담지 않고 희원이에게 줄 것이다. 성냥이 박스에 들어가려면, 박스의 밑면에 성냥이 모두 닿아야 한다.
// 박스의 크기와 성냥의 길이가 주어졌을 때, 성냥이 박스에 들어갈 수 있는지 없는지를 구하는 프로그램을 작성하시오.
// 창영이는 성냥을 하나씩 검사한다.

// 첫째 줄에 던진 성냥의 개수 N과 박스의 가로 크기 W와 세로 크기 H가 주어진다. (1 ≤ N ≤ 50, 1 ≤ W, H ≤ 100)
// 다음 N개 줄에는 성냥의 길이가 주어진다. 길이는 1보다 크거나 같고 1000보다 작거나 같은 자연수이다.
// 입력으로 주어지는 각각의 성냥에 대해서, 박스안에 들어갈 수 있으면 "DA" 없으면 "NE"를 출력한다.

import java.util.Scanner;

public class AngryChangYoung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 성냥 개수
        int w = sc.nextInt(); // 성냥 가로 크기
        int h = sc.nextInt(); // 성냥 세로 크기

        for(int i=0; i<n; i++) {
            int length = sc.nextInt();
            if((w * w) + (h * h) >= (length * length)) {
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }
        }
    }
}
