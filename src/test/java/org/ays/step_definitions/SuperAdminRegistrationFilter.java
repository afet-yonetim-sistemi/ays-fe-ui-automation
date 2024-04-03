package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.browser.AysPageActions;
import org.ays.configuration.AysConfigurationProperty;
import org.ays.pages.LoginPOM;
import org.ays.pages.SuperAdminPOM;
import org.openqa.selenium.WebElement;

import java.util.List;
import org.testng.Assert;


public class SuperAdminRegistrationFilter {
    private final LoginPOM loginPOM = new LoginPOM();
    private final SuperAdminPOM superAdminPOM = new SuperAdminPOM();
    private final AysPageActions pageActions = new AysPageActions();

    @When("Enter the super admin username and password")
    public void Enter_the_super_admin_username_and_password() {
        this.pageActions.sendKeysMethod(loginPOM.getLoginUsername(), AysConfigurationProperty.InstitutionOne.SuperAdminUserOne.USERNAME);
        this.pageActions.sendKeysMethod(loginPOM.getLoginPassword(), AysConfigurationProperty.InstitutionOne.SuperAdminUserOne.PASSWORD);
    }

    @When("Click on the registration-application")
    public void Click_on_the_registration_application() {
        pageActions.waitUntilClickable(superAdminPOM.getRegistrationApplication());
        pageActions.clickMethod(superAdminPOM.getRegistrationApplication());
    }

    @And("Click filter icon")
    public void Click_filter_icon() {
        pageActions.clickElementWithJavaScript(superAdminPOM.getFilterIcon());
    }

    @And("Select available option from the status menu")
    public void Select_available_option_from_the_status_menu() {
        pageActions.clickMethod(superAdminPOM.getStatusBar());
        pageActions.clickMethod(superAdminPOM.getStatusOptionsFromFilterDropdownMenu().get(0));
        pageActions.clickMethod(superAdminPOM.getStatusBar());
    }

    @Then("Click filter button")
    public void Click_filter_button() {
        pageActions.clickMethod(superAdminPOM.getFiltersButton());
    }

    @And("All status row can show {string}")
    public void allStatusRowCanShow(String expectedStatus) {

        pageActions.waitUntilVisible(superAdminPOM.getStatusColumn());
        List<WebElement> statusCells = superAdminPOM.getStatusColumn();

        for (WebElement cell : statusCells) {
            Assert.assertEquals(cell.getText(), expectedStatus);
        }
    }
}
