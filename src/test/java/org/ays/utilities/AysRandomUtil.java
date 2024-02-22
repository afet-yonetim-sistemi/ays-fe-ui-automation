package org.ays.utilities;

import com.github.javafaker.Faker;
import lombok.experimental.UtilityClass;

@UtilityClass
public class AysRandomUtil {

    private static final Faker FAKER = new Faker();

    public static String generateFirstName() {
        return FAKER.name().firstName();
    }

    public static String generateLastName() {
        return FAKER.name().lastName();
    }

    public static String generatePhoneNumber() {
        StringBuilder phoneNumber = new StringBuilder();
        phoneNumber.append("505");
        for (int i = 0; i < 7; i++) {
            phoneNumber.append(FAKER.number().digit());
        }

        return phoneNumber.toString();
    }

}
