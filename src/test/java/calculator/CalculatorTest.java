package calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator cal = new Calculator();

    @Test
    public void testAdd() {
        Assert.assertEquals(cal.add(2, 3), 5);
    }

    @Test
    public void testSub() {
        Assert.assertEquals(cal.sub(5, 3), 2);
    }

    @Test
    public void testMul() {
        Assert.assertEquals(cal.mul(4, 2), 8);
    }

    @Test
    public void testDiv() {
        Assert.assertEquals(cal.div(10, 2), 5);
    }
}