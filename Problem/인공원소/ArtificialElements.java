package Problem.인공원소;

// 원자 번호 43번을 가진 테크네튬은 세계 최초의 인공 방사성 원소이자, 가장 가벼운 방사성 원소이다.
// 테크네튬의 최초 발견은 특이하게도 자연이 아닌 인공 합성을 통해 이루어졌는데,
// 원자 번호 42번을 가진 몰리브데넘에 입자를 충돌시키는 방식으로 생성되었다고 한다.
// 테크네튬의 어떠한 특성이 이러한 인공 합성 과정을 가능하게 했을지 궁금해진 준익이는,
// 깊은 고심 끝에 소수 두 개의 합으로 나타낼 수 있는 원자 번호에 그 이유가 있을 것이라는 엉뚱한 가설을 내세웠다!
// 자신의 엄청난 발견에 스스로 감탄한 준익이는, 각 원소가 인공 합성이 가능할지에 대한 여부를 마구 따져보고자 한다.
// 준익이를 위해 주어진 원자 번호를 가진 원소가 인공 합성이 가능한 원소인지 알아보자!

// 입력
// 첫째 줄에 물어볼 원자 번호의 개수 N이 주어진다. (1 <= N <= 118)
// 이후 $N$개의 줄에 걸쳐 원자 번호 a가 주어진다. (1 <= a <= 118)
// 이때 같은 원자 번호는 두 번 이상 주어지지 않는다.

// 출력
// 각 원자 번호를 가진 원소가 인공 합성이 가능한 원소라면 Yes, 아니라면 No를 주어진 순서대로 한 줄에 하나씩 출력한다.

// 입력
// 3
// 2
// 5
// 19

// 출력
// No
// Yes
// Yes


import java.util.Scanner;

public class ArtificialElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (sumOfTwoPrimes(a)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean sumOfTwoPrimes(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                return true;
            }
        }
        return false;
    }
}
