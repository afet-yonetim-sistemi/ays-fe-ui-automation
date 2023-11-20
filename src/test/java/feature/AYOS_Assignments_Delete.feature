Feature: Atamalar test edilmesi


  Scenario: Mevcut atamayı sil
    Given Log into the system
    When atamalar sekmesine tıkla
    And en üstteki atama için çöp kutusu butonuna tıkla
    And sil butonuna tıkla
    Then başarı mesajını doğrula