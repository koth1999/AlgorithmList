package Problem.Cakes;

// This summer, you plan to organize a large party and invite many friends.
// They have a sweet tooth, so you plan to bake nice cakes for them. You know the recipe for a nice chocolate cake,
// and you want to cook as many of them as possible.
// Given the N ingredients needed to make a single cake and the ingredients that you have in your kitchen,
// how many cakes can you make?

// 입력
// The first line of the input contains a single integer N.
// Then, N lines follow, one for each ingredient.
// Each of these lines contains two positive integers: the first one is the required quantity of this ingredient per cake,
// the second one is the quantity of this ingredient you have in your kitchen.

// 출력
// The output should contain a single integer: the maximum number of cakes you can make using the available ingredients.

// 제한
// 1 <= N <= 10
// All ingredient quantities will be integers between 1 and 10,000.

import java.util.Scanner;

public class Cakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int maxCakes = Integer.MAX_VALUE; // 최대값으로 초기화

        for(int i = 0; i < t; i++) {
            int cakeAmount = sc.nextInt();
            int kitchen = sc.nextInt();

            int cnt = kitchen / cakeAmount;

            if(cnt < maxCakes) {
                maxCakes = cnt;
            }
        }

        System.out.println(maxCakes);
    }
}
