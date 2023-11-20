Feature: Atamalar test edilmesi


  Scenario: Mevcut atamayı sil
    Given Log into the system
    When Click on the assignments tab
    And en üstteki atama için çöp kutusu butonuna tıkla
    And sil butonuna tıkla
    Then başarı mesajını doğrula