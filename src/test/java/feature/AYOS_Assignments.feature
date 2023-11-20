Feature: Testing Assignments

  Scenario: Create a New Assignment
    Given Log into the system
    When Click on the assignments tab
    And Click on the create button
    And Fill out the assignment form
    Then Click on the save button

  Scenario: Create an Assignment with an Invalid Name
    Given Log into the system
    When Click on the assignments tab
    And Click on the create button
    And Enter invalid characters in the name field while filling out the assignment form
    Then Click on the save button

  Scenario: Create an Assignment with an Invalid Last Name
    Given Log into the system
    When Click on the assignments tab
    And Click on the create button
    And Enter invalid characters in the last name field while filling out the assignment form
    Then Click on the save button

  Scenario: Create an Assignment with an Invalid Description
    Given Log into the system
    When Click on the assignments tab
    And Click on the create button
    And Enter an invalid description while filling out the assignment form
    Then Click on the save button

  Scenario: Create an Assignment with an Invalid Phone Number
    Given Log into the system
    When Click on the assignments tab
    And Click on the create button
    And Enter an invalid phone number while filling out the assignment form
    Then Click on the save button

  Scenario: Create an Assignment with Invalid Coordinates
    Given Log into the system
    When Click on the assignments tab
    And Click on the create button
    And Enter invalid coordinates while filling out the assignment form
    Then Click on the save button

  Scenario: Mevcut atamayı sil
    Given Log into the system
    When Click on the assignments tab
    And en üstteki atama için çöp kutusu butonuna tıkla
    And sil butonuna tıkla
    Then başarı mesajını doğrula

  Scenario: Mevcut atamanın konumunu görüntüle
    Given Log into the system
    When Click on the assignments tab
    And en üstteki atama için konum işareti butonuna tıkla
    Then gelen konumun görüntülendiğini doğrula


  Scenario: Mevcut atamanın konumunu google haritalarda aç
    Given Log into the system
    When Click on the assignments tab
    And en üstteki atama için konum işareti butonuna tıkla
    Then açılan pencerelerde google haritalarda aç


  Scenario: Mevcut atamanın konumunun detaylarını kopyala
    Given Log into the system
    When Click on the assignments tab
    And en üstteki atama için konum işareti butonuna tıkla
    Then gelen konumun detaylarını kopyala butonuna tıkla

  Scenario: Mevcut atamanın konumunu telefonda aç
    Given Log into the system
    When Click on the assignments tab
    And en üstteki atama için konum işareti butonuna tıkla
    Then gelen konumu telefonda aç butonuna tıkla

