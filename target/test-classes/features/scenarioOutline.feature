Feature: Scenario Outline Usage

  #scenario out line da paramerteli stepler kullanılır
  #parametre kısımları hardcode olmadan Examples tablosunda belirtilen başlıklarla gönderilir

  Scenario Outline:
    Given Sayi1 <sayi1>
    And Sayi2 <sayi2>
    When sayilar toplandiginda
    Then sonuc <sonuc> olmalidir

    Examples:
    |sayi1|sayi2|sonuc|
    | 5   |3    |8    |
    |2    |4    |6    |
    |1    |1    |2    |
    |7    |8    |15   |

