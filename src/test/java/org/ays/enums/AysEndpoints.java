package org.ays.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AysEndpoints {

    ADMIN_REGISTRATION_PRE_APPLICATION_CREATION("/admin-registration-applications/pre-application");

    private final String url;

}
