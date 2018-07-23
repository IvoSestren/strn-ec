CREATE TABLE customerthread (
  id          CHAVE                    NOT NULL,
  id_shop     CHAVE                    NOT NULL,
  id_lang     CHAVE                    NOT NULL,
  id_contact  CHAVE                    NOT NULL,
  id_customer CHAVE,
  id_order    CHAVE,
  id_product  CHAVE,
  status      CHARACTER VARYING(255)   NOT NULL,
  email       CHARACTER VARYING(128)   NOT NULL,
  token       CHARACTER VARYING(12),
  date_add    TIMESTAMP WITH TIME ZONE NOT NULL,
  date_upd    TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_customerthread PRIMARY KEY (id)
);