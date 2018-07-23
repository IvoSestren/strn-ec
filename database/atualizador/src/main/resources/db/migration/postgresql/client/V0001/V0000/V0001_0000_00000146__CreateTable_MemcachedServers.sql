CREATE TABLE memcachedservers (
  id     CHAVE                  NOT NULL,
  ip     CHARACTER VARYING(254) NOT NULL,
  port   INTEGER                NOT NULL,
  weight INTEGER                NOT NULL,
  CONSTRAINT pk_memcachedservers PRIMARY KEY (id)
);