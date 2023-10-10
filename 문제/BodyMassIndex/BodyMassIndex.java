package 문제.BodyMassIndex;

// The Body Mass Index (BMI) is one of the calculations used by doctors to assess an adult’s health.
// The doctor measures the patient’s height (in metres) and weight (in kilograms), then calculates the BMI using the formula
// BMI = weight / (height × height).
// Write a program which prompts for the patient’s height and weight,
// calculates the BMI, and displays the corresponding message from the table below.

// BMI Category	Message
// More than 25	Overweight
// Between 18.5 and 25.0 (inclusive) Normal weight
// Less than 18.5 Underweight

// 입력 : 69 1.73
// 출력 : Normal Weight

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble();
        double height = sc.nextDouble();

        double BMI = weight / (height * height);

        if(BMI >= 25) {
            System.out.println("Overweight");
        }else if(BMI >= 18.5 && BMI <= 25) {
            System.out.println("Normal weight");
        }else {
            System.out.println("Underweight");
        }
    }
}
