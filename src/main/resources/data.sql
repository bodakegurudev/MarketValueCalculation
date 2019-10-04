DROP TABLE IF EXISTS account;
DROP TABLE IF EXISTS stock;
 
CREATE TABLE account (
  account_id INT PRIMARY KEY,
  account_name VARCHAR(250) NOT NULL,
  currency VARCHAR(10) NOT NULL
);

CREATE TABLE stock (
  stock_id INT PRIMARY KEY,
  symbol VARCHAR(10) NOT NULL,
  quantity INT,
  exchange VARCHAR(10) NOT NULL,
  account_id INT
);
 
INSERT INTO account (account_id, account_name, currency) VALUES
  (1,'Test1',0),
  (2,'Test2',1),
  (3,'Test3',0);

INSERT INTO stock (stock_id, symbol, quantity, exchange, account_id) VALUES
  (1, 'IBM', 50,  0, 1),
  (2, 'DBS', 100, 1, 1),
  (3, 'DBS', 20,  1, 2),
  (4, 'IBM', 30,  0, 3);