package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

   @BeforeAll
    static void beforeAll () {
       Configuration.browserSize = "1920x1200";
       Configuration.pageLoadStrategy = "eager";
       Configuration.baseUrl = "https://demoqa.com";
       Configuration.holdBrowserOpen = true;
       Configuration.timeout = 5000; //default 4000

    }
    @Test
    void fillFormTest() {

        open("/automation-practice-form");
        $("#firstName").setValue("Denis");
        $("#lastName").setValue("Qa");
        $("#userEmail").setValue("tester@auto.com");
        $("#genderWrappwer").$(byText("Male")).click();
        $("#userNumber").setValue("8910123456");
        $("#dateOfBirthInput").setValue("15 Dec 2002");
        $("#subjectsInput").setValue("Math");
        $("#hobbies-checkbox-1").click();
        $("#submit").click();

        $("#output #name").shouldHave(text("Denis"));
        $("#output #email").shouldHave(text("tester@auto.com"));
        $("#output #currentAddress").shouldHave(text("Sunny street 3"));
        $("#output #permanentAddress").shouldHave(text("Shady street 4"));

    }

}


