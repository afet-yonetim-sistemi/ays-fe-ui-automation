package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.AYOSUsersPOM;

public class UsersEdit {
    AYOSUsersPOM usersPOM = new AYOSUsersPOM();

    @And("Click on the pencil icon")
    public void clickOnThePencilIcon() {
        usersPOM.moveToElement(usersPOM.getUsersEditIcon());
        usersPOM.clickElementWithJavaScript(usersPOM.getUsersEditIcon());

    }
    @When("Edit the status section in the user form")
    public void editTheStatusSectionInTheUserForm() {
        usersPOM.waitUntilVisible(usersPOM.getStatusDropdown());
        usersPOM.clickMethod(usersPOM.getStatusDropdown());
        usersPOM.waitUntilVisible(usersPOM.getPassiveOption());
        usersPOM.clickMethod(usersPOM.getPassiveOption());


    }
}
