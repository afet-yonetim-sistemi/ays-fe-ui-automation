package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AYOSAssignmentsPOM;

public class AssignmentsCreate {

    AYOSAssignmentsPOM ayo =new AYOSAssignmentsPOM();
    @When("Click on the assignments tab")
    public void Click_on_the_assignments_tab() {
        ayo.clickMethod(ayo.getAssignments());
    }
    @And("Click on the create button")
    public void Click_on_the_create_button() {
        ayo.moveToElement(ayo.getCreateButton());
        ayo.clickElementWithJavaScript(ayo.getCreateButton());
    }
    @And("Fill out the assignment form")
    public void Fill_out_the_assignment_form() {
        ayo.sendKeysMethod(ayo.getCreateName(), "rıfkı");
        ayo.sendKeysMethod(ayo.getCreateSurname(), "maraz");
        ayo.sendKeysMethod(ayo.getCreateDescription(), "abcdfghh");
        ayo.clickMethod(ayo.getCreateAreaCode());
        ayo.clickMethod(ayo.getCreateTurkiyeAreaCode());
        ayo.clickMethod(ayo.getCreatePhoneNumber());
        ayo.sendKeysMethod(ayo.getCreatePhoneNumber(), "6555555555");
        ayo.clickMethod(ayo.getCreateLocation());
        ayo.clickMethod(ayo.getCreateMapSelect());
        ayo.clickMethod(ayo.getCreateLocationMarkerIcon());
        ayo.clickMethod(ayo.getOkButton());
    }
    @And("Enter invalid characters in the name field while filling out the assignment form")
    public void Enter_invalid_characters_in_the_name_field_while_filling_out_the_assignment_form() {
        ayo.sendKeysMethod(ayo.getCreateName(), "?--/-**-8965");
        ayo.sendKeysMethod(ayo.getCreateSurname(), "maraz");
        ayo.sendKeysMethod(ayo.getCreateDescription(), "huıpvd");
        ayo.clickMethod(ayo.getCreateAreaCode());
        ayo.clickMethod(ayo.getCreateTurkiyeAreaCode());
        ayo.sendKeysMethod(ayo.getCreatePhoneNumber(), "55555555");
    }
    @And("Enter invalid characters in the last name field while filling out the assignment form")
    public void Enter_invalid_characters_in_the_last_name_field_while_filling_out_the_assignment_form() {
        ayo.sendKeysMethod(ayo.getCreateName(), "rıfkı");
        ayo.sendKeysMethod(ayo.getCreateSurname(), "maraz");
        ayo.sendKeysMethod(ayo.getCreateDescription(), "abcuqopg");
        ayo.clickMethod(ayo.getCreateAreaCode());
        ayo.clickMethod(ayo.getCreateTurkiyeAreaCode());
        ayo.sendKeysMethod(ayo.getCreatePhoneNumber(), "888888888");
    }
    @And("Enter an invalid description while filling out the assignment form")
    public void Enter_an_invalid_description_while_filling_out_the_assignment_form() {
        ayo.sendKeysMethod(ayo.getCreateName(), "rıfkı");
        ayo.sendKeysMethod(ayo.getCreateSurname(), "maraz");
        ayo.sendKeysMethod(ayo.getCreateDescription(), "?-/*-+?'!$[}");
        ayo.clickMethod(ayo.getCreateAreaCode());
        ayo.clickMethod(ayo.getCreateTurkiyeAreaCode());
        ayo.sendKeysMethod(ayo.getCreatePhoneNumber(), "55555555");
    }
    @And("Enter an invalid phone number while filling out the assignment form")
    public void Enter_an_invalid_phone_number_while_filling_out_the_assignment_form() {
        ayo.sendKeysMethod(ayo.getCreateName(), "rıfkı");
        ayo.sendKeysMethod(ayo.getCreateSurname(), "maraz");
        ayo.sendKeysMethod(ayo.getCreateDescription(), "acbdyagyqcbm");
        ayo.clickMethod(ayo.getCreateAreaCode());
        ayo.clickMethod(ayo.getCreateTurkiyeAreaCode());
        ayo.sendKeysMethod(ayo.getCreatePhoneNumber(), "161616");
    }
    @And("Enter invalid coordinates while filling out the assignment form")
    public void Enter_invalid_coordinates_while_filling_out_the_assignment_form() {
        ayo.sendKeysMethod(ayo.getCreateName(), "rıfkı");
        ayo.sendKeysMethod(ayo.getCreateSurname(), "maraz");
        ayo.sendKeysMethod(ayo.getCreateDescription(), "qwertty");
        ayo.clickMethod(ayo.getCreateAreaCode());
        ayo.clickMethod(ayo.getCreateTurkiyeAreaCode());
        ayo.sendKeysMethod(ayo.getCreatePhoneNumber(), " ");
    }
    @Then("Click on the save button")
    public void Click_on_the_save_button() {
        ayo.clickMethod(ayo.getSaveAssignment());
    }
}
