package org.ays.utilities;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import static org.testng.Assert.assertEquals;

public class AysLocalizationUtil {

    /**
     * This utility class for managing localization in the application.
     * Provides methods to set the application's language and retrieve
     * localized text based on a given key. Text values are fetched from the
     * corresponding language-specific properties file within the
     * "ays_ui_elements" resource bundle.
     * <p>
     * <h3>Testing Guidelines:
     * <li>To check messages by language in tests, just call the validateMessage method.
     * <li>Use the getText method to retrieve the expected validation message
     * <li>Use the setLanguage method to changes the page language and determines the language of the "ays_ui_elements" file
     */

    private static ResourceBundle bundle;

    public static void setLanguage(String languageCode) {
        Locale locale =
                switch (languageCode.toLowerCase()) {
                    case "tr" -> new Locale("tr", "TR");
                    case "en" -> new Locale("en", "US");
                    default -> Locale.getDefault();
                };
        bundle = ResourceBundle.getBundle("ays_ui_elements", locale);
    }

    public static String getText(String key) {
        if (bundle == null) {
            throw new IllegalStateException("Language setting has not been applied. Please call the setLanguage() method first.");
        }
        return bundle.getString(key);
    }

    public void validateElementMessage(String key, String actualText, boolean isLocalStorageBased) {
        String currentLanguage = AysLocaleStorageUtil.getLanguageFromLocalStorage();

        if (isLocalStorageBased) {
            List<String> languages = List.of("tr", "en");

            for (String language : languages) {
                // TODO: Remove this if condition when the bug in AYS-505 is resolved
                if (language.equals(currentLanguage)) {
                    setLanguage(language);
                    assertEquals(actualText, getText(key));
                    break;
                }
            }

        } else {
            setLanguage(currentLanguage);
            assertEquals(actualText, getText(key));
        }
    }

}
