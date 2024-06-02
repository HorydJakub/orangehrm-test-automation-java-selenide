package com.jakubhoryd.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LoginPage {

    private final SelenideElement usernameInput;
    private final SelenideElement passwordInput;
    private final SelenideElement loginBtn;
    private final SelenideElement invalidCredentialsWarning;
    private final ElementsCollection requiredFieldErrorMessages;
    private final SelenideElement orangeHrmLogo;
    private final SelenideElement forgotPasswordOption;
    private final ElementsCollection socialMediaBtns;
    private final SelenideElement orangeHrmVersionInfo;
    private final SelenideElement orangeHrmCopyrightInfo;
    private final SelenideElement linkedinBtn;
    private final SelenideElement facebookBtn;
    private final SelenideElement twitterBtn;
    private final SelenideElement youtubeBtn;

    public LoginPage() {
        usernameInput = $("input[name='username']");
        passwordInput = $("input[name='password']");
        loginBtn = $("button.orangehrm-login-button");
        invalidCredentialsWarning = $("div.orangehrm-login-error p.oxd-alert-content-text");
        requiredFieldErrorMessages = $$("span.oxd-input-field-error-message");
        orangeHrmLogo = $("div.orangehrm-login-branding img");
        forgotPasswordOption = $("p.orangehrm-login-forgot-header");
        socialMediaBtns = $$("p.orangehrm-login-forgot-header");
        orangeHrmVersionInfo = $("div.orangehrm-copyright-wrapper p:nth-child(1)");
        orangeHrmCopyrightInfo = $("div.orangehrm-copyright-wrapper p:nth-child(2)");
        linkedinBtn = $("a[href*='www.linkedin.com']");
        facebookBtn = $("a[href*='www.facebook.com']");
        twitterBtn = $("a[href*='www.twitter.com']");
        youtubeBtn = $("a[href*='www.youtube.com']");
    }

    public void login(String username, String password) {
        usernameInput.shouldBe(enabled).setValue(username);
        passwordInput.shouldBe(enabled).setValue(password);
        loginBtn.shouldBe(enabled).click();
    }

    public SelenideElement getUsernameInput() {
        return usernameInput;
    }

    public SelenideElement getPasswordInput() {
        return passwordInput;
    }

    public SelenideElement getLoginBtn() {
        return loginBtn;
    }

    public SelenideElement getInvalidCredentialsWarning() {
        return invalidCredentialsWarning;
    }

    public ElementsCollection getRequiredFieldErrorMessages() {
        return requiredFieldErrorMessages;
    }

    public SelenideElement getOrangeHrmLogo() {
        return orangeHrmLogo;
    }

    public SelenideElement getForgotPasswordOption() {
        return forgotPasswordOption;
    }

    public ElementsCollection getSocialMediaBtns() {
        return socialMediaBtns;
    }

    public SelenideElement getOrangeHrmVersionInfo() {
        return orangeHrmVersionInfo;
    }

    public SelenideElement getOrangeHrmCopyrightInfo() {
        return orangeHrmCopyrightInfo;
    }

    public SelenideElement getLinkedinBtn() {
        return linkedinBtn;
    }

    public SelenideElement getFacebookBtn() {
        return facebookBtn;
    }

    public SelenideElement getTwitterBtn() {
        return twitterBtn;
    }

    public SelenideElement getYoutubeBtn() {
        return youtubeBtn;
    }
}
