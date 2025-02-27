package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.browser.AysPageActions;
import org.ays.enums.AysLanguage;
import org.ays.pages.AdminRegistrationApplicationDetailPage;
import org.ays.pages.AdminRegistrationApplicationsPage;
import org.ays.pages.AdminRegistrationPreApplicationPage;
import org.ays.utilities.AysLocaleStorageUtil;
import org.ays.utilities.AysLocalizationUtil;
import org.ays.utilities.AysRandomUtil;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class AdminRegistrationPreApplicationCreation {

    private final AdminRegistrationApplicationsPage adminRegistrationApplicationsPage;
    private final AdminRegistrationApplicationDetailPage adminRegistrationApplicationDetailPage;
    private final AdminRegistrationPreApplicationPage adminRegistrationPreApplicationPage;
    private final AysLocalizationUtil localizationUtil;
    private final AysPageActions pageActions;

    public AdminRegistrationPreApplicationCreation() {
        this.adminRegistrationApplicationsPage = new AdminRegistrationApplicationsPage();
        this.adminRegistrationApplicationDetailPage = new AdminRegistrationApplicationDetailPage();
        this.adminRegistrationPreApplicationPage = new AdminRegistrationPreApplicationPage();
        this.localizationUtil = new AysLocalizationUtil();
        this.pageActions = new AysPageActions();
    }

    @And("Click on the Admin Registration Applications button from left  navigation bar")
    public void clickOnTheAdminRegistrationApplicationsButtonFromLeftNavigationBar() {
        pageActions.clickMethod(adminRegistrationApplicationsPage.getAdminRegistrationApplicationsMenu());
    }

    @And("Click on the Create Pre-Application button")
    public void clickOnTheCreatePreApplicationButton() {
        pageActions.clickMethod(adminRegistrationApplicationsPage.getCreatePreApplicationButton());
    }

    @When("Select an institution from the dropdown menu")
    public void selectAnInstitutionFromTheDropdownMenu() {
        pageActions.clickMethod(adminRegistrationPreApplicationPage.getSelectInstitution());
        pageActions.clickMethod(adminRegistrationPreApplicationPage.getInstitutionOptions().get(0));
    }

    @And("Enter a valid creation reason with text between {int} and {int} characters")
    public void enterAValidCreationReasonWithTextBetweenAndCharacters() {
        String enteredReason = AysRandomUtil.generateReason();
        pageActions.clickMethod(adminRegistrationPreApplicationPage.getReason());
        pageActions.sendKeysMethod(adminRegistrationPreApplicationPage.getReason(), enteredReason);
    }

    @And("Click the create button for pre-application form")
    public void clickTheCreateButtonForPreApplicationForm() {
        pageActions.clickMethod(adminRegistrationPreApplicationPage.getCreateButton());
    }

    @Then("User should see a success message confirming the pre-application creation")
    public void userShouldSeeASuccessMessageConfirmingThePreApplicationCreation() {
        assertTrue(pageActions.isPresent(adminRegistrationPreApplicationPage.getSuccessMessage()));
    }

    @And("User should be redirected to the details page after creation")
    public void userShouldBeRedirectedToTheDetailsPageAfterCreation() {
        assertTrue(pageActions.isPresent(adminRegistrationApplicationDetailPage.getHeader()));
    }


    @Then("Enter {string} and validate the error message {string}")
    public void enterAndValidateTheErrorMessage(String invalidReason, String errorKey) {
        pageActions.clickMethod(adminRegistrationPreApplicationPage.getReason());
        pageActions.sendKeysMethod(adminRegistrationPreApplicationPage.getReason(), invalidReason);
        pageActions.clickMethod(adminRegistrationPreApplicationPage.getCreateButton());


        String actualErrorMessage = adminRegistrationPreApplicationPage.getErrorMessageForReason().getText();
        localizationUtil.validateElementMessage(
                errorKey,
                actualErrorMessage,
                true
        );
    }

    @Then("Enter a reason with more than {int} characters and validate the error message")
    public void enterAReasonWithMoreThanCharactersAndValidateTheErrorMessage(int length) {
        String longReason = AysRandomUtil.generateReason(600);
        String expectedErrorMessage = "This field must be at most " + length + " characters.";

        pageActions.clickMethod(adminRegistrationPreApplicationPage.getReason());
        pageActions.sendKeysMethod(adminRegistrationPreApplicationPage.getReason(), longReason);
        pageActions.clickMethod(adminRegistrationPreApplicationPage.getCreateButton());

        String actualErrorMessage = adminRegistrationPreApplicationPage.getErrorMessageForReason().getText();

        assertEquals(actualErrorMessage, expectedErrorMessage,
                "The error message did not match the expected message for reason length: " + longReason.length());
    }


    @Then("User should see an error message for institution as {string}")
    public void userShouldSeeAnErrorMessageForInstitutionAs(String expectedInstitutionErrorMessage) {
        String actualInstitutionErrorMessage = adminRegistrationPreApplicationPage.getErrorMessageForInstitution().getText();
        Assert.assertEquals(
                actualInstitutionErrorMessage,
                expectedInstitutionErrorMessage,
                "Error message did not match."
        );
    }

    @Then("I should see an error message for reason {string}")
    public void iShouldSeeAnErrorMessageForReason(String expectedReasonErrorMessage) {
        String actualReasonErrorMessage = adminRegistrationPreApplicationPage.getErrorMessageForReason().getText();
        Assert.assertEquals(actualReasonErrorMessage, expectedReasonErrorMessage, "Error message did not match.");
    }

    @Then("User should see that the application status is {string}")
    public void userShouldSeeThatTheApplicationStatusIs(String expectedStatus) {
        pageActions.waitUntilVisible(adminRegistrationApplicationDetailPage.getStatus());
        String actualStatus = adminRegistrationApplicationDetailPage.getStatus().getAttribute("value");
        Assert.assertEquals(actualStatus, expectedStatus);
    }

    @Then("User should be able to see all texts on admin registration pre-application page compatible with the {string} language")
    public void userShouldBeAbleToSeeAllTextsOnAdminRegistrationPreApplicationPageCompatibleWithTheLanguage(String language) {
        if (language.equalsIgnoreCase("Turkish")) {
            AysLocaleStorageUtil.getLanguageFromLocalStorage();
            AysLocalizationUtil.setLanguage(AysLanguage.TR);
        } else if (language.equalsIgnoreCase("English")) {
            AysLocaleStorageUtil.getLanguageFromLocalStorage();
            AysLocalizationUtil.setLanguage(AysLanguage.EN);
        }

        String header = AysLocalizationUtil.getText("admin_reg_pre_application_header");
        String institutionLabel = AysLocalizationUtil.getText("admin_reg_pre_application_institution_label");
        String selectInstitutionButton = AysLocalizationUtil.getText("admin_reg_pre_application_select_institution_button");
        String creationReasonLabel = AysLocalizationUtil.getText("admin_reg_pre_application_creation_reason_label");
        String createButton = AysLocalizationUtil.getText("admin_reg_pre_application_creat_button");


        assertEquals(adminRegistrationPreApplicationPage.getPreApplicationPageHeader().getText(), header);
        assertEquals(adminRegistrationPreApplicationPage.getInstitutionText().getText(), institutionLabel);
        assertEquals(adminRegistrationPreApplicationPage.getSelectInstitutionText().getText(), selectInstitutionButton);
        assertEquals(adminRegistrationPreApplicationPage.getCreationReasonText().getText(), creationReasonLabel);
        assertEquals(adminRegistrationPreApplicationPage.getCreateButton().getText(), createButton);

    }

}
