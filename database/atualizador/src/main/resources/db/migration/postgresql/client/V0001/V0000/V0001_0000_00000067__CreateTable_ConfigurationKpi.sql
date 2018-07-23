CREATE TABLE configurationkpi (
  id            CHAVE                    NOT NULL,
  id_shop_group CHAVE,
  id_shop       CHAVE,
  name          CHARACTER VARYING(64)    NOT NULL,
  value         TEXT,
  date_add      TIMESTAMP WITH TIME ZONE NOT NULL,
  date_upd      TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_configurationkpi PRIMARY KEY (id)
);