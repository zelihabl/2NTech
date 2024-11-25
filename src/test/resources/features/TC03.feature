@3
Feature:Kullanici 2NTECH sitesinde bulunan basvuru formunu başaralı bir şekilde gönderebilmelidir
  Scenario: TC03_Basvuru_formu_basarili_bir_sekilde_gönderilmeli
    Given Kullanici "https://www.2ntech.com.tr/hr" gider
    When Kullanici AdSoyad inputuna "bir isim" girer
    And Kullanici Dogum Tarihi inptuna "01.02.1998" girer
    And Kullanici Tc kimlik numarasi inputuna "bir tc kimlik numrasi" girer
    And Kullanici Cep telefonu inputuna "bir cep tel no" girer
    And Kullanici Mail adresi inputuna "bir email" girer
    And Kullanici cv inputuna dosya yükler
    And Kullanici eğitim bilgisi seçer
    And Kullanici forward buttona tiklar
    And Kullanici Test Engineer kartini secer
    And Kullanıci gönder butonuna tiklar
    Then Kullanici basarili mesajini dogrular




