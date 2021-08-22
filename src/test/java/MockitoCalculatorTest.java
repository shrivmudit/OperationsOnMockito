import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockitoCalculatorTest
{
    MockitoMethods calc=null;
    MockitoArithmeticOperations arithmetic = mock(MockitoArithmeticOperations.class);
    @BeforeEach
    void assignObject()
    {
        calc = new MockitoMethods(arithmetic);
    }
    @Test
    void toReturnTheSumOfTwoPositiveNumbers()
    {
        when(arithmetic.sum(4.0,5.0)).thenReturn(9.0);
        assertEquals(9.0,calc.sum(4.0,5.0));
    }

    @Test
    void toReturnTheDifferenceOfTwoPositiveTwoNumbers()
    {
        when(arithmetic.difference(7.0,3.0)).thenReturn(4.0);
        assertEquals(4.0,calc.difference(7.0,3.0));
    }

    @Test
    void toReturnTheProductTwoNumbers() {
        when(arithmetic.product(7.0, 3.0)).thenReturn(21.0);
        assertEquals(21.0, calc.product(7.0, 3.0));
    }

    @Test
    void toReturnQuotientOfTwoPositiveNumber()
    {
        when(arithmetic.division(21.0, 3.0)).thenReturn(7.0);
        assertEquals(7.0, calc.division(21.0, 3.0));

    }
}