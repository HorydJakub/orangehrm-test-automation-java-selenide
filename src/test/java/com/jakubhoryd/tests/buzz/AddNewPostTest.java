package com.jakubhoryd.tests.buzz;

import com.jakubhoryd.core.testrail.TestRail;
import com.jakubhoryd.core.utils.StringHelper;
import com.jakubhoryd.enums.NavmenuOption;
import com.jakubhoryd.pages.BuzzPage;
import com.jakubhoryd.pages.DashboardPage;
import com.jakubhoryd.pages.LoginPage;
import com.jakubhoryd.tests.BaseTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AddNewPostTest extends BaseTest {


    private LoginPage loginPage = new LoginPage();
    private BuzzPage buzzPage = new BuzzPage();
    private DashboardPage dashboardPage = new DashboardPage();


    @Test(description = "BuzzPage: Share new post without attachments")
    @TestRail(id = "5")
    @Severity(SeverityLevel.NORMAL)
    public void publishNewPostWithoutAttachmentsTest() {

        String textForPost = StringHelper.getUniqueStringFromCurrentDate();

        // Login into portal as admin
        loginPage.login("Admin", "admin123");

        // Redirected to 'Dashboard' page, go to 'Buzz' page
        dashboardPage.sidenav.goToMenu(NavmenuOption.BUZZ);

        // Publish new post without attachments
        buzzPage.publishNewPostMenu.enterPostText(textForPost).clickPostButton();

        // Post appears under most recent posts
        assertThat(buzzPage.publishedPostArea.getTextPostContentFromNewestPost()).isEqualTo(textForPost);
    }
}
