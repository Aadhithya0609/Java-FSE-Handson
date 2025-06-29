import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionThrowerTest {

    @Test
    void testThrowException() {
        ExceptionThrower obj = new ExceptionThrower();
        assertThrows(IllegalArgumentException.class, obj::throwException);
    }
}
