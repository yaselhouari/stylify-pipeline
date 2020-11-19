CREATE TABLE My_Service_Package(
  id  BIGINT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  description VARCHAR(2000) NOT NULL,
  gender VARCHAR(20)
);

CREATE TABLE My_Service (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  package_id CHAR(2) NOT NULL,
  title VARCHAR(100) NOT NULL,
  description VARCHAR(2000) NOT NULL,
  price VARCHAR(10) not null,
  duration VARCHAR(32) NOT NULL
);

ALTER TABLE My_Service ADD CONSTRAINT FK_SERVICE_PACKAGE_ID FOREIGN KEY (package_id) REFERENCES My_Service_Package(id);

