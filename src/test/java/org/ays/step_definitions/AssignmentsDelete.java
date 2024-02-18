package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.ays.pages.AssignmentsPOM;
import org.testng.Assert;

public class AssignmentsDelete {

    AssignmentsPOM assignmentsPOM = new AssignmentsPOM();

    @And("Click on the trash bin icon for the top assignment")
    public void Click_on_the_trash_bin_icon_for_the_top_assignment() {
        assignmentsPOM.moveToElement(assignmentsPOM.getDeleteAssignment());
        assignmentsPOM.clickElementWithJavaScript(assignmentsPOM.getDeleteAssignment());
    }

    @And("Click on the delete button")
    public void Click_on_the_delete_button() {
        assignmentsPOM.clickMethod(assignmentsPOM.getSureDeleteAssignment());
    }

    @Then("Validate the success message")
    public void Validate_the_success_message() {
        assignmentsPOM.waitUntilVisible(assignmentsPOM.getSuccessMessageDelete());
        Assert.assertTrue(assignmentsPOM.getSuccessMessageDelete().isDisplayed());
    }

}
