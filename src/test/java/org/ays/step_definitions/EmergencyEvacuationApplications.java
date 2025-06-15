package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.browser.AysPageActions;
import org.ays.pages.EmergencyEvacuationApplicationsPage;
import org.ays.utilities.AysLocalizationUtil;

public class EmergencyEvacuationApplications {

    private final AysPageActions pageActions;
    private final AysLocalizationUtil localizationUtil;
    private final EmergencyEvacuationApplicationsPage emergencyEvacuationApplicationsPage;

    public EmergencyEvacuationApplications() {
        this.emergencyEvacuationApplicationsPage = new EmergencyEvacuationApplicationsPage();
        this.pageActions = new AysPageActions();
        this.localizationUtil = new AysLocalizationUtil();
    }

    @And("Click on the Emergency Evacuation Applications button from left  navigation bar")
    public void clickOnTheEmergencyEvacuationApplicationsButtonFromLeftNavigationBar() {
        pageActions.waitUntilVisible(emergencyEvacuationApplicationsPage.getEmergencyEvacuationApplicationsMenu());
        pageActions.clickMethod(emergencyEvacuationApplicationsPage.getEmergencyEvacuationApplicationsMenu());
    }

    @Then("User should be able to see all texts on emergency evacuation application page compatible with the language")
    public void userShouldBeAbleToSeeAllTextsOnEmergencyEvacuationApplicationPageCompatibleWithTheLanguage() {
        pageActions.waitUntilVisible(emergencyEvacuationApplicationsPage.getPageHeader());

        localizationUtil.validateElementMessage("emergency_evacuation_applications_page_header",
                emergencyEvacuationApplicationsPage.getPageHeader().getText(), true);

        localizationUtil.validateElementMessage("emergency_evacuation_applications_page_requested_seat_count_field",
                emergencyEvacuationApplicationsPage.getRequestedSeatCountField().getText(), true);

        localizationUtil.validateElementMessage("emergency_evacuation_applications_page_reference_number_field",
                emergencyEvacuationApplicationsPage.getReferenceNumberField().getText(), true);

        localizationUtil.validateElementMessage("emergency_evacuation_applications_page_source_city_field",
                emergencyEvacuationApplicationsPage.getSourceCityField().getText(), true);

        localizationUtil.validateElementMessage("emergency_evacuation_applications_page_source_district_field",
                emergencyEvacuationApplicationsPage.getSourceDistrictField().getText(), true);

        localizationUtil.validateElementMessage("emergency_evacuation_applications_page_target_city_field",
                emergencyEvacuationApplicationsPage.getTargetCityField().getText(), true);

        localizationUtil.validateElementMessage("emergency_evacuation_applications_page_target_district_field",
                emergencyEvacuationApplicationsPage.getTargetDistrictField().getText(), true);

        localizationUtil.validateElementMessage("emergency_evacuation_applications_page_in_person_checkbox_label",
                emergencyEvacuationApplicationsPage.getInPersonCheckboxLabel().getText(), true);

        localizationUtil.validateElementMessage("emergency_evacuation_applications_page_reference_number_column",
                emergencyEvacuationApplicationsPage.getReferenceNumberColumn().getText(), true);

        localizationUtil.validateElementMessage("emergency_evacuation_applications_page_applicant_first_name_column",
                emergencyEvacuationApplicationsPage.getApplicantFirstNameColumn().getText(), true);

        localizationUtil.validateElementMessage("emergency_evacuation_applications_page_applicant_last_name_column",
                emergencyEvacuationApplicationsPage.getApplicantLastNameColumn().getText(), true);

        localizationUtil.validateElementMessage("emergency_evacuation_applications_page_applicant_phone_number_column",
                emergencyEvacuationApplicationsPage.getApplicantPhoneNumberColumn().getText(), true);

        localizationUtil.validateElementMessage("emergency_evacuation_applications_page_is_in_person_column",
                emergencyEvacuationApplicationsPage.getIsInPersonColumn().getText(), true);

        localizationUtil.validateElementMessage("emergency_evacuation_applications_page_requested_seat_count_column",
                emergencyEvacuationApplicationsPage.getRequestedSeatCountColumn().getText(), true);

        localizationUtil.validateElementMessage("emergency_evacuation_applications_page_application_status_column",
                emergencyEvacuationApplicationsPage.getApplicationStatusColumn().getText(), true);

        localizationUtil.validateElementMessage("emergency_evacuation_applications_page_creation_date_column",
                emergencyEvacuationApplicationsPage.getCreationDateColumn().getText(), true);
    }


    @When("User opens the Application Status dropdown")
    public void userOpensTheApplicationStatusDropdown() {
        pageActions.clickMethod(emergencyEvacuationApplicationsPage.getApplicationStatusDropdownMenuButton());
    }

    @Then("User should see all application status options compatible with the selected language")
    public void userShouldSeeAllApplicationStatusOptionsCompatibleWithTheSelectedLanguage() {

        localizationUtil.validateElementMessage("emergency_evacuation_applications_page_status_pending",
                emergencyEvacuationApplicationsPage.getStatusPending().getText(), true);

        localizationUtil.validateElementMessage("emergency_evacuation_applications_page_status_in_review",
                emergencyEvacuationApplicationsPage.getStatusInReview().getText(), true);

        localizationUtil.validateElementMessage("emergency_evacuation_applications_page_status_first_approve",
                emergencyEvacuationApplicationsPage.getStatusFirstApprove().getText(), true);

        localizationUtil.validateElementMessage("emergency_evacuation_applications_page_status_second_approve",
                emergencyEvacuationApplicationsPage.getStatusSecondApprove().getText(), true);

        localizationUtil.validateElementMessage("emergency_evacuation_applications_page_status_third_approve",
                emergencyEvacuationApplicationsPage.getStatusThirdApprove().getText(), true);

        localizationUtil.validateElementMessage("emergency_evacuation_applications_page_status_completed",
                emergencyEvacuationApplicationsPage.getStatusCompleted().getText(), true);

        localizationUtil.validateElementMessage("emergency_evacuation_applications_page_status_cancelled",
                emergencyEvacuationApplicationsPage.getStatusCancelled().getText(), true);


    }
}
