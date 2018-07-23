CREATE TABLE statssearch (
  id            CHAVE                    NOT NULL,
  id_shop       CHAVE                    NOT NULL,
  id_shop_group CHAVE                    NOT NULL,
  keywords      CHARACTER VARYING(255)   NOT NULL,
  results       INTEGER                  NOT NULL,
  date_add      TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_statssearch PRIMARY KEY (id)
);