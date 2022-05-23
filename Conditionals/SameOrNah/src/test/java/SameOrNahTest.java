import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SameOrNahTest {

    @Test
    @DisplayName("Correctly identifies when words are different")
    void compareDifferentWords() {
        ByteArrayOutputStream testOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOutput));

        SameOrNah.compare("tomato", "potato");
        assertTrue(testOutput.toString().contains("The words are different."));
    }

    @Test
    @DisplayName("Correctly identifies when words are the same")
    void compareSame(){
        ByteArrayOutputStream testOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOutput));

        SameOrNah.compare("tomato", "tomato");
        assertTrue(testOutput.toString().contains("The words are the same."));
    }

    @Test
    @DisplayName("Correctly identifies when words are the same regardless of case")
    void compareCase(){
        ByteArrayOutputStream testOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOutput));

        SameOrNah.compare("tomato", "Tomato");
        assertTrue(testOutput.toString().contains("The words are the same."));
    }
}