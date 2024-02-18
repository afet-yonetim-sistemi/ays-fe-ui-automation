package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.ays.pages.AssignmentsPOM;
import org.openqa.selenium.Keys;

public class AssignmentsEdit {
    AssignmentsPOM assignmentsPOM = new AssignmentsPOM();

    @And("Click on the pencil icon with the edit button")
    public void Click_on_the_pencil_icon_with_the_edit_button() {
        assignmentsPOM.moveToElement(assignmentsPOM.getEdit());
        assignmentsPOM.clickElementWithJavaScript(assignmentsPOM.getEdit());
    }

    @And("Edit each input in the assignment form")
    public void Edit_each_input_in_the_assignment_form() {
        assignmentsPOM.getName().sendKeys(Keys.BACK_SPACE);
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getName(), "ABCDE");

        assignmentsPOM.getSurname().sendKeys(Keys.BACK_SPACE);
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getSurname(), "ABCDE");

        assignmentsPOM.getDescription().sendKeys(Keys.BACK_SPACE);
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getDescription(), "ABCDE");

        assignmentsPOM.clickMethod(assignmentsPOM.getAreaCode());
        assignmentsPOM.clickMethod(assignmentsPOM.getTurkiyeAreaCode());

        assignmentsPOM.getPhoneNumber().sendKeys(Keys.BACK_SPACE);
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getPhoneNumber(), "11");
    }

    @Then("Click on the save edit button")
    public void Click_on_the_save_edit_button() {
        assignmentsPOM.clickMethod(assignmentsPOM.getEditSaveButton());
    }
}
