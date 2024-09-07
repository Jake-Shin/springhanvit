-- utf8mb4
CREATE DATABASE `hanvithancom`

-- hanvithancom.hancom definition

CREATE TABLE `hancom` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `completionTime` varchar(100) DEFAULT NULL,
  `create_datetime` datetime DEFAULT current_timestamp(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;
