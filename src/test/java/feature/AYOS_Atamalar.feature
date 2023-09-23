Feature: Atamalar test edilmesi

  Scenario: Yeni atama oluştur
    Given sisteme giriş yap
    When atamalar sekmesine tıkla
    And oluştur butonuna tıkla
    And atama formunu doldur
    Then kaydet butonuna tıkla

  Scenario: Geçersiz bir ad ile atama oluştur
    Given sisteme giriş yap
    When atamalar sekmesine tıkla
    And oluştur butonuna tıkla
    And atama formunu doldur
    Then kaydet butonuna tıkla

  Scenario: Geçersiz bir soyad ile atama oluştur
    Given sisteme giriş yap
    When atamalar sekmesine tıkla
    And oluştur butonuna tıkla
    And atama formunu doldur
    Then kaydet butonuna tıkla

  Scenario: Geçersiz bir açıklama ile atama oluştur
    Given sisteme giriş yap
    When atamalar sekmesine tıkla
    And oluştur butonuna tıkla
    And atama formunu doldur
    Then kaydet butonuna tıkla

  Scenario: Geçersiz bir telefon numarası ile atama oluştur
    Given sisteme giriş yap
    When atamalar sekmesine tıkla
    And oluştur butonuna tıkla
    And atama formunu doldur
    Then kaydet butonuna tıkla

  Scenario: Geçersiz koordinaatlar ile atama oluştur
    Given sisteme giriş yap
    When atamalar sekmesine tıkla
    And oluştur butonuna tıkla
    And atama formunu doldur
    Then kaydet butonuna tıkla

  Scenario: Mevcut atamayı sil
    Given sisteme giriş yap
    When atamalar sekmesine tıkla
    And oluştur butonuna tıkla
    And atama formunu doldur
    Then kaydet butonuna tıkla