import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTest {

    static Calculator calculator;
    // todo implement about 5 test for each method in Calculator class -> you must have at least 20 tests in this class
    // todo use assertEquals, assertTrue, assertFalse, assertNotEquals, assertThrows, assertNotNull, assertNull

    @Test
    public void sumTest() {
        assertEquals(12, calculator.plus(5, 7));
    }

    @Test
    public void sumTest_Rainy() {
        assertNotSame(11, calculator.plus(5, 7));
    }

    @Test
    public void sumTestThrowsException() {
        NullPointerException e = assertThrows(NullPointerException.class, () -> {
            calculator.plus(5, null);
        }, "Expected to get a HttpException when calling with an invalid token");
    }

    @Test
    public void minusTest() {
        assertEquals(12, Calculator.minus());
    }
}