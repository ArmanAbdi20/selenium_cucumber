@login
Feature: First Feature Test
   @smoke
  Scenario: First Feature Test01
    Given Elimizde 5 sayısı mevcut
    And Elimizde 3 sayısı mevcut
    When Bu sayılar toplandığında
    Then Toplamın 8 olduğu görülmelidir

  @regression
  Scenario: First Feature Test02
    Given Elimizde 5 sayısı mevcut
    And Elimizde 3 sayısı mevcut
    When Bu sayılar toplandığında
    Then Toplamın 8 olduğu görülmelidir

