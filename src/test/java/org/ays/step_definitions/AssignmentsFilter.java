package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.ays.browser.AysPageActions;
import org.ays.pages.AssignmentsPOM;

public class AssignmentsFilter {

    private final AssignmentsPOM assignmentsPOM = new AssignmentsPOM();
    private final AysPageActions pageActions = new AysPageActions();

    @And("Click on the filter icon")
    public void Click_on_the_filter_icon() {
        pageActions.moveToElement(assignmentsPOM.getFilter());
        pageActions.waitUntilClickable(assignmentsPOM.getFilter());
        pageActions.clickElementWithJavaScript(assignmentsPOM.getFilter());
    }

    @And("Select the available option from the status menu")
    public void Select_the_available_option_from_the_status_menu() {
        pageActions.clickMethod(assignmentsPOM.getFilterBasedOnStatus());
        pageActions.clickMethod(assignmentsPOM.getAvailableOption());
        pageActions.clickMethod(assignmentsPOM.getFilterBasedOnStatus());
    }

    @And("Filter by phone number")
    public void Filter_by_phone_number() {
        pageActions.waitUntilClickable(assignmentsPOM.getFilterBasedOnPhoneNumber());
        pageActions.clickElementWithJavaScript(assignmentsPOM.getFilterBasedOnPhoneNumber());
    }

    @Then("Click on the filter button")
    public void Click_on_the_filter_button() {
        pageActions.clickMethod(assignmentsPOM.getFilterButton());
    }

}
