package com.jakubhoryd.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Navbar {


    private SelenideElement navbar;
    private SelenideElement title;

    public Navbar() {
        navbar = $("header.oxd-topbar");
        title = $(".oxd-topbar-header-breadcrumb-module");
    }

    public String getPageTitle() {
        return title.getText();
    }
}
