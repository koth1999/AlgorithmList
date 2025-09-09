package Problem.암호처리;

// 어떤 인터넷 서비스의 2가지 암호화 방법이 있다.
// 1. 입력받은 문자의 ASCII 코드값 + 2
// 2. (입력받은 문자의 ASCII 코드값 * 7) % 80 + 48
// 사용자의 패스워드로 2가지 방법으로 암호화한 결과를 출력하시오.

// 입력 : TEST
// 출력 : VGUV
//       L3EL

import java.util.Scanner;

public class EncryptionEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] word = str.toCharArray();

        for(int i=0; i<str.length(); i++) {
            word[i] += 2;
            System.out.print(word[i]);
        }

        System.out.println();

        for(int i=0; i<str.length(); i++) {
            word[i] -= 2;
            word[i] = (char)(((word[i]*7)%80)+48);
            System.out.print(word[i]);
        }
    }
}
