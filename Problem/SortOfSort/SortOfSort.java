package Problem.SortOfSort;

import java.util.*;

public class SortOfSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int max = Integer.MIN_VALUE;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] >= max) {   // 크거나 같으면 포함
                result.add(arr[i]);
                max = arr[i];
            }
        }

        // 한 줄로 출력
        for (int i = 0; i < result.size(); i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(result.get(i));
        }
        System.out.println();
    }
}
