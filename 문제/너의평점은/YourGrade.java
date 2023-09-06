package 문제.너의평점은;

// 인하대학교 컴퓨터공학과를 졸업하기 위해서는, 전공평점이 3.3 이상이거나 졸업고사를 통과해야 한다.
// 그런데 아뿔싸, 치훈이는 깜빡하고 졸업고사를 응시하지 않았다는 사실을 깨달았다!
// 치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.
// 전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.
// 인하대학교 컴퓨터공학과의 등급에 따른 과목평점은 다음 표와 같다.

//  A+	4.5
//  A0	4.0
//  B+	3.5
//  B0	3.0
//  C+	2.5
//  C0	2.0
//  D+	1.5
//  D0	1.0
//  F	0.0

// P/F 과목의 경우 등급이 P또는 F로 표시되는데, 등급이 P인 과목은 계산에서 제외해야 한다.
// 과연 치훈이는 무사히 졸업할 수 있을까?

// 제한
// 1 ≤ 과목명의 길이 ≤ 50
// 과목명은 알파벳 대소문자 또는 숫자로만 이루어져 있으며, 띄어쓰기 없이 주어진다. 입력으로 주어지는 모든 과목명은 서로 다르다.
// 학점은 1.0,2.0,3.0,4.0중 하나이다.
// 등급은 A+,A0,B+,B0,C+,C0,D+,D0,F,P중 하나이다.
// 적어도 한 과목은 등급이 P가 아님이 보장된다.

// 입력
// ObjectOrientedProgramming1 3.0 A+
// IntroductiontoComputerEngineering 3.0 A+
// ObjectOrientedProgramming2 3.0 A0
// CreativeComputerEngineeringDesign 3.0 A+
// AssemblyLanguage 3.0 A+
// InternetProgramming 3.0 B0
// ApplicationProgramminginJava 3.0 A0
// SystemProgramming 3.0 B0
// OperatingSystem 3.0 B0
// WirelessCommunicationsandNetworking 3.0 C+
// LogicCircuits 3.0 B0
// DataStructure 4.0 A+
// MicroprocessorApplication 3.0 B+
// EmbeddedSoftware 3.0 C0
// ComputerSecurity 3.0 D+
// Database 3.0 C+
// Algorithm 3.0 B0
// CapstoneDesigninCSE 3.0 B+
// CompilerDesign 3.0 D0
// ProblemSolving 4.0 P

// 출력 : 3.284483

import java.util.Scanner;

public class YourGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalPoints = 0; // 전공과목 학점 * 등급
        double totalScores = 0; // 전공과목 학점 합산

        for(int i=0; i<20; i++) {
            String subject = sc.next(); // 전공과목
            double scores = sc.nextDouble(); // 학점
            String grade = sc.next(); // 등급

            double gradeValue = getGradeValue(grade);

            if(!grade.equals("P")) {
                totalPoints += scores * gradeValue;
                totalScores += scores;
            }
        }

        if(totalScores > 0) {
            double avg = totalPoints / totalScores;
            System.out.printf("%.6f", avg);
        }else{
            System.out.print("0.000000");
        }
    }

    public static double getGradeValue(String grade) {
        switch (grade) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            case "F":
                return 0.0;
            default:
                return 0.0; // 알 수 없는 등급의 경우 0.0으로 처리
        }
    }
}
