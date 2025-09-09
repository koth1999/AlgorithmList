package Problem.피타고라스;

// 과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다.
// 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        List<String> list = new ArrayList<>();

        while(true) {
            int sum = 0;
            for(int i=0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            Arrays.sort(arr);
            if(sum==0) break;
            if((arr[2]*arr[2]) == ((arr[0]*arr[0]) + (arr[1]*arr[1]))) {
                list.add("good");
            }else list.add("wrong");
        }

        for(String e : list) {
            System.out.println(e+" ");
        }
    }
}
