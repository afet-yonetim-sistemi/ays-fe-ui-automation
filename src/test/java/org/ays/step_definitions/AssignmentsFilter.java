package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.ays.pages.AssignmentsPOM;

public class AssignmentsFilter {
    AssignmentsPOM assignmentsPOM = new AssignmentsPOM();

    @And("Click on the filter icon")
    public void Click_on_the_filter_icon() {
        assignmentsPOM.moveToElement(assignmentsPOM.getFilter());
        assignmentsPOM.waitUntilClickable(assignmentsPOM.getFilter());
        assignmentsPOM.clickElementWithJavaScript(assignmentsPOM.getFilter());
    }

    @And("Select the available option from the status menu")
    public void Select_the_available_option_from_the_status_menu() {
        assignmentsPOM.clickMethod(assignmentsPOM.getFilterBasedOnStatus());
        assignmentsPOM.clickMethod(assignmentsPOM.getAvailableOption());
        assignmentsPOM.clickMethod(assignmentsPOM.getFilterBasedOnStatus());
    }

    @And("Filter by phone number")
    public void Filter_by_phone_number() {
        assignmentsPOM.waitUntilClickable(assignmentsPOM.getFilterBasedOnPhoneNumber());
        assignmentsPOM.clickElementWithJavaScript(assignmentsPOM.getFilterBasedOnPhoneNumber());
    }

    @Then("Click on the filter button")
    public void Click_on_the_filter_button() {
        assignmentsPOM.clickMethod(assignmentsPOM.getFilterButton());
    }

}
