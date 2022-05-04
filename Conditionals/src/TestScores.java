import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Name a number between 0 and 100:");
        int grade = s.nextInt();

        if (grade >= 90) {
            System.out.println("Great job, your grade is an A!");
        } else if (grade >= 80) {
            System.out.println("Good job, you got a B!");
        } else if (grade >= 70) {
            System.out.println("Your grade is a C.");
        } else if (grade >= 60) {
            System.out.println("Your grade is a D.");
        } else {
            System.out.println("Your grade is an F.");
        }
    }
}
