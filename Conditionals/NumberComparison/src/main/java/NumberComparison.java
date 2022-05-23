import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number:");
        double num1 = Double.parseDouble(s.nextLine());

        System.out.println("Enter a number:");
        double num2 = Double.parseDouble(s.nextLine());

        compare(num1, num2);
    }

    public static void compare(double num1, double num2){
        if (num1 == num2){
            System.out.println("Numbers are the same");
        } else if (num1 > num2) {
            System.out.println("The first number was larger than the second");
        } else {
            System.out.println("The second number was larger than the first.");
        }
    }
}