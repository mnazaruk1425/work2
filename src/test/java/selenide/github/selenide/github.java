package selenide.github.selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class github {

    @Test
    void shouldFindSelenideGitHub(){
        Configuration.timeout=2000;

        Selenide.open("https://github.com/");
        Selenide.sleep(3000);

        Selenide.$("[name=q]").setValue("selenide").pressEnter();
        Selenide.$$("ul.repo-list li").first().$("a").click();
        Selenide.$("h1").shouldHave(Condition.text("selenide / selenide"));


    }


}
