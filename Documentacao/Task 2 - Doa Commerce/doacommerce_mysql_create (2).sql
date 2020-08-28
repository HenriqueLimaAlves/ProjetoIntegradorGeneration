CREATE TABLE `usuario_pf` (
	`nome` varchar(250) NOT NULL DEFAULT 'not null',
	`email` varchar(250) NOT NULL DEFAULT 'not null',
	`senha` varchar(250) NOT NULL DEFAULT 'not null',
	`cpf` varchar(250) NOT NULL DEFAULT 'not null',
	`idade` DATE NOT NULL DEFAULT 'not null',
	`id_pf` INT(5) NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (`id_pf`)
);

CREATE TABLE `Categoria` (
	`alimentos` varchar(250) NOT NULL DEFAULT 'not null',
	`roupas` varchar(250) NOT NULL DEFAULT 'not null',
	`moveis` varchar(250) NOT NULL DEFAULT 'not null',
	`utensilios` varchar(250) NOT NULL DEFAULT 'not null',
	`higiene` varchar(250) NOT NULL DEFAULT 'not null',
	`educacao_cultura` varchar(250) NOT NULL DEFAULT 'not null',
	`urgente` varchar(255) NOT NULL DEFAULT 'not null',
	`id_categoria` INT(5) NOT NULL AUTO_INCREMENT DEFAULT 'not null',
	PRIMARY KEY (`id_categoria`)
);

CREATE TABLE `Produto` (
	`nome` varchar(255) NOT NULL DEFAULT 'not null',
	`quantidade` INT(255) NOT NULL DEFAULT 'not null',
	`urgente` BOOLEAN NOT NULL DEFAULT 'not null',
	`descricao` varchar(255) NOT NULL DEFAULT 'not null',
	`id_produto` INT(5) NOT NULL AUTO_INCREMENT DEFAULT 'not null',
	`id_categoria` INT(5) NOT NULL,
	PRIMARY KEY (`id_produto`)
);

ALTER TABLE `Produto` ADD CONSTRAINT `Produto_fk0` FOREIGN KEY (`id_categoria`) REFERENCES `Categoria`(`id_categoria`);

