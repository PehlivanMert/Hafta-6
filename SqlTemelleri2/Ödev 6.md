# SQL Ödev6
####
* Q1 - Film tablosunda bulunan rental_rate sütunundaki değerlerin ortalaması nedir?
####
* A1 - `SELECT AVG(rental_rate) FROM film;`
####
* Q2 - Film tablosunda bulunan filmlerden kaç tanesi 'C' karakteri ile başlar?
####
* A2 - `SELECT COUNT (*) FROM film
  WHERE title LIKE 'C%';`
####
* Q3 - Film tablosunda bulunan filmlerden rental_rate değeri 0.99 a eşit olan en uzun (length) film kaç dakikadır?
####
* A3 - `SELECT MAX(length) FROM film
  WHERE rental_rate = 0.99;
  `
####
* Q4 - Film tablosunda bulunan filmlerin uzunluğu 150 dakikadan büyük olanlarına ait kaç farklı replacement_cost değeri vardır?
####
* A4 - `SELECT COUNT(DISTINCT replacement_cost) FROM film
  WHERE length > 150;
  `
