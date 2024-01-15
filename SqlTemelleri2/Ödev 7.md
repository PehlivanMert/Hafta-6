# SQL Ödev7
####
* Q1 - Film tablosunda bulunan filmleri rating değerlerine göre gruplayınız.
####
* A1 - `SELECT rating FROM film
  GROUP BY rating;
  `
####
* Q2 - Film tablosunda bulunan filmleri replacement_cost sütununa göre grupladığımızda film sayısı 50 den fazla olan replacement_cost değerini ve karşılık gelen film sayısını sıralayınız.
####
* A2 - `SELECT replacement_cost, COUNT(*) FROM film
  GROUP BY replacement_cost
  HAVING COUNT(*) > 50;`
####
* Q3 - Customer tablosunda bulunan store_id değerlerine karşılık gelen müşteri sayılarını nelerdir? 
####
* A3 - `SELECT COUNT (*) FROM customer
  GROUP BY store_id;`
####
* Q4 - City tablosunda bulunan şehir verilerini country_id sütununa göre gruplandırdıktan sonra en fazla şehir sayısı barındıran country_id bilgisini ve şehir sayısını paylaşınız.
####
* A4 - `SELECT country_id, COUNT(*) FROM city
  GROUP BY country_id
  ORDER BY COUNT(*) DESC
  LIMIT 1;`
