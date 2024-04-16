package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.ays.browser.AysPageActions;
import org.ays.pages.RegistrationApplicationsPOM;
import org.ays.pages.SuperAdminPOM;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class RegistrationApplicationsDetails {
    private final RegistrationApplicationsPOM registrationApplications = new RegistrationApplicationsPOM();
    private final AysPageActions pageActions = new AysPageActions();
    private final SuperAdminPOM superAdminPOM = new SuperAdminPOM();

    @Then("I should see the following column headers")
    public void iShouldSeeTheFollowingColumnHeaders(List<String> expectedHeaders) {
        List<WebElement> headerCells = registrationApplications.getRegistrationApplicationsListColumnHeaders();
        List<String> actualHeaders = new ArrayList<>();
        for (WebElement headerCell : headerCells) {
            actualHeaders.add(headerCell.getText());
        }
        Assert.assertEquals(expectedHeaders, actualHeaders);
    }

    @And("Select waiting option from the status menu")
    public void selectWaitingOptionFromTheStatusMenu() {
        pageActions.clickMethod(registrationApplications.getStatusOptionsFromFilterDropdownMenu().get(0));
    }

    @And("Click status bar")
    public void clickStatusBar() {
        pageActions.clickMethod(superAdminPOM.getStatusBar());
    }

    @Then("The review button should not be available")
    public void theReviewButtonShouldNotBeAvailable() {
        List<WebElement> actionButtons = registrationApplications.getShowButtonUnderTheActions();
        Assert.assertTrue(actionButtons.isEmpty(), "Action button should not be available");
    }
}
