-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           5.5.62-log - MySQL Community Server (GPL)
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para horizonbd
DROP DATABASE IF EXISTS `horizonbd`;
CREATE DATABASE IF NOT EXISTS `horizonbd` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `horizonbd`;

-- Copiando estrutura para tabela horizonbd.cidade
DROP TABLE IF EXISTS `cidade`;
CREATE TABLE IF NOT EXISTS `cidade` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Cidade` varchar(255) DEFAULT NULL,
  `ID_ESTADO_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_CIDADE_ID_ESTADO_ID` (`ID_ESTADO_ID`),
  CONSTRAINT `FK_CIDADE_ID_ESTADO_ID` FOREIGN KEY (`ID_ESTADO_ID`) REFERENCES `estado` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela horizonbd.cidade: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `cidade` DISABLE KEYS */;
/*!40000 ALTER TABLE `cidade` ENABLE KEYS */;

-- Copiando estrutura para tabela horizonbd.clientes
DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `im` varchar(255) DEFAULT NULL,
  `rg` varchar(255) DEFAULT NULL,
  `cpf_ou_cnpj` varchar(255) DEFAULT NULL,
  `data_aniversário` date DEFAULT NULL,
  `data_cadastro` date DEFAULT NULL,
  `excluir` int(11) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `obs` varchar(255) DEFAULT NULL,
  `sexo` int(11) DEFAULT NULL,
  `situacao` int(11) DEFAULT NULL,
  `verifica_cpf_cnpj` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela horizonbd.clientes: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;

-- Copiando estrutura para tabela horizonbd.cliente_contato
DROP TABLE IF EXISTS `cliente_contato`;
CREATE TABLE IF NOT EXISTS `cliente_contato` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CELULAR_CLIENTE` varchar(255) DEFAULT NULL,
  `EMAIL_CLIENTE` varchar(255) DEFAULT NULL,
  `TELEFONE_CLIENTE` varchar(255) DEFAULT NULL,
  `WPP_CLIENTE` varchar(255) DEFAULT NULL,
  `CLIENTECONTATO_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_CLIENTE_CONTATO_CLIENTECONTATO_ID` (`CLIENTECONTATO_ID`),
  CONSTRAINT `FK_CLIENTE_CONTATO_CLIENTECONTATO_ID` FOREIGN KEY (`CLIENTECONTATO_ID`) REFERENCES `clientes` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela horizonbd.cliente_contato: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `cliente_contato` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente_contato` ENABLE KEYS */;

-- Copiando estrutura para tabela horizonbd.cliente_endereco
DROP TABLE IF EXISTS `cliente_endereco`;
CREATE TABLE IF NOT EXISTS `cliente_endereco` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `bairro_cliente` varchar(50) DEFAULT NULL,
  `CEP_CLIENTE` varchar(255) DEFAULT NULL,
  `COMPLEMENTO_ENDERECO` varchar(255) DEFAULT NULL,
  `endereco_cliente` varchar(100) DEFAULT NULL,
  `NUM_END_CLIENTE` int(11) DEFAULT NULL,
  `CIDADE_ID` int(11) DEFAULT NULL,
  `CLIENTE_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_CLIENTE_ENDERECO_CIDADE_ID` (`CIDADE_ID`),
  KEY `FK_CLIENTE_ENDERECO_CLIENTE_ID` (`CLIENTE_ID`),
  CONSTRAINT `FK_CLIENTE_ENDERECO_CLIENTE_ID` FOREIGN KEY (`CLIENTE_ID`) REFERENCES `clientes` (`ID`),
  CONSTRAINT `FK_CLIENTE_ENDERECO_CIDADE_ID` FOREIGN KEY (`CIDADE_ID`) REFERENCES `cidade` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela horizonbd.cliente_endereco: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `cliente_endereco` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente_endereco` ENABLE KEYS */;

-- Copiando estrutura para tabela horizonbd.config
DROP TABLE IF EXISTS `config`;
CREATE TABLE IF NOT EXISTS `config` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `nome_emp` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela horizonbd.config: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
/*!40000 ALTER TABLE `config` ENABLE KEYS */;

-- Copiando estrutura para tabela horizonbd.config_contato
DROP TABLE IF EXISTS `config_contato`;
CREATE TABLE IF NOT EXISTS `config_contato` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `email_config` varchar(60) DEFAULT NULL,
  `tel_config` varchar(20) DEFAULT NULL,
  `CONFIGURACOES_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_CONFIG_CONTATO_CONFIGURACOES_ID` (`CONFIGURACOES_ID`),
  CONSTRAINT `FK_CONFIG_CONTATO_CONFIGURACOES_ID` FOREIGN KEY (`CONFIGURACOES_ID`) REFERENCES `config` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela horizonbd.config_contato: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `config_contato` DISABLE KEYS */;
/*!40000 ALTER TABLE `config_contato` ENABLE KEYS */;

-- Copiando estrutura para tabela horizonbd.config_endereco
DROP TABLE IF EXISTS `config_endereco`;
CREATE TABLE IF NOT EXISTS `config_endereco` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `bairro_config` varchar(50) DEFAULT NULL,
  `endereco_config` varchar(100) DEFAULT NULL,
  `CIDADE_ID` int(11) DEFAULT NULL,
  `CONFIGURCAO_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_CONFIG_ENDERECO_CIDADE_ID` (`CIDADE_ID`),
  KEY `FK_CONFIG_ENDERECO_CONFIGURCAO_ID` (`CONFIGURCAO_ID`),
  CONSTRAINT `FK_CONFIG_ENDERECO_CONFIGURCAO_ID` FOREIGN KEY (`CONFIGURCAO_ID`) REFERENCES `config` (`ID`),
  CONSTRAINT `FK_CONFIG_ENDERECO_CIDADE_ID` FOREIGN KEY (`CIDADE_ID`) REFERENCES `cidade` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela horizonbd.config_endereco: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `config_endereco` DISABLE KEYS */;
/*!40000 ALTER TABLE `config_endereco` ENABLE KEYS */;

-- Copiando estrutura para tabela horizonbd.estado
DROP TABLE IF EXISTS `estado`;
CREATE TABLE IF NOT EXISTS `estado` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Estado` varchar(255) DEFAULT NULL,
  `UF` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela horizonbd.estado: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `estado` DISABLE KEYS */;
/*!40000 ALTER TABLE `estado` ENABLE KEYS */;

-- Copiando estrutura para tabela horizonbd.fornecedor
DROP TABLE IF EXISTS `fornecedor`;
CREATE TABLE IF NOT EXISTS `fornecedor` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `EXCLUIR_FORNECEDOR` int(11) DEFAULT NULL,
  `NOME_FORNECEDOR` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela horizonbd.fornecedor: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `fornecedor` DISABLE KEYS */;
/*!40000 ALTER TABLE `fornecedor` ENABLE KEYS */;

-- Copiando estrutura para tabela horizonbd.fornecedor_contato
DROP TABLE IF EXISTS `fornecedor_contato`;
CREATE TABLE IF NOT EXISTS `fornecedor_contato` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `EMAIL_FORNECEDOR` varchar(255) DEFAULT NULL,
  `TELEFONE_FORNECEDOR` varchar(255) DEFAULT NULL,
  `WHATSAPP_FORNECEDOR` varchar(255) DEFAULT NULL,
  `ID_FORNECEDOR_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_FORNECEDOR_CONTATO_ID_FORNECEDOR_ID` (`ID_FORNECEDOR_ID`),
  CONSTRAINT `FK_FORNECEDOR_CONTATO_ID_FORNECEDOR_ID` FOREIGN KEY (`ID_FORNECEDOR_ID`) REFERENCES `fornecedor` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela horizonbd.fornecedor_contato: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `fornecedor_contato` DISABLE KEYS */;
/*!40000 ALTER TABLE `fornecedor_contato` ENABLE KEYS */;

-- Copiando estrutura para tabela horizonbd.fornecedor_endereco
DROP TABLE IF EXISTS `fornecedor_endereco`;
CREATE TABLE IF NOT EXISTS `fornecedor_endereco` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `BAIRRO` varchar(255) DEFAULT NULL,
  `CEP_FORNECEDOR` varchar(255) DEFAULT NULL,
  `ENDERECO` varchar(255) DEFAULT NULL,
  `NUM_ENDERECO` int(11) DEFAULT NULL,
  `ID_CIDADE_ID` int(11) DEFAULT NULL,
  `ID_FORNECEDOR_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_FORNECEDOR_ENDERECO_ID_CIDADE_ID` (`ID_CIDADE_ID`),
  KEY `FK_FORNECEDOR_ENDERECO_ID_FORNECEDOR_ID` (`ID_FORNECEDOR_ID`),
  CONSTRAINT `FK_FORNECEDOR_ENDERECO_ID_FORNECEDOR_ID` FOREIGN KEY (`ID_FORNECEDOR_ID`) REFERENCES `fornecedor` (`ID`),
  CONSTRAINT `FK_FORNECEDOR_ENDERECO_ID_CIDADE_ID` FOREIGN KEY (`ID_CIDADE_ID`) REFERENCES `cidade` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela horizonbd.fornecedor_endereco: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `fornecedor_endereco` DISABLE KEYS */;
/*!40000 ALTER TABLE `fornecedor_endereco` ENABLE KEYS */;

-- Copiando estrutura para tabela horizonbd.login
DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `permissao` int(11) DEFAULT NULL,
  `senha` varchar(60) DEFAULT NULL,
  `user` varchar(60) DEFAULT NULL,
  `CONFIGURACAO_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_LOGIN_CONFIGURACAO_ID` (`CONFIGURACAO_ID`),
  CONSTRAINT `FK_LOGIN_CONFIGURACAO_ID` FOREIGN KEY (`CONFIGURACAO_ID`) REFERENCES `config` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela horizonbd.login: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
/*!40000 ALTER TABLE `login` ENABLE KEYS */;

-- Copiando estrutura para tabela horizonbd.orcamentos
DROP TABLE IF EXISTS `orcamentos`;
CREATE TABLE IF NOT EXISTS `orcamentos` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DATA_ORCAMENTO` date DEFAULT NULL,
  `OBSERVACOES_ORCAMENTO` varchar(255) DEFAULT NULL,
  `SITUACAO_ORCAMENTO` int(11) DEFAULT NULL,
  `VALOR_ADICIONAL` decimal(10,2) DEFAULT NULL,
  `ID_CLIENTE_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_ORCAMENTOS_ID_CLIENTE_ID` (`ID_CLIENTE_ID`),
  CONSTRAINT `FK_ORCAMENTOS_ID_CLIENTE_ID` FOREIGN KEY (`ID_CLIENTE_ID`) REFERENCES `clientes` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela horizonbd.orcamentos: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `orcamentos` DISABLE KEYS */;
/*!40000 ALTER TABLE `orcamentos` ENABLE KEYS */;

-- Copiando estrutura para tabela horizonbd.orcamentos_produtos
DROP TABLE IF EXISTS `orcamentos_produtos`;
CREATE TABLE IF NOT EXISTS `orcamentos_produtos` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `QTD_PROD` int(11) DEFAULT NULL,
  `VLR_UNIDADE_PRODUTO` decimal(10,2) DEFAULT NULL,
  `ID_ORCAMENTO_ID` int(11) DEFAULT NULL,
  `ID_PRODUTO_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_ORCAMENTOS_PRODUTOS_ID_ORCAMENTO_ID` (`ID_ORCAMENTO_ID`),
  KEY `FK_ORCAMENTOS_PRODUTOS_ID_PRODUTO_ID` (`ID_PRODUTO_ID`),
  CONSTRAINT `FK_ORCAMENTOS_PRODUTOS_ID_PRODUTO_ID` FOREIGN KEY (`ID_PRODUTO_ID`) REFERENCES `produtos` (`ID`),
  CONSTRAINT `FK_ORCAMENTOS_PRODUTOS_ID_ORCAMENTO_ID` FOREIGN KEY (`ID_ORCAMENTO_ID`) REFERENCES `orcamentos` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela horizonbd.orcamentos_produtos: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `orcamentos_produtos` DISABLE KEYS */;
/*!40000 ALTER TABLE `orcamentos_produtos` ENABLE KEYS */;

-- Copiando estrutura para tabela horizonbd.produtos
DROP TABLE IF EXISTS `produtos`;
CREATE TABLE IF NOT EXISTS `produtos` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `cod_barras_produto` int(11) DEFAULT NULL,
  `cod_ref_produto` int(11) DEFAULT NULL,
  `data_alteracao_produto` date DEFAULT NULL,
  `data_cadastro_produto` date DEFAULT NULL,
  `excluir_produto` int(11) DEFAULT NULL,
  `nome_produto` int(11) DEFAULT NULL,
  `preco_custo_produto` decimal(10,2) DEFAULT NULL,
  `preco_venda_produto` decimal(10,2) DEFAULT NULL,
  `situacao_produto` int(11) DEFAULT NULL,
  `IDFORNECEDOR_ID` int(11) DEFAULT NULL,
  `PRODUTOIDCATEGORIA_ID` int(11) DEFAULT NULL,
  `PRODUTOIDUNIDMEDIDA_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_PRODUTOS_IDFORNECEDOR_ID` (`IDFORNECEDOR_ID`),
  KEY `FK_PRODUTOS_PRODUTOIDCATEGORIA_ID` (`PRODUTOIDCATEGORIA_ID`),
  KEY `FK_PRODUTOS_PRODUTOIDUNIDMEDIDA_ID` (`PRODUTOIDUNIDMEDIDA_ID`),
  CONSTRAINT `FK_PRODUTOS_PRODUTOIDUNIDMEDIDA_ID` FOREIGN KEY (`PRODUTOIDUNIDMEDIDA_ID`) REFERENCES `produtos_unid_medida` (`ID`),
  CONSTRAINT `FK_PRODUTOS_IDFORNECEDOR_ID` FOREIGN KEY (`IDFORNECEDOR_ID`) REFERENCES `fornecedor` (`ID`),
  CONSTRAINT `FK_PRODUTOS_PRODUTOIDCATEGORIA_ID` FOREIGN KEY (`PRODUTOIDCATEGORIA_ID`) REFERENCES `produto_categoria` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela horizonbd.produtos: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `produtos` DISABLE KEYS */;
/*!40000 ALTER TABLE `produtos` ENABLE KEYS */;

-- Copiando estrutura para tabela horizonbd.produtos_unid_medida
DROP TABLE IF EXISTS `produtos_unid_medida`;
CREATE TABLE IF NOT EXISTS `produtos_unid_medida` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `SIGLA` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela horizonbd.produtos_unid_medida: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `produtos_unid_medida` DISABLE KEYS */;
/*!40000 ALTER TABLE `produtos_unid_medida` ENABLE KEYS */;

-- Copiando estrutura para tabela horizonbd.produto_categoria
DROP TABLE IF EXISTS `produto_categoria`;
CREATE TABLE IF NOT EXISTS `produto_categoria` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `descricao_prod_categoria` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela horizonbd.produto_categoria: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `produto_categoria` DISABLE KEYS */;
/*!40000 ALTER TABLE `produto_categoria` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
