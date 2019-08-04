import helpers.Settings;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class MainTest {

    @BeforeAll
    public static void init() {
        Settings.initDriver();
    }

    @Test
    public void test() {
        MainPage page = new MainPage();
//        page.clickDigit(1);
//        page.clickPlus();
//        page.clickDigit(5);
//        page.clickEqual();
//        assertEquals("6", page.getResult());
    }
}
