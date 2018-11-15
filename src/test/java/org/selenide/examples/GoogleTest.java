package org.selenide.examples;

import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {

    @Test
    public void userCanSearchKeyWorldWithGoogle() {

        open("http://google.ru");
        $(By.name("q")).setValue("selenide").pressEnter();

        Assert.assertTrue($$("#search .g").size()>=9);
        $("#search .g").shouldHave(Condition.text("Selenide: лаконичные и стабильные UI тесты"));

    }
}
