package Problem.C언어찾기;

// 길이가 100 이하인 문자열로 구성된 암호문을 발견했따. 이 문자열에서 "C"라는 문자와 "CC"라는 문자가
// 몇개인지 조사하고자 한다. (단, C, CC는 대소문자를 구분하지 않는다. 즉 "cC"는 "CC"와 같다.)

// 첫 번째 줄은 "C"의 개수, 두번째 줄은 "CC"의 개수

// 입력 : cCCc
// 출력 : 4 3

import java.util.Scanner;

public class FindC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] word = str.toCharArray();
        int cnt1 = 0;
        int cnt2 = 0;

        for(int i=0; i<word.length; i++) {
            if(word[i]=='c' || word[i]=='C') cnt1++;
            if(i!=word.length-1) {
                // 현재 문자가 문자열의 마지막 문자가 아닌 경우에만 조건을 만족하는 블록이다.
                // 이 조건은 마지막 문자 이후에는 다음 문자가 없기 때문에 'c' 또는 'C'와 연속으로 나타나는 쌍을 체크할 수 없기 때문에 사용된다.
                if((word[i]=='c' || word[i]=='C') && (word[i+1]=='c' || word[i+1]=='C')) cnt2++;
            }
        }
        System.out.println(cnt1);
        System.out.println(cnt2);
    }
}
