CREATE TABLE image (
  id         CHAVE   NOT NULL,
  id_product CHAVE   NOT NULL,
  position   INTEGER NOT NULL,
  cover      BOOLEAN,
  CONSTRAINT pk_image PRIMARY KEY (id)
);