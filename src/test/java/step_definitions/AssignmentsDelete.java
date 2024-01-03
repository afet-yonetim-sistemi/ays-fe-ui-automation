package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.AYOSAssignmentsPOM;

public class AssignmentsDelete {
    AYOSAssignmentsPOM ayo =new AYOSAssignmentsPOM();
    @And("Click on the trash bin icon for the top assignment")
    public void Click_on_the_trash_bin_icon_for_the_top_assignment() {
        ayo.clickMethod(ayo.getDeleteAssignment());
    }
    @And("Click on the delete button")
    public void Click_on_the_delete_button() {
     ayo.clickMethod(ayo.getSureDeleteAssignment());
    }
    @Then("Validate the success message")
    public void Validate_the_success_message() {
    ayo.waitUntilVisible(ayo.getSuccessMessageDelete());
    Assert.assertTrue(ayo.getSuccessMessageDelete().isDisplayed());
    }
}
