package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.browser.AysPageActions;
import org.ays.configuration.AysConfigurationProperty;
import org.ays.enums.AysEndpoints;
import org.ays.pages.AdminRegistrationApplicationDetailPage;
import org.ays.pages.AdminRegistrationApplicationsPage;
import org.ays.pages.AdminRegistrationPreApplicationPage;
import org.ays.pages.NotFoundPage;
import org.ays.utilities.AysLocalizationUtil;
import org.ays.utilities.AysRandomUtil;

import static org.testng.Assert.assertTrue;

public class AdminRegistrationPreApplicationCreation {

    private final AdminRegistrationApplicationsPage adminRegistrationApplicationsPage;
    private final AdminRegistrationApplicationDetailPage adminRegistrationApplicationDetailPage;
    private final AdminRegistrationPreApplicationPage adminRegistrationPreApplicationPage;
    private final NotFoundPage notFoundPage;
    private final AysLocalizationUtil localizationUtil;
    private final AysPageActions pageActions;

    public AdminRegistrationPreApplicationCreation() {
        this.adminRegistrationApplicationsPage = new AdminRegistrationApplicationsPage();
        this.adminRegistrationApplicationDetailPage = new AdminRegistrationApplicationDetailPage();
        this.adminRegistrationPreApplicationPage = new AdminRegistrationPreApplicationPage();
        this.notFoundPage = new NotFoundPage();
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
        pageActions.waitFor(1);
        pageActions.clickMethod(adminRegistrationPreApplicationPage.getInstitutionOptions().get(0));
    }

    @And("Enter a valid creation reason")
    public void enterAValidCreationReason() {
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

        pageActions.clickMethod(adminRegistrationPreApplicationPage.getReason());
        pageActions.sendKeysMethod(adminRegistrationPreApplicationPage.getReason(), longReason);
        pageActions.clickMethod(adminRegistrationPreApplicationPage.getCreateButton());

        localizationUtil.validateElementMessage(
                "reason_error.too_long",
                adminRegistrationPreApplicationPage.getErrorMessageForReason().getText(),
                true);
    }

    @Then("User should see an error message for institution")
    public void userShouldSeeAnErrorMessageForInstitution() {
        localizationUtil.validateElementMessage(
                "institution_error",
                adminRegistrationPreApplicationPage.getErrorMessageForInstitution().getText(),
                true);
    }

    @Then("I should see an error message for reason")
    public void iShouldSeeAnErrorMessageForReason() {
        localizationUtil.validateElementMessage(
                "reason_error.too_short",
                adminRegistrationPreApplicationPage.getErrorMessageForReason().getText(),
                true
        );
    }

    @Then("User should see that the application status is waiting")
    public void userShouldSeeThatTheApplicationStatusIsWaiting() {
        pageActions.waitUntilVisible(adminRegistrationApplicationDetailPage.getStatus());
        localizationUtil.validateElementMessage(
                "admin_reg_pre_application_status_waiting",
                adminRegistrationApplicationDetailPage.getStatus().getAttribute("value"),
                true
        );
    }

    @Then("User should be able to see all texts on admin registration pre-application page compatible with the language")
    public void userShouldBeAbleToSeeAllTextsOnAdminRegistrationPreApplicationPageCompatibleWithTheLanguage() {
        pageActions.waitUntilVisible(adminRegistrationPreApplicationPage.getPreApplicationPageHeader());
        localizationUtil.validateElementMessage("admin_reg_pre_application_header",
                adminRegistrationPreApplicationPage.getPreApplicationPageHeader().getText(),
                true);
        localizationUtil.validateElementMessage("admin_reg_pre_application_institution_label",
                adminRegistrationPreApplicationPage.getInstitutionText().getText(),
                true);
        localizationUtil.validateElementMessage("admin_reg_pre_application_select_institution_button",
                adminRegistrationPreApplicationPage.getSelectInstitution().getText(),
                true);
        localizationUtil.validateElementMessage("admin_reg_pre_application_creation_reason_label",
                adminRegistrationPreApplicationPage.getCreationReasonText().getText(),
                true);
        localizationUtil.validateElementMessage("admin_reg_pre_application_creat_button",
                adminRegistrationPreApplicationPage.getCreateButton().getText(),
                true);
    }

    @Then("User should not be able to access the Admin Registration Pre-Application page")
    public void userShouldNotBeAbleToAccessTheAdminRegistrationPreApplicationPage() {
        pageActions.waitFor(2);
        pageActions.getWebDriver().get(
                AysConfigurationProperty.Ui.URL +
                        AysEndpoints.ADMIN_REGISTRATION_PRE_APPLICATION_CREATION.getUrl());
        pageActions.waitUntilVisible(notFoundPage.getText());
        assertTrue(notFoundPage.getText().isDisplayed());
    }

}
