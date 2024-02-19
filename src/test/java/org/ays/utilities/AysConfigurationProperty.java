package org.ays.utilities;

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

    public static class Api {
        public static final String URL = PROPERTIES.getProperty("api.url");
    }

    public static class InstitutionOne {
        public static class AdminUserOne {
            public static final String USERNAME = PROPERTIES.getProperty("institution_one.admin_user_one.username");
            public static final String PASSWORD = PROPERTIES.getProperty("institution_one.admin_user_one.password");
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
