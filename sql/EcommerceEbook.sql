# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.18)
# Database: EcommerceEbook
# Generation Time: 2017-06-04 21:28:12 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table livros
# ------------------------------------------------------------

DROP TABLE IF EXISTS `livros`;

CREATE TABLE `livros` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(200) DEFAULT NULL,
  `descricao` varchar(500) DEFAULT NULL,
  `categoria` varchar(500) DEFAULT NULL,
  `autor` varchar(500) DEFAULT NULL,
  `valor` float DEFAULT NULL,
  `link` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `livros` WRITE;
/*!40000 ALTER TABLE `livros` DISABLE KEYS */;

INSERT INTO `livros` (`id`, `nome`, `descricao`, `categoria`, `autor`, `valor`, `link`)
VALUES
	(1,'Orgulho e preconceito','Livro Orgulho e preconceito','Romance','Jane Austen',50,'orgulho_e_preconceito'),
	(2,'Dom Casmurro','Livro Dom Casmurro','Romance','Machado de Assis',60,'dom_casmurro');

/*!40000 ALTER TABLE `livros` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table vendas
# ------------------------------------------------------------

DROP TABLE IF EXISTS `vendas`;

CREATE TABLE `vendas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `livro_id` int(11) DEFAULT NULL,
  `valor` float DEFAULT NULL,
  `nome_cliente` varchar(200) DEFAULT NULL,
  `email_cliente` varchar(200) DEFAULT NULL,
  `foi_boleto` int(11) DEFAULT NULL,
  `cartao_nome` varchar(200) DEFAULT NULL,
  `cartao_numero` varchar(50) DEFAULT NULL,
  `cartao_codigo` int(11) DEFAULT NULL,
  `cartao_data_venc` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
