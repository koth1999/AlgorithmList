package 문제.ScalingRecipes;

// You've got a recipe which specifies a number of ingredients, the amount of each ingredient you will need, and the number of portions it produces.
// But, the number of portions you need is not the same as the number of portions specified in the recipe! How can you scale it?
//
// 입력
// The first line of input contains three integers
// n (1 <= n <= 40), x and y (1 <= x,y <= 40,000), where
// n is the number of ingredients in the recipe,
// x is the number of portions that the recipe produces, and
// y is the number of portions you need.
// Each of the next n lines contains a single integer
// a (1 <= a <= 40,000). These are the amounts of each ingredient needed for the recipe.
// The inputs will be chosen so that the amount of each ingredient needed for y portions will be an integer.

// 출력
// Output n lines. On each line output a single integer, which is the amount of that ingredient needed to produce
// y portions of the recipe. Output these values in the order of the input.

import java.util.Scanner;

public class ScalingRecipes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 재료 개수
        int x = sc.nextInt(); // 생산 부분 개수
        int y = sc.nextInt(); // 필요한 부분 개수

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt(); // 재료의 양

            // 총 재료 양
            // x - 1은 나누기 연산을 할 때 소수점 아래를 올리기 위해 사용
            int amount = (a * y + x - 1) / x;
            System.out.println(amount);
        }
    }
}
