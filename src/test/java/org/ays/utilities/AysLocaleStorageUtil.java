package org.ays.utilities;

import org.ays.browser.AysPageActions;
import org.ays.enums.AysLanguage;
import org.openqa.selenium.JavascriptExecutor;

import static org.ays.enums.AysLanguage.EN;
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

    public void assertTokensNotInLocalStorage() {
        try {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) pageActions.getWebDriver();
            String rootData = (String) javascriptExecutor.executeScript("return localStorage.getItem('persist:root');");

            if (rootData == null) {
                throw new Exception("rootData is null. 'persist:root' data not found in localStorage.");
            }

            assertTrue(rootData.contains("accessToken"), "'accessToken' key is not present in localStorage.");
            assertTrue(rootData.contains("refreshToken"), "'refreshToken' key is not present in localStorage.");

            String accessToken = (String) javascriptExecutor.executeScript(
                    "return JSON.parse(localStorage.getItem('persist:root')).auth.accessToken;"
            );
            String refreshToken = (String) javascriptExecutor.executeScript(
                    "return JSON.parse(localStorage.getItem('persist:root')).auth.refreshToken;"
            );

            if (accessToken != null && !accessToken.isEmpty()) {
                fail("'accessToken' should be null or empty, but found: " + accessToken);
            }

            if (refreshToken != null && !refreshToken.isEmpty()) {
                fail("'refreshToken' should be null or empty, but found: " + refreshToken);
            }

        } catch (Exception exception) {
            fail("An error occurred while checking token removal in localStorage: " + exception.getMessage());
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

    public static AysLanguage getLanguageFromLocalStorage() {
        try {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) pageActions.getWebDriver();
            AysLanguage language = AysLanguage.valueOfCode(
                    javascriptExecutor.executeScript("return localStorage.getItem('language');")
            );

            pageActions.waitFor(2);

            return language;
        } catch (Exception exception) {
            fail("An error occurred while retrieving the language from localStorage: " + exception.getMessage());
            exception.printStackTrace();
        }
        return EN;
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
