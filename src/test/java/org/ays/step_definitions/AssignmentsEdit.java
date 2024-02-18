package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.ays.pages.AssignmentsPOM;
import org.ays.utilities.PageActions;
import org.openqa.selenium.Keys;

public class AssignmentsEdit extends PageActions {

    AssignmentsPOM assignmentsPOM = new AssignmentsPOM();

    @And("Click on the pencil icon with the edit button")
    public void Click_on_the_pencil_icon_with_the_edit_button() {
        this.moveToElement(assignmentsPOM.getEdit());
        this.clickElementWithJavaScript(assignmentsPOM.getEdit());
    }

    @And("Edit each input in the assignment form")
    public void Edit_each_input_in_the_assignment_form() {
        assignmentsPOM.getName().sendKeys(Keys.BACK_SPACE);
        this.sendKeysMethod(assignmentsPOM.getName(), "ABCDE");

        assignmentsPOM.getSurname().sendKeys(Keys.BACK_SPACE);
        this.sendKeysMethod(assignmentsPOM.getSurname(), "ABCDE");

        assignmentsPOM.getDescription().sendKeys(Keys.BACK_SPACE);
        this.sendKeysMethod(assignmentsPOM.getDescription(), "ABCDE");

        this.clickMethod(assignmentsPOM.getAreaCode());
        this.clickMethod(assignmentsPOM.getTurkiyeAreaCode());

        assignmentsPOM.getPhoneNumber().sendKeys(Keys.BACK_SPACE);
        this.sendKeysMethod(assignmentsPOM.getPhoneNumber(), "11");
    }

    @Then("Click on the save edit button")
    public void Click_on_the_save_edit_button() {
        this.clickMethod(assignmentsPOM.getEditSaveButton());
    }

}
