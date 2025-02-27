package org.ays.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class AdminRegistrationPreApplicationPage extends BasePage {

    @FindBy(css ="h1.text-2xl.font-medium.mb-5")
    private WebElement preApplicationPageHeader;

    @FindBy(css = "div.space-y-2.col-span-1 label.text-sm.font-medium.leading-none")
    private WebElement institutionText;

    @FindBy(css = "div.space-y-2.col-span-2 label.text-sm.font-medium.leading-none")
    private WebElement creationReasonText;

    @FindBy(css = "div.space-y-2.col-span-1 button")
    private WebElement selectInstitutionText;

    @FindBy(xpath = "//button[.//span[text()='Select Institution']]")
    private WebElement selectInstitution;

    @FindBy(xpath = "//div[@role='listbox']//div[@role='option']")
    private List<WebElement> institutionOptions;

    @FindBy(xpath = "//textarea[@name='reason']")
    private WebElement reason;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement createButton;

    @FindBy(css = "li[role='status'].success.group")
    private WebElement successMessage;

    @FindBy(xpath = "//div[contains(@class, 'col-span-2')]//p[contains(@class, 'text-destructive')]")
    private WebElement errorMessageForReason;

    @FindBy(xpath = "//div[contains(@class, 'col-span-1')]//p[contains(@class, 'text-destructive')]")
    private WebElement errorMessageForInstitution;

}
