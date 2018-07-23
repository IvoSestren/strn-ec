CREATE TABLE supplyorderstatelang (
  id                    CHAVE NOT NULL,
  id_supply_order_state CHAVE NOT NULL,
  id_lang               CHAVE NOT NULL,
  name                  CHARACTER VARYING(128),
  CONSTRAINT pk_supplyorderstatelang PRIMARY KEY (id)
);