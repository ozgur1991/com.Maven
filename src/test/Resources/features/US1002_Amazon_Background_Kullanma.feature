Feature: US1002_Amazon Background Kullanma

  Background: amazon sayfasini acma
    Given kullanici amazon sayfasina gider


    Scenario: TC02 Amazonda iphone arama testi
      When kullanici iphone icin arama yapar
      Then sonuclarin iphone icerdigini test eder

      Scenario: TC03 Amazonda tea pot arama testi
        When kullanici tea pot icin arama yapar
        Then sonuclarin tea pot icerdigini test eder

        Scenario: TC04 Amazonda flower arama testi
          When kullanici flower icin arama yapar
          Then sonuclarin flower icerdigini test eder