-- MySQL dump 10.13  Distrib 5.5.62, for Win64 (AMD64)
--
-- Host: localhost    Database: sistema
-- ------------------------------------------------------
-- Server version	5.5.62-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tabela_orcamento`
--

DROP TABLE IF EXISTS `tabela_orcamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tabela_orcamento` (
  `id_orcamento` int(11) NOT NULL AUTO_INCREMENT,
  `obs_geral_orcamento` varchar(100) DEFAULT NULL,
  `status_orcamento` int(11) DEFAULT NULL,
  `data_orcamento` date DEFAULT NULL,
  `nome_cliente_orcamento` varchar(60) NOT NULL,
  `telefone_orcamento` varchar(45) DEFAULT NULL,
  `cpf_ou_cnpj_orcamento` varchar(45) DEFAULT NULL,
  `valor_adicional` decimal(20,2) DEFAULT NULL,
  PRIMARY KEY (`id_orcamento`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabela_orcamento`
--

LOCK TABLES `tabela_orcamento` WRITE;
/*!40000 ALTER TABLE `tabela_orcamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `tabela_orcamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabela_orcamento_produto`
--

DROP TABLE IF EXISTS `tabela_orcamento_produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tabela_orcamento_produto` (
  `id_orcamento` int(11) NOT NULL AUTO_INCREMENT,
  `d_prod_1` varchar(100) DEFAULT '',
  `p_unit_1` decimal(20,2) DEFAULT '0.00',
  `q_item_1` int(11) DEFAULT NULL,
  `d_prod_2` varchar(100) DEFAULT NULL,
  `p_unit_2` decimal(20,2) DEFAULT NULL,
  `q_item_2` int(11) DEFAULT NULL,
  `d_prod_3` varchar(100) DEFAULT NULL,
  `p_unit_3` decimal(20,2) DEFAULT NULL,
  `q_item_3` int(11) DEFAULT NULL,
  `d_prod_4` varchar(100) DEFAULT NULL,
  `p_unit_4` decimal(20,2) DEFAULT NULL,
  `q_item_4` int(11) DEFAULT NULL,
  `d_prod_5` varchar(100) DEFAULT NULL,
  `p_unit_5` decimal(20,2) DEFAULT NULL,
  `q_item_5` int(11) DEFAULT NULL,
  `d_prod_6` varchar(100) DEFAULT NULL,
  `p_unit_6` decimal(20,2) DEFAULT NULL,
  `q_item_6` int(11) DEFAULT NULL,
  `d_prod_7` varchar(100) DEFAULT NULL,
  `p_unit_7` decimal(20,2) DEFAULT NULL,
  `q_item_7` int(11) DEFAULT NULL,
  `d_prod_8` varchar(100) DEFAULT NULL,
  `p_unit_8` decimal(20,2) DEFAULT NULL,
  `q_item_8` int(11) DEFAULT NULL,
  `d_prod_9` varchar(100) DEFAULT NULL,
  `p_unit_9` decimal(20,2) DEFAULT NULL,
  `q_item_9` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_orcamento`),
  KEY `fk_tb_orcamento_has_tb_produtos_tb_orcamento1_idx` (`id_orcamento`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabela_orcamento_produto`
--

LOCK TABLES `tabela_orcamento_produto` WRITE;
/*!40000 ALTER TABLE `tabela_orcamento_produto` DISABLE KEYS */;
/*!40000 ALTER TABLE `tabela_orcamento_produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_clientes`
--

DROP TABLE IF EXISTS `tb_clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_clientes` (
  `id_cliente` int(11) NOT NULL AUTO_INCREMENT,
  `nome_cliente` varchar(100) NOT NULL,
  `endereco_cliente` varchar(100) DEFAULT NULL,
  `num_endereco_cliente` int(11) DEFAULT NULL,
  `complemento_endereco_cliente` varchar(60) DEFAULT NULL,
  `email_cliente` varchar(60) DEFAULT NULL,
  `bairro_cliente` varchar(45) DEFAULT NULL,
  `cidade_cliente` varchar(60) DEFAULT NULL,
  `cep_cliente` varchar(60) DEFAULT NULL,
  `estado_cliente` varchar(60) DEFAULT NULL,
  `cpf_cnpj_cliente` varchar(20) DEFAULT NULL,
  `rg_ie_cliente` varchar(45) DEFAULT NULL,
  `im_cliente` varchar(45) DEFAULT NULL,
  `telefone_cliente` varchar(30) DEFAULT NULL,
  `celular_cliente` varchar(30) DEFAULT NULL,
  `data_cadastro_cliente` date DEFAULT NULL,
  `data_alteracao_cliente` date DEFAULT NULL,
  `sexo_cliente` int(11) DEFAULT NULL,
  `data_aniversario_cliente` date DEFAULT NULL,
  `observacao_cliente` varchar(60) DEFAULT NULL,
  `verificaCnpj` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_clientes`
--

LOCK TABLES `tb_clientes` WRITE;
/*!40000 ALTER TABLE `tb_clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_config_sistema`
--

DROP TABLE IF EXISTS `tb_config_sistema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_config_sistema` (
  `id_emp_config` int(11) NOT NULL AUTO_INCREMENT,
  `nome_emp_config` varchar(60) NOT NULL,
  `endereco_emp_config` varchar(60) DEFAULT NULL,
  `num_emp_config` int(11) DEFAULT NULL,
  `bairro_emp_config` varchar(45) DEFAULT NULL,
  `cidade_emp_config` varchar(45) DEFAULT NULL,
  `telefone_emp_config` varchar(45) DEFAULT NULL,
  `email_emp_config` varchar(70) DEFAULT NULL,
  PRIMARY KEY (`id_emp_config`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_config_sistema`
--

LOCK TABLES `tb_config_sistema` WRITE;
/*!40000 ALTER TABLE `tb_config_sistema` DISABLE KEYS */;
INSERT INTO `tb_config_sistema` VALUES (1,'Senai','Rua Teste',123,'Carijós','Indaial','(47)3333-3333','teste@teste');
/*!40000 ALTER TABLE `tb_config_sistema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_fornecedor`
--

DROP TABLE IF EXISTS `tb_fornecedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_fornecedor` (
  `idfornecedor` int(11) NOT NULL AUTO_INCREMENT,
  `nome_fornecedor` varchar(100) NOT NULL,
  PRIMARY KEY (`idfornecedor`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_fornecedor`
--

LOCK TABLES `tb_fornecedor` WRITE;
/*!40000 ALTER TABLE `tb_fornecedor` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_fornecedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_login`
--

DROP TABLE IF EXISTS `tb_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_login` (
  `id_login` int(11) NOT NULL AUTO_INCREMENT,
  `nome_login` varchar(45) NOT NULL,
  `senha_login` varchar(45) NOT NULL,
  `permissao_login` int(11) NOT NULL,
  PRIMARY KEY (`id_login`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_login`
--

LOCK TABLES `tb_login` WRITE;
/*!40000 ALTER TABLE `tb_login` DISABLE KEYS */;
INSERT INTO `tb_login` VALUES (1,'admin','admin',1),(2,'user','user',2);
/*!40000 ALTER TABLE `tb_login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_produtos`
--

DROP TABLE IF EXISTS `tb_produtos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_produtos` (
  `id_produto` int(11) NOT NULL AUTO_INCREMENT,
  `cod_barras_prod` int(11) DEFAULT NULL,
  `cod_ref_prod` int(11) DEFAULT NULL,
  `categoria_prod` varchar(100) NOT NULL,
  `unid_medida_prod` varchar(45) NOT NULL,
  `preco_custo_prod` decimal(20,2) DEFAULT NULL,
  `preco_venda_prod` decimal(20,2) NOT NULL,
  `margem_lucro_prod` double DEFAULT NULL,
  `situacao_prod` int(11) NOT NULL,
  `data_cadastro_prod` date DEFAULT NULL,
  `data_alteracao_prod` date DEFAULT NULL,
  `observacao_prod` varchar(1000) DEFAULT NULL,
  `nome_prod` varchar(100) NOT NULL,
  `nome_fornecedor` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`id_produto`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_produtos`
--

LOCK TABLES `tb_produtos` WRITE;
/*!40000 ALTER TABLE `tb_produtos` DISABLE KEYS */;

/*!40000 ALTER TABLE `tb_produtos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-06  8:20:06
