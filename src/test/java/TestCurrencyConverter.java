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

//the above test case code is modified such that it doesnot give expectd results..! now lets build the code..
// now we are modifying the test case code and rebulilding the project and see if this works to run the project!!
// it is clear that the test case 1 is up and running now lets make chages to the test case 2 and see if it works...!!!
// now the test case 2 is also up and running its time to make chages in test case 3 also and rebuild the
// whole project to finally complete the test driven development in my CI project ...!!!
