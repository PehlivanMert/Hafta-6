# SQL Ödev9
####
* Q1 - City tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
####
* A1 - `SELECT city , country
  FROM city
  INNER JOIN country ON city.country_id = country.country_id;`
* ####
* Q2 - Customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
####
* A2- `SELECT first_name,last_name,payment_id
  FROM customer
  INNER JOIN payment ON customer.customer_id = payment.customer_id;`
####
* Q3 - Customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
####
* A3 - `SELECT first_name,last_name,rental_id
  FROM customer
  INNER JOIN rental ON customer.customer_id = rental.customer_id;` 

