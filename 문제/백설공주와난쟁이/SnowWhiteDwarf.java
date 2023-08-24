package 문제.백설공주와난쟁이;

// 안개 숲에는 백설 공주와 7명의 난쟁이가 함께 살고 있다. 7명의 난쟁이의 키가 입력으로 주어질 때 이 중 키가 가장 큰
// 난쟁이와 두번째로 큰 난쟁이의 키를 출력하는 프로그램을 작성하시오.

// 입력 : 79 57 88 72 95 88 64
// 출력 : 95 88


import java.util.Scanner;

public class SnowWhiteDwarf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=arr.length-1; i>=0; i--) {
            for(int j=0; j<i; j++) {
                if(arr[j]<arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        for(int j=0; j<2; j++) {
            System.out.print(arr[j]+" ");
        }
    }
}
