CREATE TABLE state (
  id           chave                 NOT NULL,
  id_country   chave                 NOT NULL,
  id_zone      chave                 NOT NULL,
  name         character varying(64) NOT NULL,
  iso_code     character varying(7)  NOT NULL,
  tax_behavior integer               NOT NULL,
  active       boolean               NOT null,
  CONSTRAINT pk_state PRIMARY KEY (id)
);