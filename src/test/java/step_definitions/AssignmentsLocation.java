package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.AYOSAssignmentsPOM;

public class AssignmentsLocation {
    AYOSAssignmentsPOM ayo =new AYOSAssignmentsPOM();
    @And("Click on the location marker button for the top assignment")
    public void Click_on_the_location_marker_button_for_the_top_assignment() {
        ayo.moveToElement(ayo.getShowLocation());
        ayo.clickElementWithJavaScript(ayo.getShowLocation());
    }
    @Then("Validate that the location has been displayed")
    public void Validate_that_the_location_has_been_displayed() {
        ayo.waitUntilVisible(ayo.getValidateLocation());
        Assert.assertTrue(ayo.getValidateLocation().isDisplayed());
    }
    @Then("Open in Google Maps in the popped-up windows")
    public void Open_in_Google_Maps_in_the_popped_up_windows() {
        ayo.clickMethod(ayo.getOpenGoogleMaps());
    }
    @Then("Click on the copy details of the location button")
    public void Click_on_the_copy_details_of_the_location_button() {
        ayo.clickMethod(ayo.getCopyLocationInfo());
    }
    @Then("Click on the open location on the phone button")
    public void Click_on_the_open_location_on_the_phone_button() {
        ayo.clickMethod(ayo.getOpenOnMyPhone());
    }
}
