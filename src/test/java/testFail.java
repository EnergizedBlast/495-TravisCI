import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class testFail {

    @Test
    void factorial(){
        Factorial testClass = new Factorial();
        int testValue = testClass.factorial(3);
        assertEquals(testValue, 5);
        broke this test real good
    }

}
