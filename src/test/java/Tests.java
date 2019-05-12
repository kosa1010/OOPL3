import org.junit.Assert;
import org.junit.Test;
import pl.edu.ur.oopl3.Interfaces.FactorialInterface;
import pl.edu.ur.oopl3.Zad3_1.RecursionFactorial;
import pl.edu.ur.oopl3.Zad3_2.NoRecursionFactorial;
import pl.edu.ur.oopl3.Zad3_3.Power;
import pl.edu.ur.oopl3.Zad3_4.Fibonacci;

/**
 */
public class Tests {

    @Test
    public void testEx3_1(){
        FactorialInterface recursionFactorial = new RecursionFactorial();

        Assert.assertEquals(24, recursionFactorial.factorial(4));
    }

    @Test
    public void testEx3_2(){
        FactorialInterface noRecursionFactorial = new NoRecursionFactorial();

        Assert.assertEquals(24, noRecursionFactorial.factorial(4));
    }

    @Test
    public void testEx3_3Recursion(){
        Power power = new Power();
        Assert.assertEquals(8, power.recursionPow(2, 3), 0);
    }

    @Test
    public void testEx3_3NoRecursion(){
        Power noRecursionPower = new Power();
        Assert.assertEquals(8, noRecursionPower.noRecursionPow(2, 3), 0);

    }

    @Test
    public void testEx3_4(){
        Fibonacci fibonacci = new Fibonacci();
        Assert.assertEquals(3, fibonacci.sumOfFicbonacci(4));
    }
}
