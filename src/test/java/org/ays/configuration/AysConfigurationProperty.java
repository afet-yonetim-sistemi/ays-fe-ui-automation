package org.ays.configuration;

import lombok.experimental.UtilityClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serial;
import java.util.Properties;

@UtilityClass
public class AysConfigurationProperty {

    private static final Properties PROPERTIES = new Properties();

    static {
        try (FileInputStream input = new FileInputStream("configuration.properties")) {

            PROPERTIES.load(input);

            if (PROPERTIES.isEmpty()) {
                throw new AysConfigurationException("Configuration properties are empty!");
            }

        } catch (IOException exception) {
            throw new AysConfigurationException(exception);
        }
    }

    public static class Ui {
        public static final String URL = PROPERTIES.getProperty("ui.url");
    }

    public static class AfetYonetimSistemiAdmin {
        public static final String EMAIL_ADDRESS = PROPERTIES.getProperty("afet_yonetim_sistemi.admin.email_address");
        public static final String PASSWORD = PROPERTIES.getProperty("afet_yonetim_sistemi.admin.password");
    }

    public static class VolunteerFoundationAdmin {
        public static final String EMAIL_ADDRESS = PROPERTIES.getProperty("volunteer_foundation.admin.email_address");
        public static final String PASSWORD = PROPERTIES.getProperty("volunteer_foundation.admin.password");
    }

    public static class DisasterFoundationAdmin {
        public static final String EMAIL_ADDRESS = PROPERTIES.getProperty("disaster_foundation.admin.email_address");
        public static final String PASSWORD = PROPERTIES.getProperty("disaster_foundation.admin.password");
    }

    public static class TestFoundationAdmin {
        public static final String EMAIL_ADDRESS = PROPERTIES.getProperty("test_foundation.admin.email_address");
        public static final String PASSWORD = PROPERTIES.getProperty("test_foundation.admin.password");
    }


    private static class AysConfigurationException extends RuntimeException {

        @Serial
        private static final long serialVersionUID = -3108411992530107699L;

        public AysConfigurationException(String message) {
            super(message);
        }

        public AysConfigurationException(Throwable cause) {
            super(cause);
        }

    }

}
