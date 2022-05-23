import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TestScoresTest {
    @Test
    @DisplayName("Prints A if inputted grade above 90")
    void testA() {
        String userInput = "95";
        ByteArrayInputStream temp = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(temp);

        ByteArrayOutputStream testOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOutput));

        TestScores.main(null);
        assertTrue(testOutput.toString().contains("A!"));
    }

    @Test
    @DisplayName("Prints B if inputted grade between 80-90")
    void testB(){
        String userInput = "84";
        ByteArrayInputStream temp = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(temp);

        ByteArrayOutputStream testOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOutput));

        TestScores.main(null);
        assertTrue(testOutput.toString().contains("B!"));
    }
    @Test
    @DisplayName("Prints B if inputted grade between 70-80")
    void testC(){
        String userInput = "72";
        ByteArrayInputStream temp = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(temp);

        ByteArrayOutputStream testOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOutput));

        TestScores.main(null);
        assertTrue(testOutput.toString().contains("C"));
    }
    @Test
    @DisplayName("Prints D if inputted grade between 60-70")
    void testD(){
        String userInput = "63";
        ByteArrayInputStream temp = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(temp);

        ByteArrayOutputStream testOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOutput));

        TestScores.main(null);
        assertTrue(testOutput.toString().contains("D"));
    }
    @Test
    @DisplayName("Prints F if inputted grade below 60")
    void testF(){
        String userInput = "57";
        ByteArrayInputStream temp = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(temp);

        ByteArrayOutputStream testOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOutput));

        TestScores.main(null);
        assertTrue(testOutput.toString().contains("F"));
    }
}
