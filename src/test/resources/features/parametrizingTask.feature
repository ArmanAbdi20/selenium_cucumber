Feature: Parametreli Task

  Background: Ortak adımlar
    Given Kullanıcı google sayfasına gider

    Scenario: Test01 saerch cucumber
      When Kullanıcı arama kısmına cucumber girdiğinde
      Then Sayfa başlığının cucumber olduğunu görür
      And sayfayı kapatır


      Scenario: Test02 saerch selenium
        When Kullanıcı arama kısmına selenium girdiğinde
        Then sayfa başlığının selenium olduğunu görür
        And sayfayı kapatır
