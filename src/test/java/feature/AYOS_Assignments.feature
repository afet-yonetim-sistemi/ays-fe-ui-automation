Feature: Atamalar test edilmesi

  Scenario: Yeni atama oluştur
    Given Log into the system
    When atamalar sekmesine tıkla
    And oluştur butonuna tıkla
    And atama formunu doldur
    Then kaydet butonuna tıkla

  Scenario: Geçersiz bir ad ile atama oluştur
    Given Log into the system
    When atamalar sekmesine tıkla
    And oluştur butonuna tıkla
    And atama formunu doldururken ad kısmında geçersiz karakterler kullan
    Then kaydet butonuna tıkla

  Scenario: Geçersiz bir soyad ile atama oluştur
    Given Log into the system
    When atamalar sekmesine tıkla
    And oluştur butonuna tıkla
    And atama formunu doldururken soyad kısmında geçersiz karakterler kullan
    Then kaydet butonuna tıkla

  Scenario: Geçersiz bir açıklama ile atama oluştur
    Given Log into the system
    When atamalar sekmesine tıkla
    And oluştur butonuna tıkla
    And atama formunu doldururken geçersiz bir açıklama yaz
    Then kaydet butonuna tıkla

  Scenario: Geçersiz bir telefon numarası ile atama oluştur
    Given Log into the system
    When atamalar sekmesine tıkla
    And oluştur butonuna tıkla
    And atama formunu doldururken geçersiz bir telefon numarası yaz
    Then kaydet butonuna tıkla

  Scenario: Geçersiz koordinaatlar ile atama oluştur
    Given Log into the system
    When atamalar sekmesine tıkla
    And oluştur butonuna tıkla
    And atama formunu doldururken geçersiz koordinatlar gir
    Then kaydet butonuna tıkla

  Scenario: Mevcut atamayı sil
    Given Log into the system
    When atamalar sekmesine tıkla
    And en üstteki atama için çöp kutusu butonuna tıkla
    And sil butonuna tıkla
    Then başarı mesajını doğrula

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

