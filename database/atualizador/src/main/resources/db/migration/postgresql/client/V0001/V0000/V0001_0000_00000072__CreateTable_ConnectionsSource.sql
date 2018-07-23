CREATE TABLE connectionssource (
  id             CHAVE                    NOT NULL,
  id_connections CHAVE                    NOT NULL,
  http_referer   CHARACTER VARYING(255),
  request_uri    CHARACTER VARYING(255),
  keywords       CHARACTER VARYING(255),
  date_add       TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_connectionssource PRIMARY KEY (id)
);