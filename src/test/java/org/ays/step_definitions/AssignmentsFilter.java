package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.ays.pages.AssignmentsPOM;
import org.ays.utilities.PageActions;

public class AssignmentsFilter extends PageActions {
    AssignmentsPOM assignmentsPOM = new AssignmentsPOM();

    @And("Click on the filter icon")
    public void Click_on_the_filter_icon() {
        this.moveToElement(assignmentsPOM.getFilter());
        this.waitUntilClickable(assignmentsPOM.getFilter());
        this.clickElementWithJavaScript(assignmentsPOM.getFilter());
    }

    @And("Select the available option from the status menu")
    public void Select_the_available_option_from_the_status_menu() {
        this.clickMethod(assignmentsPOM.getFilterBasedOnStatus());
        this.clickMethod(assignmentsPOM.getAvailableOption());
        this.clickMethod(assignmentsPOM.getFilterBasedOnStatus());
    }

    @And("Filter by phone number")
    public void Filter_by_phone_number() {
        this.waitUntilClickable(assignmentsPOM.getFilterBasedOnPhoneNumber());
        this.clickElementWithJavaScript(assignmentsPOM.getFilterBasedOnPhoneNumber());
    }

    @Then("Click on the filter button")
    public void Click_on_the_filter_button() {
        this.clickMethod(assignmentsPOM.getFilterButton());
    }

}
