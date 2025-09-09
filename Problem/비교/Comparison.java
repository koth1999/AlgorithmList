package Problem.비교;

// n개의 숫자가 입력되면, 다음과 같이 크기를 비교한 후 양식에 맞춰 출력하시오.
// 예를 들어, 1 2 3 2 1 이라는 숫자가 입력되면,
// 첫 번째 1과 나머지 2, 3, 2, 1을 비교하면 1 < 2,  1 < 3, 1 < 2, 1 = 1 이므로 < < < = 를 출력한다.
// 두 번째 2와 나머지 1, 3, 2, 1을 비교하면 2 > 1, 2 < 3, 2 = 2, 2 > 1 이므로 > < = > 를 출력한다.
// 세 번째 3과 나머지 1, 2, 2, 1을 비교하면 3 > 1, 3 > 2, 3 > 2, 3 > 1 이므로 > > > > 를 출력한다.
// 같은 방법으로 네 번째는 > = < >, 다섯번째는 = < < < 를 출력한다. 이와 같은 방식의 대소 비교 결과를 출력하시오.

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(i+1+" ");
            for(int j=0; j<arr.length; j++) {
                if(i==j) continue;
                else if(arr[i]==arr[j]) System.out.print("= ");
                else if(arr[i]>arr[j]) System.out.print("> ");
                else if(arr[i]<arr[j]) System.out.print("< ");
            }
            System.out.println();
        }
    }
}
