CREATE TABLE My_Client (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(100),
  last_name VARCHAR(100),
  gender VARCHAR(1),
  mobile VARCHAR(10),
  email VARCHAR(50),
  birth_date VARCHAR(10),
  location VARCHAR(50),
  username VARCHAR(100),
  password VARCHAR(100),
  status VARCHAR(100)
);