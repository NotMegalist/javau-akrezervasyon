#  Uçak Bilet Rezervasyon Sistemi – Java Console Uygulaması

Bu proje, Java programlama dili ile geliştirilen bir **konsol tabanlı uçak bilet rezervasyon sistemidir**. Proje, nesne yönelimli programlama (OOP) prensiplerine uygun şekilde tasarlanmıştır ve kullanıcıya uçuş rezervasyonu yapma imkanı sunar.

---

##  Proje Yapısı

Proje aşağıdaki temel bileşenlerden oluşmaktadır:

###  `Airplane.java`
- Uçak modeli, markası, seri numarası ve koltuk kapasitesi gibi bilgileri içerir.

###  `Location.java`
- Uçuşun gerçekleştiği ülke, şehir ve havaalanı bilgilerini tutar.

###  `Flight.java`
- Lokasyon, uçak ve uçuş saati bilgilerini bir araya getirir.

###  `Reservation.java`
- Uçuş, yolcu adı, soyadı, yaşı gibi rezervasyon detaylarını temsil eder.

###  `ReservationService.java`
- Rezervasyon işlemlerini kontrol eder. Koltuk kapasitesine göre uygunluğu denetler.

### `FileManager.java`
- Yapılan rezervasyonlar `reservations.txt` dosyasına kaydedilir ve uygulama tekrar açıldığında geri yüklenir.

---

##  Konsol Uygulaması Özellikleri

- Uçuşları listeleme
- Uçuş seçip rezervasyon yapma
- Tüm rezervasyonları listeleme
- Uygulama kapatılıp açıldığında rezervasyonlar saklanır
- Basit ve kullanıcı dostu arayüz

---

##  Dosya Kaydetme
Rezervasyonlar proje klasöründeki `reservations.txt` dosyasına otomatik olarak kaydedilir.

---

##  Projeyi Çalıştırmak

> IntelliJ IDEA veya benzeri bir IDE ile projeyi açıp `Main.java` dosyasını çalıştırmanız yeterlidir.

---

##  Kullanılan Teknolojiler

- Java 17+
- OOP (Nesne Yönelimli Programlama)

---

##  Geliştirici
Ahmet Sarp Kaya

