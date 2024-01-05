package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.AYOSAssignmentsPOM;

public class AYOSAssignmentsShow {
    AYOSAssignmentsPOM ayo =new AYOSAssignmentsPOM();
    @And("Click on the eye icon with the show button")
    public void Click_on_the_eye_icon_with_the_show_button() {
        ayo.moveToElement(ayo.getShow());
        ayo.clickElementWithJavaScript(ayo.getShow());
    }
    @Then("Validate that the assignment information has appeared")
    public void Validate_that_the_assignment_information_has_appeared() {
        ayo.waitUntilVisible(ayo.getValidateShow());
        Assert.assertTrue(ayo.getValidateShow().isDisplayed());
    }
}
