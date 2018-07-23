CREATE TABLE referrer (
  id                      CHAVE                    NOT NULL,
  name                    CHARACTER VARYING(64)    NOT NULL,
  passwd                  CHARACTER VARYING(32),
  http_referer_regexp     CHARACTER VARYING(64),
  http_referer_like       CHARACTER VARYING(64),
  request_uri_regexp      CHARACTER VARYING(64),
  request_uri_like        CHARACTER VARYING(64),
  http_referer_regexp_not CHARACTER VARYING(64),
  http_referer_like_not   CHARACTER VARYING(64),
  request_uri_regexp_not  CHARACTER VARYING(64),
  request_uri_like_not    CHARACTER VARYING(64),
  base_fee                DECIMAL(5, 2)            NOT NULL,
  percent_fee             DECIMAL(5, 2)            NOT NULL,
  click_fee               DECIMAL(5, 2)            NOT NULL,
  date_add                TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_referrer PRIMARY KEY (id)
);