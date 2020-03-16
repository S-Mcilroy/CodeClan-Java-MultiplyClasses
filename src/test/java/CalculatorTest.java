import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void add(){
        assertEquals(3, calculator.add(1,2));
    }

    @Test
    public void subtract(){
        assertEquals(1, calculator.subtract(2,1));
    }

    @Test
    public void multiply(){
    assertEquals(6, calculator.multiply(3,2));
    }

    @Test
    public void divide(){
        assertEquals(2.5, calculator.divide(5.0, 2.0), 0.01);
    }
}



