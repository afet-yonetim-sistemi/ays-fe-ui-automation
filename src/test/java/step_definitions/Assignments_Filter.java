package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AYOS_Assignments_POM;

public class Assignments_Filter {

    AYOS_Assignments_POM ayo = new AYOS_Assignments_POM();

    @And("Click on the filter icon")
    public void Click_on_the_filter_icon() {
        ayo.moveToElement(ayo.getFilter());
        ayo.clickElementWithJavaScript(ayo.getFilter());
    }

    @And("Select the available option from the status menu")
    public void Select_the_available_option_from_the_status_menu() {
        ayo.clickMethod(ayo.getFilterBasedOnStatus());
        ayo.clickMethod(ayo.getAvailableOption());
        ayo.clickMethod(ayo.getFilterBasedOnStatus());

    }

    @And("Filter by phone number")
    public void Filter_by_phone_number() {
        ayo.waitUntilClickable(ayo.getFilterBasedOnPhoneNumber());
        ayo.clickElementWithJavaScript(ayo.getFilterBasedOnPhoneNumber());

    }

    @Then("Click on the filter button")
    public void Click_on_the_filter_button() {
        ayo.clickMethod(ayo.getFilterButton());
    }

}
