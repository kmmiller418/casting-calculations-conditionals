import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = s.nextInt();

        System.out.println("Enter another number:");
        int num2 = s.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + ((1.0*num1)/num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
    }

}
