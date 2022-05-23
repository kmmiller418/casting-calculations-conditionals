import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class NumberComparisonTest {

    @Test
    @DisplayName("Correctly compares two numbers")
    void compare() {
        ByteArrayOutputStream testOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOutput));

        NumberComparison.compare(5,2);
        assertTrue(testOutput.toString().contains("The first number was larger than the second"));
    }

    @Test
    @DisplayName("Compares two non-integer values")
    void compareDouble(){
        ByteArrayOutputStream testOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOutput));

        NumberComparison.compare(2.3,2.6);
        assertTrue(testOutput.toString().contains("The second number was larger than the first."));
    }

    @Test
    @DisplayName("Correctly compares two equal numbers")
    void compareSameNumbers(){
        ByteArrayOutputStream testOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOutput));

        NumberComparison.compare(5,5);
        assertTrue(testOutput.toString().contains("Numbers are the same"));
    }
}