Feature: Background Kullanımı

  Background: Tüm seneryolar için çalışacak stepler
    Given Kullanıcı https://www.google.com/ sayfasındadır

    Scenario: Google amazon search test

      When Kullanıcı arama kısmına "amazon" yazar
      And Kullanıcı aramayı gerçekleştirdiğinde
      Then Kullanıcı title de "amazon" u görmelidir



    Scenario:

      When Kullanıcı arama kısmına "linkedin" yazar
      And Kullanıcı aramayı gerçekleştirdiğinde
      Then Kullanıcı title de "linkedin" ı görür