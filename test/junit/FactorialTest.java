package junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void fact() {
        assertEquals(1, Factorial.fact(1));
        assertEquals(2, Factorial.fact(2));
        assertEquals(6, Factorial.fact(3));
        assertEquals(3628800, Factorial.fact(10));
        assertEquals(2432902008176640000L, Factorial.fact(20));
    }

//    @Test
//    void testNegative() {
          //Junit5才有assertThrows
//        assertThrows(IllegalArgumentException.class, () -> {
//            Factorial.fact(-1);
//        });
//    }
}