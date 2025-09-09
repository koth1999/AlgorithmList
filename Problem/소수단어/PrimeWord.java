package Problem.소수단어;

// 소수란 1과 자기 자신으로만 나누어 떨어지는 수를 말한다. 이 문제에서는 편의상 1도 소수라 하자.
// 알파벳 대소문자로 이루어진 영어 단어가 하나 있을 때, a를 1로, b를 2로, ..., z를 26으로, A를 27로, ..., Z를
// 52로 하여 그 합을 구한다. 예를 들어 cyworld는 합을 구하면 100이 되고, abcd는 10이 된다.
// 이와 같이 구한 수가 소수인 경우, 그 단어를 소수단어라고 한다. 단어가 주어졌을 때, 그 단어가 소수 단어인지 판별하는 프로그램을 작성하시오.

// 입력 : UFRN  출력 : It is a prime word
// 입력 : contest 출력 : It is not a prime word
import java.util.Scanner;

public class PrimeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int sum = 0;
        boolean isPrime = true;

        for(int i=0; i<word.length(); i++) {
            if(word.charAt(i)>='A' && word.charAt(i)<='Z') sum += word.charAt(i)-'a'+1;
            else sum += word.charAt(i)-'A'+1;
        }

        for(int i=0; i<sum; i++) {
            if(sum%i==0) isPrime = false;
        }

        if(isPrime) System.out.println("It is a prime word.");
        else System.out.println("It is not a prime word.");
    }
}
