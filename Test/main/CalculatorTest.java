package main;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testCalculatorExist() {
        Calculator c = new Calculator();
        Assert.assertNotNull(c);
    }

}