# SQL Ödev12
####
* Q1 - Film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?
####
* A1 - `SELECT COUNT(*) FROM film
  WHERE length > (SELECT AVG(length) FROM film);
  `
* ####
* Q2 - Film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?
####
* A2- `SELECT COUNT(*) FROM film
  WHERE rental_rate = (SELECT MAX(rental_rate) FROM film);`
####
* Q3 - Film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.
####
* A3 - `SELECT title,rental_rate,replacement_cost FROM film
  WHERE rental_rate = (SELECT MIN(rental_rate) FROM film)
  AND replacement_cost = (SELECT MIN(replacement_cost) FROM film);`
####
* Q4 - Payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.

####
* A4 - `SELECT first_name,last_name,COUNT(*) FROM customer
  INNER JOIN payment ON customer.customer_id = payment.customer_id
  GROUP BY customer.customer_id
  ORDER BY COUNT(*) DESC
  ` 

