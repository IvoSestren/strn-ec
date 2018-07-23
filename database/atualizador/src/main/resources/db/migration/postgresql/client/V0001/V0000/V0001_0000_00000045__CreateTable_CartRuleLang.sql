CREATE TABLE cartrulelang (
  id           CHAVE                  NOT NULL,
  id_cart_rule CHAVE                  NOT NULL,
  id_lang      CHAVE                  NOT NULL,
  name         CHARACTER VARYING(254) NOT NULL,
  CONSTRAINT pk_cartrulelang PRIMARY KEY (id)
);