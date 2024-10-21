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

    public static class TestVolunteerFoundation {

        public static class SuperAdmin {
            public static final String EMAIL_ADDRESS = PROPERTIES.getProperty("test_volunteer_foundation.super_admin.email_address");
            public static final String PASSWORD = PROPERTIES.getProperty("test_volunteer_foundation.super_admin.password");

        }

        public static class Admin {
            public static final String EMAIL_ADDRESS = PROPERTIES.getProperty("test_volunteer_foundation.admin.email_address");
            public static final String PASSWORD = PROPERTIES.getProperty("test_volunteer_foundation.admin.password");

        }

        public static class User {
            public static final String EMAIL_ADDRESS = PROPERTIES.getProperty("test_volunteer_foundation.user.email_address");
            public static final String PASSWORD = PROPERTIES.getProperty("test_volunteer_foundation.user.password");

        }

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
