CREATE TABLE pagenotfound (
  id            CHAVE                    NOT NULL,
  id_shop       CHAVE                    NOT NULL,
  id_shop_group CHAVE                    NOT NULL,
  request_uri   CHARACTER VARYING(256)   NOT NULL,
  http_referer  CHARACTER VARYING(256)   NOT NULL,
  date_add      TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_pagenotfound PRIMARY KEY (id)
);