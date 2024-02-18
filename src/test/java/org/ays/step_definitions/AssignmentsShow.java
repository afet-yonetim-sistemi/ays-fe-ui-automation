package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.ays.pages.AssignmentsPOM;
import org.ays.utilities.PageActions;
import org.testng.Assert;

public class AssignmentsShow extends PageActions {

    AssignmentsPOM assignmentsPOM = new AssignmentsPOM();

    @And("Click on the eye icon with the show button")
    public void Click_on_the_eye_icon_with_the_show_button() {
        this.moveToElement(assignmentsPOM.getShow());
        this.clickElementWithJavaScript(assignmentsPOM.getShow());
    }

    @Then("Validate that the assignment information has appeared")
    public void Validate_that_the_assignment_information_has_appeared() {
        this.waitUntilVisible(assignmentsPOM.getValidateShow());
        Assert.assertTrue(assignmentsPOM.getValidateShow().isDisplayed());
    }

}
