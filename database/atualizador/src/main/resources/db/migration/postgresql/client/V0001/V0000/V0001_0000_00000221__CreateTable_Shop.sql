CREATE TABLE shop (
  id            CHAVE                 NOT NULL,
  id_shop_group CHAVE                 NOT NULL,
  name          CHARACTER VARYING(64) NOT NULL,
  id_category   CHAVE                 NOT NULL,
  id_theme      CHAVE                 NOT NULL,
  active        BOOLEAN               NOT NULL,
  deleted       BOOLEAN               NOT NULL,
  CONSTRAINT pk_shop PRIMARY KEY (id)
);