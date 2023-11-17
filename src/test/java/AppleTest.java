import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppleTest extends BaseTest {

    private final static String BASE_URL = "https://appleinsider.ru/?s=iphone&submit=";
    private final static String SEARCH_REQUEST = "iphone 13";

    @Test
    public void checkHrefArticle() {
        MainPage mainPage = new MainPage();
        FoundPage foundPage = new FoundPage();

        mainPage.openWebSite(BASE_URL);
        mainPage.clickOnSearch();
        mainPage.search(SEARCH_REQUEST);
        String string = foundPage.getHrefFromFirstArticle();
        boolean contains = foundPage.getHrefFromFirstArticle().toLowerCase().contains("iphone");
        System.out.println(contains);

        Assertions.assertTrue(contains);
    }

}
