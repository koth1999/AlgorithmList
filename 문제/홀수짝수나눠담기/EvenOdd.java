package 문제.홀수짝수나눠담기;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EvenOddArray evenOddArray = new EvenOddArray();
        evenOddArray.inputValue();
        evenOddArray.separateValue();
        evenOddArray.displayValue();
    }
}

class EvenOddArray {
    int[] inputArray = new int[7];
    int[] evenArray = new int[7];
    int[] oddArray = new int[7];
    int evenIdx = 0;
    int oddIdx = 0;

    void inputValue() { // 정수 입력
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<inputArray.length; i++) {
            inputArray[i] = sc.nextInt();
        }
    }

    void separateValue() { // 홀수, 짝수 나누기
        for(int e : inputArray) {
            if(e % 2 == 0) evenArray[evenIdx++] = e;
            else oddArray[oddIdx++] = e;
        }
    }

    void displayValue() { // 결과 출력
        System.out.print("홀수 : ");
        for(int i=0; i<oddIdx; i++) {
            System.out.print(oddArray[i]+" ");
        }
        System.out.println();

        System.out.print("짝수 : ");
        for(int i=0; i<evenIdx; i++) {
            System.out.print(evenArray[i]+" ");
        }
    }
}
