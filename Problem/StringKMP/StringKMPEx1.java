package Problem.StringKMP;

// KMP 알고리즘이 KMP인 이유는 이를 만든 사람의 성이 Knuth, Morris, Prett이기 때문이다.
// 첫 번째는 성을 모두 쓰고, 이를 하이픈(-)으로 이어 붙인 것이다. ex) Knuth-Morris-Prett
// 두 번째로 짧은 형태는 만든 사람의 성의 첫글자만 따서 부르는 것이다. ex) KMP

// 입력 : Knuth-Morris-Prett
// 출력 : KMP

// 문자 배열로 변경 후 출력
import java.util.Scanner;

public class StringKMPEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] word = str.toCharArray();

        for(char e : word) {
            if(e>='A' && e<='Z') System.out.print(e);
        }
    }
}
