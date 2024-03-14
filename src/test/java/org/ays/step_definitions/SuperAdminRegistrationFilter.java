package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.browser.AysPageActions;
import org.ays.configuration.AysConfigurationProperty;
import org.ays.pages.LoginPOM;
import org.ays.pages.SuperAdminPOM;

public class SuperAdminRegistrationFilter {
    private final LoginPOM loginPOM = new LoginPOM();
    private final AysPageActions pageActions = new AysPageActions();
    private final SuperAdminPOM superAdminPOM = new SuperAdminPOM();

    @When("Enter the super admin username and password")
    public void enter_the_username_and_password() {
        this.pageActions.sendKeysMethod(loginPOM.getLoginUsername(), AysConfigurationProperty.InstitutionOne.SuperAdminUserOne.USERNAME);
        this.pageActions.sendKeysMethod(loginPOM.getLoginPassword(), AysConfigurationProperty.InstitutionOne.SuperAdminUserOne.PASSWORD);
    }

    @When("Click on the registration-application")
    public void Click_on_the_assignments_tab() {
        pageActions.waitUntilClickable(superAdminPOM.getRegistrationApplication());
        pageActions.clickMethod(superAdminPOM.getRegistrationApplication());
    }

    @And("Click filter icon")
    public void Click_on_the_filter_icon() {
        pageActions.moveToElement(superAdminPOM.getFilterIcon());
        pageActions.waitUntilClickable(superAdminPOM.getFilterIcon());
        pageActions.clickElementWithJavaScript(superAdminPOM.getFilterIcon());
    }

    @And("Selects available option from the status menu")
    public void Select_the_available_option_from_the_status_menu() {
        pageActions.clickMethod(superAdminPOM.getStatusBar());
        pageActions.clickElementWithJavaScript(superAdminPOM.getWaiting());
        pageActions.clickMethod(superAdminPOM.getStatusBar());
    }

    @Then("Click filter button")
    public void Click_on_the_filter_button() {
        pageActions.clickMethod(superAdminPOM.getFiltersButton());
    }
}
