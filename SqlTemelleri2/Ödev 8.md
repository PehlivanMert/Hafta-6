# SQL Ödev8
####
* Q1 - Test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
####
* Q2 - Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
####
* A1 and A2- `create table employee (
  id INT,
  name VARCHAR(50),
  birthday DATE,
  email VARCHAR(50)
  );
  insert into employee (id, name, birthday, email) values (1, 'Corella Conre', '1988-09-22', 'cconre0@illinois.edu'); * 50 tane yazıldı.
`
####
* Q3 - Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
####
* A3 - `UPDATE employee
  SET name = 'Corella Conre'
  WHERE id = 1;
  UPDATE employee
  SET birthday = '1988-09-22'
  WHERE id = 1;
  UPDATE employee
  SET email = ''` * 5
####
* Q4 - Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
####
* A4 - `DELETE FROM employee
  WHERE id = 1;
  DELETE FROM employee
  WHERE name = 'Corella Conre';
  DELETE FROM employee
  WHERE birthday = '1988-09-22';
  DELETE FROM employee
  WHERE email = ''` * 5
