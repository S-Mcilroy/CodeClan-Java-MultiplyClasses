import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 60);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(60, printer.getToner());
    }

    @Test
    public void print(){
        printer.print(5, 10);
        assertEquals(50, printer.getPaper());
        assertEquals(55, printer.getToner());
    }

    @Test
    public void printNotEnoughPaper(){
        printer.print(10, 20);
        assertEquals(100, printer.getPaper());
    }

}




