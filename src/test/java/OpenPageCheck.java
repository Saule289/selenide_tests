import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OpenPageCheck {

    @Test
    void checkOpenPage() {

        open("https://github.com/");
        $("nav").$(byText("Solutions")).hover().click();
        $(byText("Enterprise")).click();
        $("h1").shouldHave((text("Build like the best")));
    }
}
