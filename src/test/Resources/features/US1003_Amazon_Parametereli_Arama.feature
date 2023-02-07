Feature: US1003 Amazon Parametreli Arama

  Background: amazon sayfasini acma
    Given kullanici amazon sayfasina gider


    Scenario: TC05 Amazonda paramtreli phone arama testi
      When kullanici "iphone" icin arama yapar
      Then sonuclarin "iphone" icerdigini test eder

      Scenario: TC06 Amazonda parametreli tea pot arama testi
        When kullanici "tea pot" icin arama yapar
        Then sonuclarin "tea pot" icerdigini test eder

        Scenario: TC07 Amazonda parametreli flower arama testi
          When kullanici "flower" icin arama yapar
          Then sonuclarin "flower" icerdigini test eder

