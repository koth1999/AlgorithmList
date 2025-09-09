package Problem.Presents;

import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String[] arr = new String[t];

        for (int i = 0; i < t; i++) {
            arr[i] = sc.next();  // 그대로 문자열로 받음
        }

        // 버블 정렬 (오름차순, 문자열을 double로 변환하여 비교)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (Double.parseDouble(arr[j]) > Double.parseDouble(arr[j + 1])) {
                    String tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        // 두 번째로 작은 값 그대로 출력
        if (arr.length >= 2) {
            System.out.println(arr[1]);
        }
    }
}
