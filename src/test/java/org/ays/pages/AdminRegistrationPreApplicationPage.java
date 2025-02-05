package org.ays.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class AdminRegistrationPreApplicationPage extends BasePage {

    @FindBy(xpath = "//button[.//span[text()='Select Institution']]")
    private WebElement selectInstitution;

    @FindBy(xpath = "//div[@role='listbox']//div[@role='option']")
    private List<WebElement> institutionOptions;

    @FindBy(xpath = "//textarea[@name='reason']")
    private WebElement reason;

    @FindBy(xpath = "//button[text()='Create']")
    private WebElement create;

    @FindBy(css = "li[role='status'].success.group")
    private WebElement successMessage;

    @FindBy(xpath = "//div[contains(@class, 'col-span-2')]//p[contains(@class, 'text-destructive')]")
    private WebElement errorMessageForReason;

    @FindBy(xpath = "//div[contains(@class, 'col-span-1')]//p[contains(@class, 'text-destructive')]")
    private WebElement errorMessageForInstitution;
}
