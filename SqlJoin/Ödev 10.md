# SQL Ödev10
####
* Q1 - City tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz LEFT JOIN sorgusunu yazınız.
####
* A1 - `SELECT city , country
  FROM city
  LEFT JOIN country ON city.country_id = country.country_id;`
* ####
* Q2 - Customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz RİGHT JOIN sorgusunu yazınız.
####
* A2- `SELECT first_name,last_name,payment_id
  FROM customer
  RIGHT JOIN payment ON customer.customer_id = payment.customer_id;`
####
* Q3 - Customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz FULL JOIN sorgusunu yazınız.
####
* A3 - `SELECT first_name,last_name,rental_id
  FROM customer
  FULL JOIN rental ON customer.customer_id = rental.customer_id;` 

