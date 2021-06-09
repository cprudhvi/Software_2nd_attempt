import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCurrencyConverter {
    private static CurrencyConverter cc;

    @BeforeClass
    public static void setup(){
        cc = new CurrencyConverter();
    }

    @Test
    public void test_dlr_to_rs(){
        assertEquals(350, cc.dollar_to_rs(5));
    }

    @Test
    public void test_sek_to_rs(){
        assertEquals(90, cc.sek_to_rs(10));
    }

    @Test
    public void test_euro_to_rs(){
        assertEquals(300, cc.euro_to_rs(3));
    }
}
// this is the screen recording to show that the environment works with the code and a few test cases that i have written to test in this project.
