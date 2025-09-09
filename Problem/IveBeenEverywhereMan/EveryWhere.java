package Problem.IveBeenEverywhereMan;

// Alice travels a lot for her work. Each time she travels, she visits a single city before returning home.
// Someone recently asked her “how many different cities have you visited for work?”
// Thankfully Alice has kept a log of her trips.
// Help Alice figure out the number of cities she has visited at least once.

// 입력
// The first line of input contains a single positive integer T ≤ 50 indicating the number of test cases.
// The first line of each test case also contains a single positive integer n indicating the number of work trips Alice has taken so far.
// The following n lines describe these trips. The ith such line simply contains the name of the city Alice visited on her ith trip.
// Alice’s work only sends her to cities with simple names: city names only contain lowercase letters,
// have at least one letter, and do not contain spaces.
// The number of trips is at most 100 and no city name contains more than 20 characters.

// 출력
// For each test case, simply output a single line containing a single integer
// that is the number of distinct cities that Alice has visited on her work trips.

// 입력
// 2
// 7
// saskatoon
// toronto
// winnipeg
// toronto
// vancouver
// saskatoon
// toronto
// 3
// edmonton
// edmonton
// edmonton

// 출력 : 4 1

import java.util.HashSet;
import java.util.Scanner;

public class EveryWhere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            HashSet<String> cities = new HashSet<>();

            for(int j = 0; j < n; j++) {
                String city = sc.next();
                cities.add(city);
            }
            System.out.print(cities.size());
        }
    }
}
