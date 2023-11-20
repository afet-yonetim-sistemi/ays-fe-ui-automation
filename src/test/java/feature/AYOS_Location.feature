Feature: Atamalar test edilmesi

  Scenario: Mevcut atamanın konumunu görüntüle
    Given Log into the system
    When atamalar sekmesine tıkla
    And en üstteki atama için konum işareti butonuna tıkla
    Then gelen konumun görüntülendiğini doğrula


  Scenario: Mevcut atamanın konumunu google haritalarda aç
    Given Log into the system
    When atamalar sekmesine tıkla
    And en üstteki atama için konum işareti butonuna tıkla
    Then açılan pencerelerde google haritalarda aç


  Scenario: Mevcut atamanın konumunun detaylarını kopyala
    Given Log into the system
    When atamalar sekmesine tıkla
    And en üstteki atama için konum işareti butonuna tıkla
    Then gelen konumun detaylarını kopyala butonuna tıkla

  Scenario: Mevcut atamanın konumunu telefonda aç
    Given Log into the system
    When atamalar sekmesine tıkla
    And en üstteki atama için konum işareti butonuna tıkla
    Then gelen konumu telefonda aç butonuna tıkla