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

    public static class SuperAdminUserOne {
        public static final String EMAIL_ADDRESS = PROPERTIES.getProperty("institution.super_admin_user_one.email_address");
        public static final String PASSWORD = PROPERTIES.getProperty("institution.super_admin_user_one.password");
    }

    public static class InstitutionOne {
        public static class AdminUserOne {
            public static final String EMAIL_ADDRESS = PROPERTIES.getProperty("institution_one.admin_user_one.email_address");
            public static final String PASSWORD = PROPERTIES.getProperty("institution_one.admin_user_one.password");
        }

        public static class AdminUserTwo {
            public static final String EMAIL_ADDRESS = PROPERTIES.getProperty("institution_one.admin_user_two.email_address");
            public static final String PASSWORD = PROPERTIES.getProperty("institution_one.admin_user_two.password");
        }

        public static class TestAdmin {
            public static final String EMAIL_ADDRESS = PROPERTIES.getProperty("institution.test_admin.email_address");
            public static final String PASSWORD = PROPERTIES.getProperty("institution.test_admin.password");
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
