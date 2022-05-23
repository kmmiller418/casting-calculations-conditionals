import java.util.Scanner;

public class Calculations {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = s.nextInt();

        System.out.println("Enter another number:");
        int num2 = s.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + add(num1,num2));
        System.out.println(num1 + " - " + num2 + " = " + subtract(num1,num2));
        System.out.println(num1 + " * " + num2 + " = " + multiply(num1,num2));
        System.out.println(num1 + " / " + num2 + " = " + divide(num1,num2));
        System.out.println(num1 + " % " + num2 + " = " + mod(num1,num2));
    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static double divide(int num1, int num2){
        return (num1*1.0)/num2;
    }

    public static int mod(int num1, int num2){
        return num1%num2;
    }
}
