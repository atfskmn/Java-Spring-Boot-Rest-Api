[README.md](https://github.com/user-attachments/files/21874401/README.md)
# 🚀 Spring Boot Backend Projesi

Bu proje, **Spring Boot** kullanılarak geliştirilmiş bir **Backend uygulamasıdır**.  
Amaç, RESTful servisler ile veri yönetimi, katmanlı mimari yaklaşımı, veritabanı etkileşimi, validasyon ve güvenli yapılandırmayı göstermektir.  

---

## 📌 Özellikler
- ✅ **REST API** ile CRUD işlemleri (GET, POST, PUT, DELETE)  
- ✅ **Katmanlı Mimari (MVC)**  
- ✅ **Spring Data JPA & Hibernate** ile veritabanı yönetimi  
- ✅ **PostgreSQL** entegrasyonu  
- ✅ **DTO (Data Transfer Object)** yapısı  
- ✅ **Validation & Exception Handling**  
- ✅ **Entity İlişkileri** (`@OneToOne`, `@OneToMany`, `@ManyToOne`, `@ManyToMany`)  
- ✅ **Konfigürasyon Yönetimi** (`application.properties`, `@Value`, `@ConfigurationProperties`)  

---

## 🏗️ Mimari Yapı

```
src
 ├── main
 │   ├── java/com/example/project
 │   │   ├── controller   -> REST API uçları
 │   │   ├── service      -> İş mantığı
 │   │   ├── repository   -> JPA Repository sınıfları
 │   │   ├── dto          -> Veri transfer objeleri
 │   │   └── model        -> Entity sınıfları
 │   └── resources
 │       ├── application.properties
 │       └── data.sql (opsiyonel örnek veriler)
 └── test -> Unit ve Integration testleri
```

---

## ⚙️ Kullanılan Teknolojiler
- **Java 17+**  
- **Spring Boot**  
- **Spring Data JPA (Hibernate)**  
- **PostgreSQL**  
- **Maven**  
- **Lombok**  
- **Postman (API testleri için)**  

---

## 🚀 Kurulum & Çalıştırma

1. Repoyu klonla:
   ```bash
   git clone https://github.com/kullanici/spring-boot-backend.git
   ```

2. Proje dizinine gir:
   ```bash
   cd spring-boot-backend
   ```

3. PostgreSQL veritabanını oluştur ve `application.properties` dosyasında bilgileri güncelle:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/proje_db
   spring.datasource.username=postgres
   spring.datasource.password=postgres
   ```

4. Uygulamayı çalıştır:
   ```bash
   ./mvnw spring-boot:run
   ```

5. Tarayıcıdan test et:  
   👉 [http://localhost:8080/api](http://localhost:8080/api)

---

## 📚 API Örnekleri

- **GET** `/api/users` → Tüm kullanıcıları getir  
- **POST** `/api/users` → Yeni kullanıcı ekle  
- **PUT** `/api/users/{id}` → Kullanıcı güncelle  
- **DELETE** `/api/users/{id}` → Kullanıcı sil  

---

## 🛡️ Validasyon & Hata Yönetimi
- Kullanıcıdan gelen veriler **Spring Validation** ile doğrulanır.  
- Hatalar özelleştirilmiş bir **Global Exception Handler** tarafından yönetilir.  

---

## 🎯 Amaç
Bu proje, **backend geliştirme için güçlü bir başlangıç noktası**dır.  
Yeni modüller eklenerek mikroservis mimarisine veya daha gelişmiş sistemlere dönüştürülebilir.  

