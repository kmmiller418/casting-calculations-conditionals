import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BoilingWaterTest {

    @Test
    @DisplayName("Prints boiling message if user inputs number greater than 212")
    void boiling() {
        String userInput = "234";
        ByteArrayInputStream temp = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(temp);

        ByteArrayOutputStream testOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOutput));

        BoilingWater.main(null);
        assertTrue(testOutput.toString().contains("Water is boiling!"));
    }

    @Test
    @DisplayName("Prints not boiling message if user inputs anything other than number > 212")
    void notBoiling(){
        String userInput = "24";
        ByteArrayInputStream temp = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(temp);

        ByteArrayOutputStream testOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOutput));

        BoilingWater.main(null);
        assertTrue(testOutput.toString().contains("Water is not boiling."));
    }
}