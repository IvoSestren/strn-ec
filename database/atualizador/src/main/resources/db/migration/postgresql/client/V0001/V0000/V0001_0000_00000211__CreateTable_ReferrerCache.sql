CREATE TABLE referrercache (
  id                    CHAVE NOT NULL,
  id_connections_source CHAVE NOT NULL,
  id_referrer           CHAVE NOT NULL,
  CONSTRAINT pk_referrercache PRIMARY KEY (id)
);