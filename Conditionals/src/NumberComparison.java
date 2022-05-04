import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = s.nextInt();

        System.out.println("Enter a number:");
        int num2 = s.nextInt();

        if (num1 == num2){
            System.out.println("Numbers are the same");
        } else if (num1 > num2) {
            System.out.println("The first number was larger than the second");
        } else {
            System.out.println("The second number was larger than the first.");
        }
    }
}
