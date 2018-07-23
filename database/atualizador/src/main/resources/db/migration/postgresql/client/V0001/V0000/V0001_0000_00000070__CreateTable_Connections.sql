CREATE TABLE connections (
  id            CHAVE                    NOT NULL,
  id_shop_group CHAVE                    NOT NULL,
  id_shop       CHAVE                    NOT NULL,
  id_guest      CHAVE                    NOT NULL,
  id_page       CHAVE                    NOT NULL,
  ip_address    VARCHAR(255),
  date_add      TIMESTAMP WITH TIME ZONE NOT NULL,
  http_referer  CHARACTER VARYING(255),
  CONSTRAINT pk_connections PRIMARY KEY (id)
);