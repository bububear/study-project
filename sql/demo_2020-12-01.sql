# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.17)
# Database: demo
# Generation Time: 2020-12-01 05:17:03 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table comment_record
# ------------------------------------------------------------

DROP TABLE IF EXISTS `comment_record`;

CREATE TABLE `comment_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comment` varchar(200) DEFAULT NULL,
  `parentid` int(11) DEFAULT NULL,
  `user_no` int(11) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `idx_repldy_no` (`parentid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `comment_record` WRITE;
/*!40000 ALTER TABLE `comment_record` DISABLE KEYS */;

INSERT INTO `comment_record` (`id`, `comment`, `parentid`, `user_no`, `create_time`, `update_time`)
VALUES
	(1,'主评论',NULL,NULL,'2020-11-25 09:33:10','2020-11-25 09:33:10'),
	(2,'评论主评论',1,NULL,'2020-11-25 09:45:22','2020-11-25 09:45:22'),
	(3,'主评论2',NULL,NULL,'2020-11-25 09:45:22','2020-11-25 09:45:22'),
	(4,'评论主评论2',3,NULL,'2020-11-25 09:45:22','2020-11-25 09:45:22'),
	(5,'评论主评论后评论2',2,NULL,'2020-11-25 09:45:22','2020-11-25 09:45:22'),
	(6,'评论主评论2',4,NULL,'2020-11-25 09:45:22','2020-11-25 09:45:22'),
	(7,'评论主评论2',6,NULL,'2020-11-25 09:45:22','2020-11-25 09:45:22'),
	(8,'评论主评论2',3,NULL,'2020-11-25 09:45:22','2020-11-25 09:45:22'),
	(9,'评论主评论2',5,NULL,'2020-11-25 09:45:22','2020-11-25 09:45:22'),
	(10,'评论主评论2',2,NULL,'2020-11-25 09:45:22','2020-11-25 09:45:22');

/*!40000 ALTER TABLE `comment_record` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
