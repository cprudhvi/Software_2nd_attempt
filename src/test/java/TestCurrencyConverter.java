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
        assertEquals(70, cc.dollar_to_rs(1));
    }

    @Test
    public void test_sek_to_rs(){
        assertEquals(18, cc.sek_to_rs(2));
    }

    @Test
    public void test_euro_to_rs(){
        assertEquals(300, cc.euro_to_rs(3));
    }
}
