package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.pages.AssignmentsPOM;
import org.ays.utilities.PageActions;

public class AssignmentsCreate extends PageActions {

    AssignmentsPOM assignmentsPOM = new AssignmentsPOM();

    @When("Click on the assignments tab")
    public void Click_on_the_assignments_tab() {
        this.waitUntilClickable(assignmentsPOM.getAssignments());
        this.clickMethod(assignmentsPOM.getAssignments());
    }

    @And("Click on the create button")
    public void Click_on_the_create_button() {
        this.moveToElement(assignmentsPOM.getCreateButton());
        this.clickElementWithJavaScript(assignmentsPOM.getCreateButton());
    }

    @And("Fill out the assignment form")
    public void Fill_out_the_assignment_form() {
        this.sendKeysMethod(assignmentsPOM.getCreateName(), "rıfkı");
        this.sendKeysMethod(assignmentsPOM.getCreateSurname(), "maraz");
        this.sendKeysMethod(assignmentsPOM.getCreateDescription(), "abcdfghh");
        this.clickMethod(assignmentsPOM.getCreateAreaCode());
        this.clickMethod(assignmentsPOM.getCreateTurkiyeAreaCode());
        this.clickMethod(assignmentsPOM.getCreatePhoneNumber());
        this.sendKeysMethod(assignmentsPOM.getCreatePhoneNumber(), "6555555555");
        this.clickMethod(assignmentsPOM.getCreateLocation());
        this.clickMethod(assignmentsPOM.getCreateMapSelect());
        this.clickMethod(assignmentsPOM.getCreateLocationMarkerIcon());
        this.clickMethod(assignmentsPOM.getOkButton());
    }

    @And("Enter invalid characters in the name field while filling out the assignment form")
    public void Enter_invalid_characters_in_the_name_field_while_filling_out_the_assignment_form() {
        this.sendKeysMethod(assignmentsPOM.getCreateName(), "?--/-**-8965");
        this.sendKeysMethod(assignmentsPOM.getCreateSurname(), "maraz");
        this.sendKeysMethod(assignmentsPOM.getCreateDescription(), "huıpvd");
        this.clickMethod(assignmentsPOM.getCreateAreaCode());
        this.clickMethod(assignmentsPOM.getCreateTurkiyeAreaCode());
        this.sendKeysMethod(assignmentsPOM.getCreatePhoneNumber(), "55555555");
    }

    @And("Enter invalid characters in the last name field while filling out the assignment form")
    public void Enter_invalid_characters_in_the_last_name_field_while_filling_out_the_assignment_form() {
        this.sendKeysMethod(assignmentsPOM.getCreateName(), "rıfkı");
        this.sendKeysMethod(assignmentsPOM.getCreateSurname(), "maraz");
        this.sendKeysMethod(assignmentsPOM.getCreateDescription(), "abcuqopg");
        this.clickMethod(assignmentsPOM.getCreateAreaCode());
        this.clickMethod(assignmentsPOM.getCreateTurkiyeAreaCode());
        this.sendKeysMethod(assignmentsPOM.getCreatePhoneNumber(), "888888888");
    }

    @And("Enter an invalid description while filling out the assignment form")
    public void Enter_an_invalid_description_while_filling_out_the_assignment_form() {
        this.sendKeysMethod(assignmentsPOM.getCreateName(), "rıfkı");
        this.sendKeysMethod(assignmentsPOM.getCreateSurname(), "maraz");
        this.sendKeysMethod(assignmentsPOM.getCreateDescription(), "?-/*-+?'!$[}");
        this.clickMethod(assignmentsPOM.getCreateAreaCode());
        this.clickMethod(assignmentsPOM.getCreateTurkiyeAreaCode());
        this.sendKeysMethod(assignmentsPOM.getCreatePhoneNumber(), "55555555");
    }

    @And("Enter an invalid phone number while filling out the assignment form")
    public void Enter_an_invalid_phone_number_while_filling_out_the_assignment_form() {
        this.sendKeysMethod(assignmentsPOM.getCreateName(), "rıfkı");
        this.sendKeysMethod(assignmentsPOM.getCreateSurname(), "maraz");
        this.sendKeysMethod(assignmentsPOM.getCreateDescription(), "acbdyagyqcbm");
        this.clickMethod(assignmentsPOM.getCreateAreaCode());
        this.clickMethod(assignmentsPOM.getCreateTurkiyeAreaCode());
        this.sendKeysMethod(assignmentsPOM.getCreatePhoneNumber(), "161616");
    }

    @And("Enter invalid coordinates while filling out the assignment form")
    public void Enter_invalid_coordinates_while_filling_out_the_assignment_form() {
        this.sendKeysMethod(assignmentsPOM.getCreateName(), "rıfkı");
        this.sendKeysMethod(assignmentsPOM.getCreateSurname(), "maraz");
        this.sendKeysMethod(assignmentsPOM.getCreateDescription(), "qwertty");
        this.clickMethod(assignmentsPOM.getCreateAreaCode());
        this.clickMethod(assignmentsPOM.getCreateTurkiyeAreaCode());
        this.sendKeysMethod(assignmentsPOM.getCreatePhoneNumber(), " ");
    }

    @Then("Click on the save button")
    public void Click_on_the_save_button() {
        this.clickMethod(assignmentsPOM.getSaveAssignment());
    }

}
