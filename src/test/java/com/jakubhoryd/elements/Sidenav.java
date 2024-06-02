package com.jakubhoryd.elements;

import com.codeborne.selenide.SelenideElement;
import com.jakubhoryd.enums.NavmenuOption;

import static com.codeborne.selenide.Selenide.$x;

public class Sidenav {

    public Sidenav goToMenu(NavmenuOption menuOption) {
        String menuXPath = String.format("//li[@class='oxd-main-menu-item-wrapper']//span[text()='%s']", menuOption.getOption());
        SelenideElement menuElement = $x(menuXPath);
        menuElement.click();
        return this;
    }
}
