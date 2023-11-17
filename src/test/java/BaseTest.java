import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public abstract class BaseTest {

    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
//      This configuration we need in a case when we want to specify our browser.
//      This class is a part of a Selenide library
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
//      Here we could define that we want to see how all actions happening in browser due our test
        Configuration.headless = true;

    }

    @BeforeEach
    public void init() {
        setUp();
    }

    @AfterEach
    public void destroy() {
        Selenide.closeWebDriver();
    }

}
