package org.ays.utilities;

import org.ays.browser.AysPageActions;
import org.openqa.selenium.JavascriptExecutor;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;


public class AysLocaleStorageUtil {

    private final AysPageActions pageActions;

    public AysLocaleStorageUtil() {
        this.pageActions = new AysPageActions();
    }

    public void assertTokensStoredInLocalStorage() {
        JavascriptExecutor js = (JavascriptExecutor) pageActions.getWebDriver();

        try {
            String rootData = (String) js.executeScript("return localStorage.getItem('persist:root');");

            if (rootData != null) {
                assertTrue(rootData.contains("accessToken"), "'accessToken' not found in localStorage.");
                assertTrue(rootData.contains("refreshToken"), "'refreshToken' not found in localStorage.");
            } else {
                throw new Exception("rootData is null. 'persist:root' data not found in localStorage.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            fail("An error occurred while checking tokens in localStorage: " + e.getMessage());
        }
    }

    public void toggleLanguageInLocalStorage(String language) {
        JavascriptExecutor js = (JavascriptExecutor) pageActions.getWebDriver();
        try {
            js.executeScript("localStorage.setItem('language', arguments[0]);", language);

            pageActions.getWebDriver().navigate().refresh();
            pageActions.waitFor(2);

        } catch (Exception e) {
            e.printStackTrace();
            fail("An error occurred while toggling language in localStorage: " + e.getMessage());
        }

    }
}
