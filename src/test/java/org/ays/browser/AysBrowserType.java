package org.ays.browser;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AysBrowserType {

    CHROME,
    FIREFOX,
    EDGE,
    SAFARI;

    public static AysBrowserType getDefaultBrowser() {
        return CHROME;
    }

}
