package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.ays.browser.AysPageActions;
import org.ays.pages.AssignmentsPOM;
import org.testng.Assert;

public class AssignmentsShow {

    private final AssignmentsPOM assignmentsPOM = new AssignmentsPOM();
    private final AysPageActions pageActions = new AysPageActions();

    @And("Click on the eye icon with the show button")
    public void Click_on_the_eye_icon_with_the_show_button() {
        pageActions.moveToElement(assignmentsPOM.getShow());
        pageActions.clickElementWithJavaScript(assignmentsPOM.getShow());
    }

    @Then("Validate that the assignment information has appeared")
    public void Validate_that_the_assignment_information_has_appeared() {
        pageActions.waitUntilVisible(assignmentsPOM.getValidateShow());
        Assert.assertTrue(assignmentsPOM.getValidateShow().isDisplayed());
    }

}
