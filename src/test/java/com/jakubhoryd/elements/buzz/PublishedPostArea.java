package com.jakubhoryd.elements.buzz;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class PublishedPostArea {

    private final SelenideElement postBodyTextContent;
    private final SelenideElement successIndicator;

    public PublishedPostArea() {
        postBodyTextContent = $("p.orangehrm-buzz-post-body-text");
        successIndicator = $(".oxd-toast--success ");
    }

    public String getTextPostContentFromNewestPost() {
        successIndicator.should(appear);
        successIndicator.should(disappear);
        Selenide.refresh();
        return postBodyTextContent.getText();
    }
}
