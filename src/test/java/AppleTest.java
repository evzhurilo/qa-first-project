import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppleTest extends BaseTest {

    private final static String BASE_URL = "https://appleinsider.ru";
    private final static String SEARCH_REQUEST = "iphone";

    @Test
    public void checkHrefArticle() {
        MainPage mainPage = new MainPage();

        mainPage.openWebSite(BASE_URL);
        mainPage.clickOnSearch();
        String href = mainPage.search(SEARCH_REQUEST).getHrefFromFirstArticle().toLowerCase();

        Assertions.assertTrue(href.contains("3"));
    }

}
