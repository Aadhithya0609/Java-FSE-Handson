

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyMathTest {

    private MyMath math;

    @Before
    public void setUp() {
        // Setup (AAA - Arrange)
        math = new MyMath();
        System.out.println("Setup executed");
    }

    @After
    public void tearDown() {
        // Teardown
        math = null;
        System.out.println("Teardown executed");
    }

    @Test
    public void testAdd() {
        // Act
        int result = math.add(10, 5);
        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testMultiply() {
        assertEquals(50, math.multiply(10, 5));
    }

    @Test
    public void testGreet() {
        assertEquals("Hello, John", math.greet("John"));
    }
}
