package org.ays.utilities;

import java.util.Locale;
import java.util.ResourceBundle;

public class AysLocalizationUtil {

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
}
