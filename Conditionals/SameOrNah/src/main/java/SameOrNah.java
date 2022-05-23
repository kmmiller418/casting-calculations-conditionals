import java.util.Scanner;
public class SameOrNah {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word1 = s.nextLine();

        System.out.println("Enter another word:");
        String word2 = s.nextLine();

        compare(word1, word2);
    }

    public static void compare(String word1, String word2){
        if (word1.equalsIgnoreCase(word2)){
            System.out.println("The words are the same.");
        } else {
            System.out.println("The words are different.");
        }
    }
}