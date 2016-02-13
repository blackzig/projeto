CREATE SEQUENCE public.endereco_id_endereco;

CREATE TABLE public.endereco(
	id_endereco 		BIGINT NOT NULL DEFAULT nextval('public.endereco_id_endereco'),
	local_endereco		VARCHAR NOT NULL,
	cidade				VARCHAR NOT NULL,
	estado				VARCHAR NOT NULL,
	cep					VARCHAR NOT NULL,
        CONSTRAINT id_endereco PRIMARY KEY (id_endereco)
);

CREATE SEQUENCE public.contatos_id_contatos;

CREATE TABLE public.contatos(
	id_contatos 		BIGINT NOT NULL DEFAULT nextval('public.contatos_id_contatos'),
	email				VARCHAR NOT NULL,
	nome				VARCHAR NOT NULL,
	sobrenome			VARCHAR NOT NULL,
	telefone			VARCHAR NOT NULL,
	version				BIGINT NOT NULL,
	endereco	 		BIGINT NOT NULL,
        CONSTRAINT id_contatos PRIMARY KEY (id_contatos),
  	CONSTRAINT endereco_contatos_fk 
	FOREIGN KEY (endereco)
	REFERENCES endereco (id_endereco)
	ON UPDATE CASCADE 		
);

CREATE SEQUENCE public.customer_id_customer;

CREATE TABLE public.customer(
	id_customer 		BIGINT NOT NULL DEFAULT nextval('public.customer_id_customer'),
	first_name			VARCHAR NOT NULL,
	last_name			VARCHAR NOT NULL,
	email_address		VARCHAR NOT NULL,
        CONSTRAINT id_customer PRIMARY KEY (id_customer)
);


CREATE SEQUENCE public.customer_id_address;

CREATE TABLE public.address(
	id_address	BIGINT NOT NULL DEFAULT nextval('public.customer_id_address'),
	street		VARCHAR NOT NULL,
	city		VARCHAR NOT NULL,
	country		VARCHAR NOT NULL,
	customer	BIGINT NOT NULL,
        CONSTRAINT id_address PRIMARY KEY (id_address),
  	CONSTRAINT customer_address_fk 
	FOREIGN KEY (customer)
	REFERENCES customer (id_customer)
	ON UPDATE CASCADE 	
);

