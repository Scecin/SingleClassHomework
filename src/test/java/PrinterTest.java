import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(15, 5, 2, 100);
    }

    @Test
    public void print() {
        assertEquals("You have printer 5 and 2, so the number of sheets of paper left are 5 and toner volume are equal to 90",printer.print());
    }
}
