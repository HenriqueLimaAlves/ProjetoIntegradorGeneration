CREATE TABLE `cadastro_usuario_pf` (
	`nome` varchar(250) NOT NULL DEFAULT 'not null',
	`email` varchar(250) NOT NULL DEFAULT 'not null',
	`senha` varchar(250) NOT NULL DEFAULT 'not null',
	`cpf` varchar(250) NOT NULL DEFAULT 'not null',
	`idade` DATE NOT NULL DEFAULT 'not null',
	`id_pf` INT(5) NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (`id_pf`)
);

CREATE TABLE `tb_categoria` (
	`categoria` varchar(250) NOT NULL,
	`id_categoria` INT(5) NOT NULL AUTO_INCREMENT DEFAULT 'not null',
	PRIMARY KEY (`id_categoria`)
);

CREATE TABLE `tb_produto` (
	`categoria` varchar(255) NOT NULL DEFAULT 'not null',
	`quantidade` INT(255) NOT NULL,
	`urgente` BOOLEAN NOT NULL DEFAULT 'not null',
	`id_produto` INT(5) NOT NULL AUTO_INCREMENT DEFAULT 'not null',
	`id_categoria` INT(5) NOT NULL,
	PRIMARY KEY (`id_produto`)
);

CREATE TABLE `cadastro_usuario_pj` (
	`nome_fantasia` varchar(250) NOT NULL DEFAULT 'not null',
	`razao_social` varchar(255) NOT NULL,
	`cnpj` varchar(250) NOT NULL DEFAULT 'not null',
	`email` varchar(250) NOT NULL DEFAULT 'not null',
	`senha` varchar(250) NOT NULL DEFAULT 'not null',
	`endereco` varchar(255) NOT NULL,
	`id_pj` INT(5) NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (`id_pj`)
);

CREATE TABLE `cadastro_ong` (
	`nome` varchar(250) NOT NULL DEFAULT 'not null',
	`registro` varchar(250) NOT NULL DEFAULT 'not null',
	`email` varchar(250) NOT NULL DEFAULT 'not null',
	`senha` varchar(250) NOT NULL DEFAULT 'not null',
	`endereco` varchar(255) NOT NULL,
	`missao` varchar(255) NOT NULL,
	`site` varchar(255) NOT NULL DEFAULT 'not null',
	`id_pj` INT(5) NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (`id_pj`)
);

ALTER TABLE `tb_produto` ADD CONSTRAINT `tb_produto_fk0` FOREIGN KEY (`id_categoria`) REFERENCES `tb_categoria`(`id_categoria`);

