Feature: Atamalar test edilmesi

  Scenario: Atama bilgilerini göster
    Given Log into the system
    When atamalar sekmesine tıkla
    And göster butonu olan göz simgesine tıkla
    Then atama bilgilerinin geldiğini doğrula
