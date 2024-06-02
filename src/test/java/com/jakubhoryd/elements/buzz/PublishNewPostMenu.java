package com.jakubhoryd.elements.buzz;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class PublishNewPostMenu {


    private final SelenideElement textContentTextArea;
    private final SelenideElement postButton;

    public PublishNewPostMenu() {
        textContentTextArea = $("div.oxd-buzz-post--active textarea");
        postButton = $("div.oxd-buzz-post-slot button");
    }

    public PublishNewPostMenu enterPostText(String text) {
        textContentTextArea.shouldBe(enabled).setValue(text);
        return this;
    }

    public void clickPostButton() {
        postButton.shouldBe(enabled).click();
    }
}
