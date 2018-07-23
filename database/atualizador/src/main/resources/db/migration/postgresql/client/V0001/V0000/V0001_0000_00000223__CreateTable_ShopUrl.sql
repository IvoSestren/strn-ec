CREATE TABLE shopurl (
  id           CHAVE                  NOT NULL,
  id_shop      CHAVE                  NOT NULL,
  domain       CHARACTER VARYING(150) NOT NULL,
  domain_ssl   CHARACTER VARYING(150) NOT NULL,
  physical_uri CHARACTER VARYING(64)  NOT NULL,
  virtual_uri  CHARACTER VARYING(64)  NOT NULL,
  main         BOOLEAN                NOT NULL,
  active       BOOLEAN                NOT NULL,
  CONSTRAINT pk_shopurl PRIMARY KEY (id)
);