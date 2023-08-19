package 문제.암호화방법;

// Vigenere cipher이라는 암호화 방법은 암호화하려는 문장(평문)의 단어와 암호화 키를 숫자로 바꾼 다음
// 평문의 단어에 해당하는 숫자에 암호 키에 해당하는 숫자를 더하는 방식이다. 이 방법을 변형하여 평문의 단어에 암호화 키에
// 해당하는 숫자를 빼서 암호화하는 방식을 생각해 보자.
// ex) 암호화 키가 "love"이고, 암호화할 문장이 "nice day"라면 다음과 같이 암호화가 이루어진다.

// 암호화 키 : l o v e l o v e
// 평문 :     n i c e   d a y
// 암호문 :    b t g z   o e t

// 제시된 평문의 첫 번째 문자인 'n'은 해당 암호화 키 'l'의 알파벳 순서가 12이므로 알파벳상의 순서에서 'n'보다 12앞의 문자인 'b'로 변형된다.
// 변형된 문자가 'a' 이전의 문자가 되면 알파벳 상에서 맨 뒤로 순서를 돌린다. 예를 들면 평문의 세 번째 문자인 'c'는 알파벳 상에서 3번째이고 대응하는
// 암호화키 'v' 알파벳 순서 22로 'c'에서 22 앞으로 당기면 'a'보다 훨씬 앞의 문자이어야 하는데, 'a' 앞의 문자가 없으므로 'z'로 돌아가
// 반복되어 'g'가 된다. 즉 평문의 문자를 암호화키의 문자가 알파벳 상에서 차지하는 순서만큼 앞으로 뺀 것으로 암호화한다.
// 평문의 문자가 공백 문자인 경우는 그 공백 문자를 그대로 출력한다.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String normal = sc.nextLine();
        String encrypt = sc.next();
        char value = 0;
        char[] enc = encrypt.toCharArray();
        List<Character> vig = new ArrayList<>();

        for(int i = 0; i<normal.length(); i++) {
            if(normal.charAt(i) == ' ') vig.add(' ');
            else {
                value = (char)(normal.charAt(i)-(enc[i%encrypt.length()]-'a')-1);
                if(value < 'a') value += 26;
                vig.add(value);
            }
        }

        for(Character e : vig) {
            System.out.print(e);
        }
    }
}
