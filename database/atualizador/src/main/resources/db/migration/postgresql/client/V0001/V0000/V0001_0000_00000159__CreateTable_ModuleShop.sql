CREATE TABLE moduleshop (
  id            CHAVE   NOT NULL,
  id_module     CHAVE   NOT NULL,
  id_shop       CHAVE   NOT NULL,
  enable_device BOOLEAN NOT NULL,
  CONSTRAINT pk_moduleshop PRIMARY KEY (id)
);