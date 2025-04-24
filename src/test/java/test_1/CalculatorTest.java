package test_1;
import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class CalculatorTest {

        private final Calculator calculator = new Calculator();

        @Test
        void testAdd() {
            assertEquals(5, calculator.add(2, 3));  // 2 + 3 = 5
        }

        @Test
        void testSubtract() {
            assertEquals(1, calculator.subtract(4, 3));  // 4 - 3 = 1
        }

        @Test
        void testIsEven() {
            assertTrue(calculator.isEven(4));  // 4 — чётное
            assertFalse(calculator.isEven(5)); // 5 — нечётное
        }
    }

