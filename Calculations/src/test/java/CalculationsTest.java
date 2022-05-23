import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {


    @Test
    @DisplayName("Adds two whole numbers and returns an integer")
    void add() {
        assertEquals(7, Calculations.add(1,6));
    }

    @Test
    @DisplayName("Subtracts num2 from num1 and returns an int")
    void subtract() {
        assertEquals(7, Calculations.subtract(12,5));
    }

    @Test
    @DisplayName("Multiplies two ints and returns an int")
    void multiply() {
        assertEquals(35, Calculations.multiply(5, 7));
    }

    @Test
    @DisplayName("Divides an int from another and returns a double")
    void divide() {
        double num = 2.5;
        assertEquals(num, Calculations.divide(5,2));
        assertNotEquals(2, Calculations.divide(5,2));
    }

    @Test
    @DisplayName("Returns the int remainder of two integers")
    void mod() {
        assertEquals(7, Calculations.mod(137, 10));
    }
}