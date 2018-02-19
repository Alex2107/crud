CREATE DATABASE `test` /*!40100 DEFAULT CHARACTER SET utf8 */;


CREATE TABLE `test.book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `author` varchar(100) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `isbn` varchar(20) DEFAULT NULL,
  `printYear` int(11) DEFAULT NULL,
  `readAlready` tinyint(1) DEFAULT '0',
  `title` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
