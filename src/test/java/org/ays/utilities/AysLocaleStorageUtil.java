package org.ays.utilities;

import org.ays.browser.AysPageActions;
import org.openqa.selenium.JavascriptExecutor;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;


public class AysLocaleStorageUtil {

    private static AysPageActions pageActions;

    public AysLocaleStorageUtil() {
        pageActions = new AysPageActions();
    }

    public void assertTokensStoredInLocalStorage() {
        try {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) pageActions.getWebDriver();
            String rootData = (String) javascriptExecutor.executeScript("return localStorage.getItem('persist:root');");

            if (rootData == null) {
                throw new Exception("rootData is null. 'persist:root' data not found in localStorage.");
            }

            assertTrue(rootData.contains("accessToken"), "'accessToken' not found in localStorage.");
            assertTrue(rootData.contains("refreshToken"), "'refreshToken' not found in localStorage.");

        } catch (Exception exception) {
            fail("An error occurred while checking tokens in localStorage: " + exception.getMessage());
            exception.printStackTrace();
        }

    }

    public void toggleLanguageInLocalStorage(String language) {
        try {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) pageActions.getWebDriver();
            javascriptExecutor.executeScript("localStorage.setItem('language', arguments[0]);", language);

            pageActions.getWebDriver().navigate().refresh();
            pageActions.waitFor(2);

        } catch (Exception exception) {
            fail("An error occurred while toggling language in localStorage: " + exception.getMessage());
            exception.printStackTrace();
        }

    }

    public static String getLanguageFromLocalStorage() {
        try {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) pageActions.getWebDriver();
            Object language = javascriptExecutor.executeScript("return localStorage.getItem('language');");

            pageActions.waitFor(2);

            if (language == null) {
                return "en";
            }

            String languageCode = language.toString().toLowerCase();
            if ("tr".equals(languageCode) || "en".equals(languageCode)) {
                return languageCode;
            }

        } catch (Exception exception) {
            fail("An error occurred while retrieving the language from localStorage: " + exception.getMessage());
            exception.printStackTrace();
        }
        return "en";
    }

    public void mockTokenExpiration(String token) {
        try {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) pageActions.getWebDriver();
            javascriptExecutor.executeScript("let persistData = JSON.parse(localStorage.getItem('persist:root')); " +
                    "if (persistData) { " +
                    "   let authData = JSON.parse(persistData.auth); " +
                    "  if ('refreshToken' === '" + token + "') { " +
                    "       authData.accessToken ='';" +
                    "       authData.refreshToken = '';" +
                    "   } " +
                    "   persistData.auth = JSON.stringify(authData); " +
                    "   localStorage.setItem('persist:root', JSON.stringify(persistData));" +
                    "} else { " +
                    "   throw 'persist:root not found'; " +
                    "}");

            pageActions.getWebDriver().navigate().refresh();
        } catch (Exception exception) {
            fail("An error occurred while mocking token expiration: " + exception.getMessage());
            exception.printStackTrace();
        }
    }

}
