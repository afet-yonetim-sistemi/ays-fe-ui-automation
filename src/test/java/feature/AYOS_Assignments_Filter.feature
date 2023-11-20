Feature: Testing Assignments

  Scenario: Atamalar için duruma göre filtreleme oluştur
    Given Log into the system
    When Click on the assignments tab
    And filtre simgesine tıkla
    And durum menüsünden available seçeneğini seç
    Then filtreleme butonuna tıkla

  Scenario: Atamalar için telefon numarasına göre filtreleme oluştur
    Given Log into the system
    When Click on the assignments tab
    And filtre simgesine tıkla
    And telefon numarasına göre filtrele.
    Then filtreleme butonuna tıkla
