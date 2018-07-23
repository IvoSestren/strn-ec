CREATE TABLE ordermessagelang (
  id               CHAVE                  NOT NULL,
  id_order_message CHAVE                  NOT NULL,
  id_lang          CHAVE                  NOT NULL,
  name             CHARACTER VARYING(128) NOT NULL,
  message          TEXT                   NOT NULL,
  CONSTRAINT pk_ordermessagelang PRIMARY KEY (id)
);