import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(9,6);
    }

    @Test
    public void addTwoNumbers() {
        assertEquals(15, calculator.addTwoNumbers());
    }

    @Test
    public void subtractTwoNumbers() {
        assertEquals(3, calculator.subtractTwoNumbers());
    }

    @Test
    public void multiplyTwoNumbers() {
        assertEquals(54, calculator.multiplyTwoNumbers());
    }

    @Test
    public void divideTwoNumbers() {
        assertEquals(1.5, calculator.divideTwoNumbers(), 0.0);
    }

}
