package com.jakubhoryd.tests;

import com.codeborne.selenide.Selenide;
import com.jakubhoryd.core.listeners.TestListener;
import com.jakubhoryd.core.utils.PropertyHelper;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.io.IOException;

@Listeners(TestListener.class)
public class BaseTest {

    @BeforeMethod
    public void setup() {
        Selenide.open(PropertyHelper.getProdEnvironment());
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result) throws IOException {
        Selenide.closeWebDriver();
    }
}