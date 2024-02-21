package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.browser.AysPageActions;
import org.ays.pages.AssignmentsPOM;

public class AssignmentsCreate {

    private final AssignmentsPOM assignmentsPOM = new AssignmentsPOM();
    private final AysPageActions pageActions = new AysPageActions();

    @When("Click on the assignments tab")
    public void Click_on_the_assignments_tab() {
        pageActions.waitUntilClickable(assignmentsPOM.getAssignments());
        pageActions.clickMethod(assignmentsPOM.getAssignments());
    }

    @And("Click on the create button")
    public void Click_on_the_create_button() {
        pageActions.moveToElement(assignmentsPOM.getCreateButton());
        pageActions.clickElementWithJavaScript(assignmentsPOM.getCreateButton());
    }

    @And("Fill out the assignment form")
    public void Fill_out_the_assignment_form() {
        pageActions.sendKeysMethod(assignmentsPOM.getCreateName(), "rıfkı");
        pageActions.sendKeysMethod(assignmentsPOM.getCreateSurname(), "maraz");
        pageActions.sendKeysMethod(assignmentsPOM.getCreateDescription(), "abcdfghh");
        pageActions.clickMethod(assignmentsPOM.getCreateAreaCode());
        pageActions.clickMethod(assignmentsPOM.getCreateTurkiyeAreaCode());
        pageActions.clickMethod(assignmentsPOM.getCreatePhoneNumber());
        pageActions.sendKeysMethod(assignmentsPOM.getCreatePhoneNumber(), "6555555555");
        pageActions.clickMethod(assignmentsPOM.getCreateLocation());
        pageActions.clickMethod(assignmentsPOM.getCreateMapSelect());
        pageActions.clickMethod(assignmentsPOM.getCreateLocationMarkerIcon());
        pageActions.clickMethod(assignmentsPOM.getOkButton());
    }

    @And("Enter invalid characters in the name field while filling out the assignment form")
    public void Enter_invalid_characters_in_the_name_field_while_filling_out_the_assignment_form() {
        pageActions.sendKeysMethod(assignmentsPOM.getCreateName(), "?--/-**-8965");
        pageActions.sendKeysMethod(assignmentsPOM.getCreateSurname(), "maraz");
        pageActions.sendKeysMethod(assignmentsPOM.getCreateDescription(), "huıpvd");
        pageActions.clickMethod(assignmentsPOM.getCreateAreaCode());
        pageActions.clickMethod(assignmentsPOM.getCreateTurkiyeAreaCode());
        pageActions.sendKeysMethod(assignmentsPOM.getCreatePhoneNumber(), "55555555");
    }

    @And("Enter invalid characters in the last name field while filling out the assignment form")
    public void Enter_invalid_characters_in_the_last_name_field_while_filling_out_the_assignment_form() {
        pageActions.sendKeysMethod(assignmentsPOM.getCreateName(), "rıfkı");
        pageActions.sendKeysMethod(assignmentsPOM.getCreateSurname(), "maraz");
        pageActions.sendKeysMethod(assignmentsPOM.getCreateDescription(), "abcuqopg");
        pageActions.clickMethod(assignmentsPOM.getCreateAreaCode());
        pageActions.clickMethod(assignmentsPOM.getCreateTurkiyeAreaCode());
        pageActions.sendKeysMethod(assignmentsPOM.getCreatePhoneNumber(), "888888888");
    }

    @And("Enter an invalid description while filling out the assignment form")
    public void Enter_an_invalid_description_while_filling_out_the_assignment_form() {
        pageActions.sendKeysMethod(assignmentsPOM.getCreateName(), "rıfkı");
        pageActions.sendKeysMethod(assignmentsPOM.getCreateSurname(), "maraz");
        pageActions.sendKeysMethod(assignmentsPOM.getCreateDescription(), "?-/*-+?'!$[}");
        pageActions.clickMethod(assignmentsPOM.getCreateAreaCode());
        pageActions.clickMethod(assignmentsPOM.getCreateTurkiyeAreaCode());
        pageActions.sendKeysMethod(assignmentsPOM.getCreatePhoneNumber(), "55555555");
    }

    @And("Enter an invalid phone number while filling out the assignment form")
    public void Enter_an_invalid_phone_number_while_filling_out_the_assignment_form() {
        pageActions.sendKeysMethod(assignmentsPOM.getCreateName(), "rıfkı");
        pageActions.sendKeysMethod(assignmentsPOM.getCreateSurname(), "maraz");
        pageActions.sendKeysMethod(assignmentsPOM.getCreateDescription(), "acbdyagyqcbm");
        pageActions.clickMethod(assignmentsPOM.getCreateAreaCode());
        pageActions.clickMethod(assignmentsPOM.getCreateTurkiyeAreaCode());
        pageActions.sendKeysMethod(assignmentsPOM.getCreatePhoneNumber(), "161616");
    }

    @And("Enter invalid coordinates while filling out the assignment form")
    public void Enter_invalid_coordinates_while_filling_out_the_assignment_form() {
        pageActions.sendKeysMethod(assignmentsPOM.getCreateName(), "rıfkı");
        pageActions.sendKeysMethod(assignmentsPOM.getCreateSurname(), "maraz");
        pageActions.sendKeysMethod(assignmentsPOM.getCreateDescription(), "qwertty");
        pageActions.clickMethod(assignmentsPOM.getCreateAreaCode());
        pageActions.clickMethod(assignmentsPOM.getCreateTurkiyeAreaCode());
        pageActions.sendKeysMethod(assignmentsPOM.getCreatePhoneNumber(), " ");
    }

    @Then("Click on the save button")
    public void Click_on_the_save_button() {
        pageActions.clickMethod(assignmentsPOM.getSaveAssignment());
    }

}
