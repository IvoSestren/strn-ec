CREATE TABLE store (
  id         CHAVE                    NOT NULL,
  id_country CHAVE                    NOT NULL,
  id_state   CHAVE,
  city       CHARACTER VARYING(64)    NOT NULL,
  postcode   CHARACTER VARYING(12)    NOT NULL,
  latitude   DECIMAL(13, 8),
  longitude  DECIMAL(13, 8),
  phone      CHARACTER VARYING(16),
  fax        CHARACTER VARYING(16),
  email      CHARACTER VARYING(128),
  active     BOOLEAN                  NOT NULL,
  date_add   TIMESTAMP WITH TIME ZONE NOT NULL,
  date_upd   TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_store PRIMARY KEY (id)
);