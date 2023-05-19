Feature: Hepsiburada sepete ürün ekleme


  Scenario: Hepsiburada sepete ürün ekleme testi
    Given Kullanıcı hepsiburada ana sayfasındadır
    When Arama kısmına "airfry" yazdığında
    And Sonuçlar içinden ilk çıkan ürünü sepete ekler
    Then Sepete gittiğinde Kargo bedava yazısını görür

