package org.ays.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Getter
@RequiredArgsConstructor
public enum AysLanguage {

    TR(new Locale("tr", "TR")),
    EN(new Locale("en", "US"));

    private final Locale locale;

    public static List<AysLanguage> getLanguages() {
        return List.of(AysLanguage.values());
    }

    public static AysLanguage valueOfCode(final Object languageCode) {
        return Optional.ofNullable(languageCode)
                .map(Object::toString)
                .map(String::toUpperCase)
                .map(AysLanguage::valueOf)
                .orElse(EN);
    }

}
