CREATE DATABASE unp;
USE unp;

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE `clientes` (
  `codigo` varchar(10) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  UNIQUE KEY `codigo_UNIQUE` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


