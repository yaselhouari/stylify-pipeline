CREATE TABLE My_Display_Service (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  package_id CHAR(2),
  title VARCHAR(100),
  description VARCHAR(2000),
  price VARCHAR(10),
  duration VARCHAR(32)
);

ALTER TABLE My_Display_Service ADD CONSTRAINT FK_SERVICE_PACKAGE_ID FOREIGN KEY (package_id) REFERENCES My_Display_Service_Package(id);

INSERT INTO My_Display_Service (id, package_id, title, description, price, duration) VALUES
(1, 1, 'coloration cheveux', 'description', '100', '1:00'),
(2, 1, 'coloration barbe', 'description', '100', '1:00'),
(3, 1, 'coloration moustache', 'description', '100', '1:00'),
(4, 1, 'mèches pour cheveux', 'description', '100', '1:00'),

(5, 2, 'défrisage', 'description', '100', '1:00'),
(6, 2, 'kératine', 'description', '100', '1:00'),
(7, 2, 'protein', 'description', '100', '1:00'),
(8, 2, 'pack lissage (lissage + coupe + barbe)', 'description', '100', '1:00'),

(9, 3, 'manucure normal', 'description', '100', '1:00'),
(10, 3, 'manucure façon spa', 'description', '100', '1:00'),
(11, 3, 'pedicure normal', 'description', '100', '1:00'),
(12, 3, 'pedicure façon spa', 'description', '100', '1:00'),

(13, 4, 'soin black mask', 'description', '100', '1:00'),
(14, 4, 'soin hydratant', 'description', '100', '1:00'),
(15, 4, 'soin de visage express 30 min', 'description', '100', '1:00'),
(16, 4, 'soin de visage profond avec extraction des points noirs', 'description', '100', '1:00'),

(17, 5, 'nez-narines', 'description', '100', '1:00'),
(18, 5, 'oreilles', 'description', '100', '1:00'),
(19, 5, 'contour de barbe', 'description', '100', '1:00'),
(20, 5, 'visage complet', 'description', '100', '1:00'),

(21, 6, 'pose vernis permanent', 'description',  '100', '1:00'),
(22, 6, 'manucure avec vernis permanent', 'description',  '100', '1:00'),
(23, 6, 'pose vernis french', 'description',  '100', '1:00'),
(24, 6, 'manucure avec french', 'description',  '100', '1:00'),
(25, 6, 'pose vernis simple', 'description',  '100', '1:00'),
(26, 6, 'manucure avec pose vernis simple', 'description',  '100', '1:00'),

(27, 7, 'pedicure avec vernis simplme', 'description',  '100', '1:00'),
(28, 7, 'pedicure french', 'description',  '100', '1:00'),
(29, 7, 'pedicure avec vernis permanent', 'description',  '100', '1:00'),
(30, 7, 'pedicure avec retrait vernis permanent', 'description',  '100', '1:00'),

(31, 8, 'maquillage de jour', 'description',  '100', '1:00'),
(32, 8, 'maquillage de nuit', 'description',  '100', '1:00'),
(33, 8, 'maquillage et faux cils', 'description',  '100', '1:00'),

(34, 9, 'sourcils', 'description',  '100', '1:00'),
(35, 9, 'visage', 'description',  '100', '1:00'),
(36, 9, 'duvet', 'description',  '100', '1:00'),
(37, 9, 'demis-bras', 'description',  '100', '1:00'),
(38, 9, 'bras', 'description',  '100', '1:00'),
(39, 9, 'jambes', 'description',  '100', '1:00'),
(40, 9, 'demi-jambes', 'description',  '100', '1:00'),
(41, 9, 'aiselle', 'description',  '100', '1:00'),
(42, 9, 'maillot brésilien', 'description',  '100', '1:00'),
(43, 9, 'bord de maillot', 'description',  '100', '1:00'),
(44, 9, 'maillot intégral', 'description',  '100', '1:00'),
(46, 9, 'épilation complète', 'description',  '100', '1:00'),

(47, 10, 'soin black mask', 'description',  '100', '1:00'),
(48, 10, 'soin hydratant', 'description',  '100', '1:00'),
(49, 10, 'soin de visage express 30 mins', 'description',  '100', '1:00'),
(50, 10, 'soin de visage profond avec extraction des points noirs', 'description',  '100', '1:00');