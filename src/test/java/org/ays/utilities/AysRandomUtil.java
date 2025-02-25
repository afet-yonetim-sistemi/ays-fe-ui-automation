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

    public static String generateReason() {
        String reason = FAKER.lorem().paragraph(3);
        reason = reason.replaceAll("[^a-zA-Z0-9\\s]", "");
        return reason.length() > 512 ? reason.substring(0, 512) : reason;
    }

    public static String generateReason(int length) {
        return FAKER.lorem().characters(length, true, true);
    }


}
