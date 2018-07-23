CREATE TABLE sekeyword (
  id            CHAVE                    NOT NULL,
  id_shop       CHAVE                    NOT NULL,
  id_shop_group CHAVE                    NOT NULL,
  keyword       CHARACTER VARYING(256)   NOT NULL,
  date_add      TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_sekeyword PRIMARY KEY (id)
);