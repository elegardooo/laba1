package test.demo.parallel;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexTest {

    @Test
    public void subtractTest() {
        Complex a = new Complex(7.0, 2.0);
        Complex b = new Complex(3.0, 1.0);
        Complex difference = a.minus(b);

        assertEquals(4.0, difference.getRe(), 1e-10, "Real part must be 4.0" );
        assertEquals(1.0, difference.getIm(), 1e-10, "Imaginary part must be 1.0");
    }
}
