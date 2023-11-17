import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class FoundPage {
    private final ElementsCollection articleTitles = $$x("//h2//a");

    /**
     * method returns attribute href of the first element of articles collection
    **/
    public String getHrefFromFirstArticle() {
        return articleTitles.first().getAttribute("href");
    }

}
