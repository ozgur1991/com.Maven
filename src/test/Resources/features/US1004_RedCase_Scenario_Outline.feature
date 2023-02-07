Feature: US1004 RedCase Scenario Outline



  Scenario Outline: TC08 RedCase Positif Negatif Login Testi

    Given kullanici redcase sayfasina gider
    Then kullanici gecerli bir "<kullanici_adi>" girer
    Then kullanici gecersiz bir "<sifre>" girer
    And kullanici login butonuna basar
    And kullanici login olamadigini test eder

    Examples:

      | kullanici_adi | sifre     |
      | Oa17721       | 123       |
      | Oa17721       | asulA     |
      | Oa17721       | asulA1992 |

