@2
Feature:Kullanıcı web sitesinde istediği kelimeyi arayabilmeli
Scenario:TC02_Kullanici_istanbul_aramasi_yapar_ve_belirli_bir_haberin_detayina_gider
  Given Kullanici search box a tiklar
  And Kullanici searc box a "İstanbul" girer
  And Kullanici enter a tiklar
  And Kullanici 8 inci habere tiklar
  Then Kullanici 8.haber bilgisini dogrular


