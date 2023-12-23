package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AYOS_Assignments_POM;
import pages.Login_POM;
import utilities.ConfigReader;
import utilities.DriverClass;
import utilities.MyMethods;

public class Assignments_Create  {

    AYOS_Assignments_POM ayo =new AYOS_Assignments_POM();
    Login_POM gir =new Login_POM();
    @Given("Log into the system")
    public void Log_into_the_system() {
        DriverClass.getDriver().get(ConfigReader.getPropertyValue("url"));
        DriverClass.getDriver().manage().window().maximize();
        gir.sendKeysMethod(gir.getLoginUsername(), ConfigReader.getPropertyValue("username"));
        gir.sendKeysMethod(gir.getLoginPassword(), ConfigReader.getPropertyValue("password"));
        gir.clickMethod(gir.getLoginButton());
      //  gir.waitUntilVisible(gir.getAdminsHeader());
      //  Assert.assertTrue(gir.getAdminsHeader().isDisplayed());
    }

    @When("Click on the assignments tab")
    public void Click_on_the_assignments_tab() {
    //    ayo.clickMethod(ayo.getDilSecenegi());
    //    ayo.clickMethod(ayo.getTurkceDilSecenegi());
        ayo.clickMethod(ayo.getAssignments());
    }

    @And("Click on the create button")
    public void Click_on_the_create_button() {

        ayo.clickMethod(ayo.getCreateButton());
    }

    @And("Fill out the assignment form")
    public void Fill_out_the_assignment_form() {
        ayo.sendKeysMethod(ayo.getCreateName(), "rıfkı");
        ayo.sendKeysMethod(ayo.getCreateSurname(), "maraz");
        ayo.sendKeysMethod(ayo.getCreateDescription(), "abcdfghh");
        ayo.waitUntilClickable(ayo.getCreateAreaCode());
        ayo.clickMethod(ayo.getCreateAreaCode());
        ayo.clickMethod(ayo.getCreateTurkiyeAreaCode());
        ayo.sendKeysMethod(ayo.getCreatePhoneNumber(), "5448745263");

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
