package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AYOSAssignmentsPOM;

public class AssignmentsEdit {
    AYOSAssignmentsPOM ayo =new AYOSAssignmentsPOM();
    @And("Click on the pencil icon with the edit button")
    public void Click_on_the_pencil_icon_with_the_edit_button() {
        ayo.moveToElement(ayo.getEdit());
        ayo.clickElementWithJavaScript(ayo.getEdit());
    }
    @And("Edit each input in the assignment form")
    public void Edit_each_input_in_the_assignment_form() {
        ayo.getName().sendKeys(Keys.BACK_SPACE);
        ayo.sendKeysMethod(ayo.getName(), "ABCDE");

        ayo.getSurname().sendKeys(Keys.BACK_SPACE);
        ayo.sendKeysMethod(ayo.getSurname(), "ABCDE");

        ayo.getDescription().sendKeys(Keys.BACK_SPACE);
        ayo.sendKeysMethod(ayo.getDescription(), "ABCDE");

        ayo.clickMethod(ayo.getAreaCode());
        ayo.clickMethod(ayo.getTurkiyeAreaCode());

        ayo.getPhoneNumber().sendKeys(Keys.BACK_SPACE);
        ayo.sendKeysMethod(ayo.getPhoneNumber(), "11");
    }
    @Then("Click on the save edit button")
    public void Click_on_the_save_edit_button() {
        ayo.clickMethod(ayo.getEditSaveButton());
    }
}
