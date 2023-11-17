import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Main page of Appleinsider.ru
 */
public class MainPage {
    //creating of locator
    private final SelenideElement searchButton = $x("//form");

    public MainPage(String url){
        Selenide.open(url);
    }
    public void clickOnSearch() {
        searchButton.click();
    }

    public void openWebSite(String url){
        Selenide.open(url);
    }


}
