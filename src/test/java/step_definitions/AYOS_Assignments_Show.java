package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.AYOS_Assignments_POM;

public class AYOS_Assignments_Show {
    AYOS_Assignments_POM ayo =new AYOS_Assignments_POM();
    @And("Click on the eye icon with the show button")
    public void Click_on_the_eye_icon_with_the_show_button() {
        ayo.clickMethod(ayo.getShow());

    }

    @Then("Validate that the assignment information has appeared")
    public void Validate_that_the_assignment_information_has_appeared() {
        ayo.waitUntilVisible(ayo.getValidateShow());
        Assert.assertTrue(ayo.getValidateShow().isDisplayed());
    }
}
