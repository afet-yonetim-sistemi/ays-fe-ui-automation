package org.ays.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class AdminRegistrationApplicationDetailPage extends BasePage{

    @FindBy(css = "h1.text-2xl.font-bold")
    private WebElement header;

    @FindBy(css = "input[name='reason']")
    private WebElement reasonValue;
}
