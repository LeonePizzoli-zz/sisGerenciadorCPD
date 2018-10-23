
/* Drop Tables */

DROP TABLE IF EXISTS roteador;
DROP TABLE IF EXISTS servidor;
DROP TABLE IF EXISTS equipamento;
DROP TABLE IF EXISTS usuario;




/* Create Tables */

CREATE TABLE equipamento
(
	id bigserial NOT NULL,
	datacadastro timestamp,
	datacompra timestamp,
	enderecoip varchar(15),
	marca varchar(25),
	modelo varchar(25),
	nome varchar(20),
	senha varchar(25),
	tipoequipamento varchar(20),
	usuario varchar(20),
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE roteador
(
	deptoinstalacao varchar(35),
	portaacesso int,
	id bigint NOT NULL
) WITHOUT OIDS;


CREATE TABLE servidor
(
	id_equipamento bigint NOT NULL,
	capacidadememoria varchar(35),
	espacoarmazenamento varchar(35),
	expressservicetag bigint,
	memoriainstalada varchar(35),
	processador varchar(35),
	quantidadefonte int,
	quantidadehd int,
	quantidadenucleosprocessador int,
	quantidadevms int,
	raid int,
	servicetag varchar(35),
	sistemaoperacional varchar(30),
	slotsrede int,
	tempogarantia int,
	tiposervidor varchar(35),
	ultimamanutencao timestamp,
	versaobios varchar(35),
	versaosistemaoperacional varchar(30),
	id bigserial NOT NULL,
	PRIMARY KEY (id_equipamento, id)
) WITHOUT OIDS;


CREATE TABLE usuario
(
	nome varchar(35),
	perfil varchar(15),
	senha varchar(20),
	titulo varchar(20),
	usuario varchar(20),
	id bigserial NOT NULL,
	PRIMARY KEY (id)
) WITHOUT OIDS;



/* Create Foreign Keys */

ALTER TABLE roteador
	ADD FOREIGN KEY (id)
	REFERENCES equipamento (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE servidor
	ADD FOREIGN KEY (id_equipamento)
	REFERENCES equipamento (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



