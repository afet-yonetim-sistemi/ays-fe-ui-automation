Feature: Giriş Fonksiyonu
  @Login
  Scenario: Geçerli bir kullanıcı adı ve şifre ile giriş yapılmalıdır
    Given Ayos sistemine eriş
    When kullanıcı adı ve şifreyi gir
    And Giriş butonuna tıkla
    Then Kullanıcı başarıyla giriş yapabilmelidir