Feature: Atamalar test edilmesi

  Scenario: Atama bilgilerini göster
    Given sisteme giriş yap
    When atamalar sekmesine tıkla
    And göster butonu olan göz simgesine tıkla
    Then atama bilgilerinin geldiğini doğrula
