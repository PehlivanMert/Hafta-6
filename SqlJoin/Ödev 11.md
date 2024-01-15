# SQL Ödev11
####
* Q1 - Actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım.
####
* A1 - `SELECT first_name FROM customer
  UNION ALL
  SELECT first_name FROM actor;
`
* ####
* Q2 - Actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım.
####
* A2- `SELECT first_name FROM customer
  INTERSECT
  SELECT first_name FROM actor;
`
####
* Q3 - Actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım.
####
* A3 - `SELECT first_name FROM customer
  EXCEPT
  SELECT first_name FROM actor;
` 

