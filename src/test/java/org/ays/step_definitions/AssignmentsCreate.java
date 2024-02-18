package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.pages.AssignmentsPOM;
import org.ays.utilities.MyMethods;

public class AssignmentsCreate extends MyMethods {

    AssignmentsPOM assignmentsPOM =new AssignmentsPOM();
    @When("Click on the assignments tab")
    public void Click_on_the_assignments_tab() {
        waitUntilClickable(assignmentsPOM.getAssignments());
        assignmentsPOM.clickMethod(assignmentsPOM.getAssignments());
    }
    @And("Click on the create button")
    public void Click_on_the_create_button() {
        assignmentsPOM.moveToElement(assignmentsPOM.getCreateButton());
        assignmentsPOM.clickElementWithJavaScript(assignmentsPOM.getCreateButton());
    }
    @And("Fill out the assignment form")
    public void Fill_out_the_assignment_form() {
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreateName(), "rıfkı");
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreateSurname(), "maraz");
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreateDescription(), "abcdfghh");
        assignmentsPOM.clickMethod(assignmentsPOM.getCreateAreaCode());
        assignmentsPOM.clickMethod(assignmentsPOM.getCreateTurkiyeAreaCode());
        assignmentsPOM.clickMethod(assignmentsPOM.getCreatePhoneNumber());
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreatePhoneNumber(), "6555555555");
        assignmentsPOM.clickMethod(assignmentsPOM.getCreateLocation());
        assignmentsPOM.clickMethod(assignmentsPOM.getCreateMapSelect());
        assignmentsPOM.clickMethod(assignmentsPOM.getCreateLocationMarkerIcon());
        assignmentsPOM.clickMethod(assignmentsPOM.getOkButton());
    }
    @And("Enter invalid characters in the name field while filling out the assignment form")
    public void Enter_invalid_characters_in_the_name_field_while_filling_out_the_assignment_form() {
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreateName(), "?--/-**-8965");
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreateSurname(), "maraz");
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreateDescription(), "huıpvd");
        assignmentsPOM.clickMethod(assignmentsPOM.getCreateAreaCode());
        assignmentsPOM.clickMethod(assignmentsPOM.getCreateTurkiyeAreaCode());
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreatePhoneNumber(), "55555555");
    }
    @And("Enter invalid characters in the last name field while filling out the assignment form")
    public void Enter_invalid_characters_in_the_last_name_field_while_filling_out_the_assignment_form() {
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreateName(), "rıfkı");
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreateSurname(), "maraz");
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreateDescription(), "abcuqopg");
        assignmentsPOM.clickMethod(assignmentsPOM.getCreateAreaCode());
        assignmentsPOM.clickMethod(assignmentsPOM.getCreateTurkiyeAreaCode());
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreatePhoneNumber(), "888888888");
    }
    @And("Enter an invalid description while filling out the assignment form")
    public void Enter_an_invalid_description_while_filling_out_the_assignment_form() {
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreateName(), "rıfkı");
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreateSurname(), "maraz");
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreateDescription(), "?-/*-+?'!$[}");
        assignmentsPOM.clickMethod(assignmentsPOM.getCreateAreaCode());
        assignmentsPOM.clickMethod(assignmentsPOM.getCreateTurkiyeAreaCode());
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreatePhoneNumber(), "55555555");
    }
    @And("Enter an invalid phone number while filling out the assignment form")
    public void Enter_an_invalid_phone_number_while_filling_out_the_assignment_form() {
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreateName(), "rıfkı");
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreateSurname(), "maraz");
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreateDescription(), "acbdyagyqcbm");
        assignmentsPOM.clickMethod(assignmentsPOM.getCreateAreaCode());
        assignmentsPOM.clickMethod(assignmentsPOM.getCreateTurkiyeAreaCode());
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreatePhoneNumber(), "161616");
    }
    @And("Enter invalid coordinates while filling out the assignment form")
    public void Enter_invalid_coordinates_while_filling_out_the_assignment_form() {
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreateName(), "rıfkı");
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreateSurname(), "maraz");
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreateDescription(), "qwertty");
        assignmentsPOM.clickMethod(assignmentsPOM.getCreateAreaCode());
        assignmentsPOM.clickMethod(assignmentsPOM.getCreateTurkiyeAreaCode());
        assignmentsPOM.sendKeysMethod(assignmentsPOM.getCreatePhoneNumber(), " ");
    }
    @Then("Click on the save button")
    public void Click_on_the_save_button() {
        assignmentsPOM.clickMethod(assignmentsPOM.getSaveAssignment());
    }
}
