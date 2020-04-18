CREATE DATABASE  IF NOT EXISTS `demostock` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `demostock`;
-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: demostock
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`idCliente`),
  CONSTRAINT `fk_persona2` FOREIGN KEY (`idCliente`) REFERENCES `persona` (`idPersona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'pablo@gmial.com'),(3,'eduardo80@gmail.com');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `empleado` (
  `idEmpleado` int(11) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `franjaHoraria` varchar(45) NOT NULL,
  `sueldoBasico` double NOT NULL,
  `idLocal` int(11) NOT NULL,
  PRIMARY KEY (`idEmpleado`),
  KEY `fk_empleado_local_idx` (`idLocal`),
  CONSTRAINT `fk_persona` FOREIGN KEY (`idEmpleado`) REFERENCES `persona` (`idPersona`),
  CONSTRAINT `kk_empleado_local` FOREIGN KEY (`idLocal`) REFERENCES `local` (`idLocal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` VALUES (2,'Gerente','8am - 15pm',20000,1),(4,'Gerente','8am - 15pm',20000,3),(5,'Vendedor','8am - 17pm',15000,1),(6,'Vendedor','8am - 17pm',15000,3);
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `local`
--

DROP TABLE IF EXISTS `local`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `local` (
  `idLocal` int(11) NOT NULL AUTO_INCREMENT,
  `direccion` varchar(45) NOT NULL,
  `latitud` double NOT NULL,
  `longitud` double NOT NULL,
  `codLocal` int(11) NOT NULL,
  `nroTelefono` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  PRIMARY KEY (`idLocal`),
  KEY `fk_cliente_local_idx` (`idCliente`),
  CONSTRAINT `fk_cliente_local` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `local`
--

LOCK TABLES `local` WRITE;
/*!40000 ALTER TABLE `local` DISABLE KEYS */;
INSERT INTO `local` VALUES (1,'Pasaje 123',2112.555,2221.444,1111111,42881100,1),(2,'Pasaje 456',4114.4444,3333.555,2222222,58552001,1),(3,'Pasaje 124',3113.4444,3331.3333,3333333,42511078,1),(4,'Pasaje 001',3113.4444,3331.3333,4444444,42511078,3),(5,'Pasaje 002',3223.2222,2221.2222,5555555,42551874,3),(6,'Pasaje 003',4334.1111,3223.2112,6666666,42551874,3),(7,'Pasaje 101',2112.555,2221.444,1111111,42881100,1);
/*!40000 ALTER TABLE `local` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `persona` (
  `idPersona` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `dni` int(11) NOT NULL,
  `fechaDeNacimiento` date NOT NULL,
  PRIMARY KEY (`idPersona`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (1,'Pablo','Lopez',38554122,'1990-08-11'),(2,'Maria','Perez',22554107,'1997-05-21'),(3,'Eduardo','Perales',18477522,'1980-12-07'),(4,'Martin','Rodriguez',22846254,'2000-07-01'),(5,'Brian','Gimenez',38554101,'1994-08-15'),(6,'Diana','Rosales',37441012,'1993-08-27');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-18  2:13:00
