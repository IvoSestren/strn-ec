CREATE TABLE configurations (
  id            chave                    NOT NULL,
  id_shop_group chave,
  id_shop       chave,
  name          character varying(254)   NOT NULL,
  value         text,
  date_add      timestamp with time zone NOT NULL,
  date_upd      timestamp with time zone NOT NULL,
  CONSTRAINT pk_configuration PRIMARY KEY (id)
);