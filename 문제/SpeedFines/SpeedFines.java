package 문제.SpeedFines;

// Many communities now have “radar” signs that tell drivers what their speed is, in the hope that they will slow down.
// You will output a message for a “radar” sign.
// The message will display information to a driver based on his/her speed according to the following table:

// km/h over the limit	Fine
// 1 to 20	$100
// 21 to 30	$270
// 31 or above	$500

// 입력
// The input will be two integers. The first line of input will be speed limit.
// The second line of input will be the recorded speed of the car.

// 출력
// If the driver is not speeding, the output should be:
// Congratulations, you are within the speed limit!
// If the driver is speeding, the output should be:
// You are speeding and your fine is $F.
// where F is the amount of the fine as described in the table above.

// 입력 : 100 131
// 출력 : You are speeding and your fine is $500.

// 입력 : 40 39
// 출력 : Congratulations, you are within the speed limit!

// 입력 : 100 120
// 출력 : You are speeding and your fine is $100.

import java.util.Scanner;

public class SpeedFines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int dif = b - a;

        if(dif <= 0) {
            System.out.print("Congratulations, you are within the speed limit!");
        }else if(dif >= 1 && dif <= 20) {
            System.out.print("You are speeding and your fine is $100.");
        }else if(dif >= 21 && dif <= 30) {
            System.out.print("You are speeding and your fine is $270.");
        }else {
            System.out.print("You are speeding and your fine is $500.");
        }
    }
}
