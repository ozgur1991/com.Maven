Feature: US1001_amazon arama testi

  Scenario: TC01 Amazonda Arama yapma

    Given kullanici amazon sayfasina gider
    When kullanici iphone icin arama yapar
    Then sonuclarin iphone icerdigini test eder

    Given kullanici amazon sayfasina gider
    When kullanici tea pot icin arama yapar
    Then sonuclarin tea pot icerdigini test eder

    Given kullanici amazon sayfasina gider
    When kullanici flower icin arama yapar
    Then sonuclarin flower icerdigini test eder
