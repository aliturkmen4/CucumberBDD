Feature: Cucumber

  Scenario: Udemy sitesine git ve arama yap
    Given Udemy web sitesine git
    When Arama kutusuna tıkla
    When Yazilim yaz ve ara
    Then Yazılım kurslarının geldiğini kontrol et