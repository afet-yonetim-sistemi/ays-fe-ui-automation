package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.browser.AysPageActions;
import org.ays.pages.AdminRegistrationApplicationDetailPage;
import org.ays.pages.AdminRegistrationApplicationsPage;
import org.ays.pages.AdminRegistrationPreApplicationPage;
import org.ays.utilities.AysRandomUtil;
import org.testng.Assert;

public class AdminRegistrationPreApplicationCreation {
    private final AdminRegistrationApplicationsPage adminRegistrationApplicationsPage;
    private final AdminRegistrationApplicationDetailPage adminRegistrationApplicationDetailPage;
    private final AdminRegistrationPreApplicationPage adminRegistrationPreApplicationPage;
    private final AysPageActions pageActions;
    private String enteredReason;

    public AdminRegistrationPreApplicationCreation() {
        this.adminRegistrationApplicationsPage = new AdminRegistrationApplicationsPage();
        this.adminRegistrationApplicationDetailPage = new AdminRegistrationApplicationDetailPage();
        this.adminRegistrationPreApplicationPage = new AdminRegistrationPreApplicationPage();
        this.pageActions = new AysPageActions();
    }

    @And("Click on the Admin Registration Applications button from left  navigation bar")
    public void clickOnTheAdminRegistrationApplicationsButtonFromLeftNavigationBar() {
        pageActions.clickMethod(adminRegistrationApplicationsPage.getAdminRegistrationApplications());
    }

    @And("Click on the Create Pre-Application button")
    public void clickOnTheCreatePreApplicationButton() {
        pageActions.clickMethod(adminRegistrationApplicationsPage.getCreatePreApplication());
    }

    @When("Select an institution from the dropdown menu")
    public void selectAnInstitutionFromTheDropdownMenu() {
        pageActions.clickMethod(adminRegistrationPreApplicationPage.getSelectInstitution());
        pageActions.clickMethod(adminRegistrationPreApplicationPage.getInstitutionOptions().get(0));
    }

    @And("Enter a valid creation reason with text between {int} and {int} characters")
    public void enterAValidCreationReasonWithTextBetweenAndCharacters(int arg0, int arg1) {
        enteredReason = AysRandomUtil.generateReason();
        pageActions.clickMethod(adminRegistrationPreApplicationPage.getReason());
        pageActions.sendKeysMethod(adminRegistrationPreApplicationPage.getReason(), enteredReason);
    }

    @And("Click the create button for pre-application form")
    public void clickTheCreateButtonForPreApplicationForm() {
        pageActions.clickMethod(adminRegistrationPreApplicationPage.getCreate());
    }

    @Then("I should see a success message confirming the pre-application creation")
    public void iShouldSeeASuccessMessageConfirmingThePreApplicationCreation() {
        Assert.assertTrue(pageActions.isPresent(adminRegistrationPreApplicationPage.getSuccessMessage()));
    }

    @And("I should be redirected to the details page after creation")
    public void iShouldBeRedirectedToTheDetailsPageAfterCreation() {
        Assert.assertTrue(pageActions.isPresent(adminRegistrationApplicationDetailPage.getHeader()));
        String actualReason = adminRegistrationApplicationDetailPage.getReasonValue().getAttribute("value");
        Assert.assertEquals(enteredReason, actualReason);
    }


    @Then("Enter {string} and validate the error message {string}")
    public void enterAndValidateTheErrorMessage(String invalidReason, String expectedErrorMessage) {
        pageActions.clickMethod(adminRegistrationPreApplicationPage.getReason());
        pageActions.sendKeysMethod(adminRegistrationPreApplicationPage.getReason(), invalidReason);
        pageActions.clickMethod(adminRegistrationPreApplicationPage.getCreate());

        String actualErrorMessage = adminRegistrationPreApplicationPage.getErrorMessageForReason().getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "Error message mismatch for reason: " + invalidReason);

    }

    @Then("Enter a reason with more than {int} characters and validate the error message")
    public void enterAReasonWithMoreThanCharactersAndValidateTheErrorMessage(int length) {
        String longReason = "A".repeat(length + 1);
        String expectedErrorMessage = "This field must not exceed " + length + " characters.";

        pageActions.clickMethod(adminRegistrationPreApplicationPage.getReason());
        pageActions.sendKeysMethod(adminRegistrationPreApplicationPage.getReason(), longReason);
        pageActions.clickMethod(adminRegistrationPreApplicationPage.getCreate());

        String actualErrorMessage = adminRegistrationPreApplicationPage.getErrorMessageForReason().getText();

        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "The error message did not match the expected message for reason length: " + longReason.length());
    }


    @Then("I should see an error message for institution as {string}")
    public void iShouldSeeAnErrorMessageForInstitutionAs(String expectedInstitutionErrorMessage) {
        String actualInstitutionErrorMessage = adminRegistrationPreApplicationPage.getErrorMessageForInstitution().getText();
        Assert.assertEquals(actualInstitutionErrorMessage, expectedInstitutionErrorMessage,
                "Error message did not match.");

    }

    @Then("I should see an error message for reason {string}")
    public void iShouldSeeAnErrorMessageForReason(String expectedReasonErrorMessage) {
        String actualReasonErrorMessage = adminRegistrationPreApplicationPage.getErrorMessageForReason().getText();
        Assert.assertEquals(actualReasonErrorMessage, expectedReasonErrorMessage, "Error message did not match.");
    }
}
