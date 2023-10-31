package 문제.줄번호;

// 텍스트에서 줄을 입력받은 뒤, 줄 번호를 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 줄의 수 N이 주어진다. 둘째 줄부터 N개의 줄에 각 줄의 내용이 주어진다. 각 줄에 있는 글자의 개수는 50글자를 넘지 않는다.

// 출력
// 각 문장의 앞에 줄 번호를 추가한 뒤 출력한다. 줄 번호는 1번부터 시작한다. 줄번호를 추가하는 형식은 출력 예제를 참고하면 된다.

// 입력
// 5
// Lionel Cosgrove
// Alice
// Columbus and Tallahassee
// Shaun and Ed
// Fido

// 출력
// 1. Lionel Cosgrove
// 2. Alice
// 3. Columbus and Tallahassee
// 4. Shaun and Ed
// 5. Fido

import java.util.Scanner;

public class LineNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= t; i++) {
            String name = sc.nextLine();

            System.out.println(i + ". " + name);
        }
    }
}
