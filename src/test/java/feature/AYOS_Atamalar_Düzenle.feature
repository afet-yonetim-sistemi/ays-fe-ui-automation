Feature: Atamalar test edilmesi

  Scenario: Atama formunu düzenle
    Given sisteme giriş yap
    When atamalar sekmesine tıkla
    And düzenleme butonu olan kalem simgesine tıkla
    And atama formunudaki her inputu düzenle
    Then düzenleme kaydet butonuna tıkla
