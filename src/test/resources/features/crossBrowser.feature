Feature: Cross Browser

  Scenario: Chrome Browser with Test
    Given Kullanıcı chrome browseri açmıştır
      And amazon com a gitmiştir
    When Kullanıcı arama kutusuna lego yazdığında
    Then Kullanıcı sonuçlar kısmında lego ifadesini görür.


  Scenario: Firefox Browser with Test
    Given Kullanıcı firefox browseri açmıştır
    And amazon com a gitmiştir
    When Kullanıcı arama kutusuna lego yazdığında
    Then Kullanıcı sonuçlar kısmında lego ifadesini görür.