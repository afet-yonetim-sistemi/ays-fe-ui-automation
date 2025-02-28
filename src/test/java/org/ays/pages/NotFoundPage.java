package org.ays.pages;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Setter
public class NotFoundPage extends BasePage {

    @FindBy(css = "h1.mt-5")
    private WebElement notFoundText;

}
