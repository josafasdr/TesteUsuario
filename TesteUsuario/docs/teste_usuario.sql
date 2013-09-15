-- Table: tipo_usuario

-- DROP TABLE tipo_usuario;

CREATE TABLE tipo_usuario
(
  codigo serial NOT NULL,
  nome_tipo_usuario character varying(50),
  CONSTRAINT tipo_usuario_pk PRIMARY KEY (codigo)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tipo_usuario
  OWNER TO postgres;


-- Table: usuario

-- DROP TABLE usuario;

CREATE TABLE usuario
(
  tipo_usuario_codigo integer NOT NULL,
  nome character varying(100),
  data_do_cadastro date,
  hora_do_cadastro time without time zone,
  codigo serial NOT NULL,
  CONSTRAINT usuario_pk PRIMARY KEY (codigo),
  CONSTRAINT usuario_fk FOREIGN KEY (tipo_usuario_codigo)
      REFERENCES tipo_usuario (codigo) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE usuario
  OWNER TO postgres;


-- Column: codigo

-- ALTER TABLE tipo_usuario DROP COLUMN codigo;

--ALTER TABLE tipo_usuario ADD COLUMN codigo integer;
--ALTER TABLE tipo_usuario ALTER COLUMN codigo SET NOT NULL;
ALTER TABLE tipo_usuario ALTER COLUMN codigo SET DEFAULT nextval('tipo_usuario_codigo_seq'::regclass);


-- Column: codigo

-- ALTER TABLE usuario DROP COLUMN codigo;

--ALTER TABLE usuario ADD COLUMN codigo integer;
--ALTER TABLE usuario ALTER COLUMN codigo SET NOT NULL;
ALTER TABLE usuario ALTER COLUMN codigo SET DEFAULT nextval('usuario_codigo_seq'::regclass);
