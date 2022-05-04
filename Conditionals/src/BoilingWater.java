import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number greater than 212:");
        if (s.nextInt() > 212){
            System.out.println("Water is boiling!");
        };
    }
}
