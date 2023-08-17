package 문제.저항구하기;

// 전자 제품에는 저항이 들어간다. 저항은 색 3개를 이용해서 그 저항이 몇 옴인지 나타낸다.
// 처음 색 2개는 저항의 값이고, 마지막 색은 곱해야 하는 값이다. 저항의 값은 다음과 같다.

// 색         값          곱
// black      0          1
// brown      1          10
// red        2          100
// orange     3          1,000
// yellow     4          10,000
// green      5          100,000
// blue       6          1,000,000
// violet     7          10,000,000
// grey       8          100,000,000
// white      9          1,000,000,000

// 입력 : yellow violet red
// 출력 : 4700

import java.util.Scanner;

public class ResistanceEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] color = {"black", "brown", "red", "orange", "yellow",
        "green", "blue", "violet", "grey", "white"};
        int fst = 0, sec = 0, thd = 0;
        String fstColor = sc.next();
        String secColor = sc.next();
        String thdColor = sc.next();

        for(int i=0; i<color.length; i++) {
            if(fstColor.equals(color[i])) fst = i;
            if(secColor.equals(color[i])) sec = i;
            if(thdColor.equals(color[i])) thd = i;
        }
        System.out.print((long)((fst*10)+sec)*(long)(Math.pow(10, thd)));
    }
}
