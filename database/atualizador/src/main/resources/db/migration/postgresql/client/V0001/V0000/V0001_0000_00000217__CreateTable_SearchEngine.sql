CREATE TABLE searchengine (
  id     CHAVE                 NOT NULL,
  server CHARACTER VARYING(64) NOT NULL,
  getvar CHARACTER VARYING(16) NOT NULL,
  CONSTRAINT pk_searchengine PRIMARY KEY (id)
);