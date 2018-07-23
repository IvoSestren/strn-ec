CREATE TABLE customizeddata (
  id               CHAVE                  NOT NULL,
  id_customization CHAVE                  NOT NULL,
  type             INTEGER                NOT NULL,
  index            INTEGER                NOT NULL,
  value            CHARACTER VARYING(255) NOT NULL,
  id_module        CHAVE                  NOT NULL,
  price            DECIMAL(20, 6)         NOT NULL,
  weight           DECIMAL(20, 6)         NOT NULL,
  CONSTRAINT pk_customizeddata PRIMARY KEY (id)
);