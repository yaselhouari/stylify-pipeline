CREATE TABLE My_Client (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(100) NOT NULL,
  last_name VARCHAR(100) NOT NULL,
  gender VARCHAR(1) NOT NULL,
  mobile VARCHAR(10) not null,
  email VARCHAR(50) NOT NULL,
  birth_date VARCHAR(10) not null,
  location VARCHAR(50) not null,
  username VARCHAR(100) NOT NULL,
  password VARCHAR(100) NOT NULL,
  status VARCHAR(100) not null
);