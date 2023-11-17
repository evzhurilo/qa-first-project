import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.N;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Main page of Appleinsider.ru
 */
@AllArgsConstructor
@NoArgsConstructor
public class MainPage {
    //creating locator
    private final SelenideElement searchButton = $x("//form");
    private String url;

    public void clickOnSearch() {
        searchButton.click();
    }

    public void openWebSite(String url) {
        Selenide.open(url);
    }


}
