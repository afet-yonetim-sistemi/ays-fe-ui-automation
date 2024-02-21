package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.ays.browser.AysPageActions;
import org.ays.pages.AssignmentsPOM;
import org.testng.Assert;

public class AssignmentsLocation {

    private final AssignmentsPOM assignmentsPOM = new AssignmentsPOM();
    private final AysPageActions pageActions = new AysPageActions();

    @And("Click on the location marker button for the top assignment")
    public void Click_on_the_location_marker_button_for_the_top_assignment() {
        pageActions.moveToElement(assignmentsPOM.getShowLocation());
        pageActions.clickElementWithJavaScript(assignmentsPOM.getShowLocation());
    }

    @Then("Validate that the location has been displayed")
    public void Validate_that_the_location_has_been_displayed() {
        pageActions.waitUntilVisible(assignmentsPOM.getValidateLocation());
        Assert.assertTrue(assignmentsPOM.getValidateLocation().isDisplayed());
    }

    @Then("Open in Google Maps in the popped-up windows")
    public void Open_in_Google_Maps_in_the_popped_up_windows() {
        pageActions.clickMethod(assignmentsPOM.getOpenGoogleMaps());
    }

    @Then("Click on the copy details of the location button")
    public void Click_on_the_copy_details_of_the_location_button() {
        pageActions.clickMethod(assignmentsPOM.getCopyLocationInfo());
    }

    @Then("Click on the open location on the phone button")
    public void Click_on_the_open_location_on_the_phone_button() {
        pageActions.clickMethod(assignmentsPOM.getOpenOnMyPhone());
    }

}
