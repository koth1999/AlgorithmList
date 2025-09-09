package Problem.NotCute;

// 준희는 자기가 팀에서 귀여움을 담당하고 있다고 생각한다. 하지만 연수가 볼 때 그 의견은 뭔가 좀 잘못된 것 같았다.
// 그렇기에 설문조사를 하여 준희가 귀여운지 아닌지 알아보기로 했다.

// 첫 번째 줄에 설문조사를 한 사람의 수 N이 주어진다.
// 다음 N개의 줄에는 각 줄마다 각 사람이 설문 조사에 어떤 의견을 표명했는지를 나타내는 정수가 주어진다.
// 0은 준희가 귀엽지 않다고 했다는 뜻이고, 1은 준희가 귀엽다고 했다는 뜻이다.
// 준희가 귀엽지 않다는 의견이 더 많았을 경우 "Junhee is not cute!"를 출력하고
// 귀엽다는 의견이 많을 경우 "Junhee is cute!"를 출력한다.

// 입력 : 3
//       1
//       0
//       0
// 출력 : Junhee is not cute!

import java.util.Scanner;

public class NotCute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int notCnt = 0;
        int cnt = 0;

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0){
                notCnt++;
            }else {
                cnt++;
            }
        }

        if(notCnt > cnt) System.out.println("Junhee is not cute!");
        else System.out.println("Junhee is cute!");

    }
}
