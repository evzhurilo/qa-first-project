import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.N;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Main page of Appleinsider.ru
 */
@AllArgsConstructor
@NoArgsConstructor
public class MainPage {
    //creating locator
    private final SelenideElement searchButton = $x("//form");
    private final SelenideElement textBoxInput = $x("//input[@type='text']");
    private String url;

    public void clickOnSearch() {
        searchButton.click();
    }

    /**
     * Making search between articles and pushing ENTER button
     * @param searchText
     * */
    public void search(String searchText) {
        textBoxInput.setValue(searchText);
        textBoxInput.sendKeys(Keys.ENTER);
    }

    public void openWebSite(String url) {
        Selenide.open(url);
    }


}
