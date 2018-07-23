CREATE TABLE specificpricepriority (
  id         CHAVE                 NOT NULL,
  id_product CHAVE                 NOT NULL,
  priority   CHARACTER VARYING(80) NOT NULL,
  CONSTRAINT pk_specificpricepriority PRIMARY KEY (id)
);