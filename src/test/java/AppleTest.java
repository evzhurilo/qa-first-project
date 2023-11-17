import org.junit.jupiter.api.Test;

public class AppleTest extends BaseTest {

    private final static String BASE_URL = "https://appleinsider.ru/?s=iphone&submit=";
    private final static String SEARCH_REQUEST = "iphone 13";

    @Test
    public void checkHrefArticle() {
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        mainPage.clickOnSearch();
    }

}
