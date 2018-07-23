CREATE TABLE customermessagesyncimap (
  id         CHAVE                 NOT NULL,
  md5_header CHARACTER VARYING(32) NOT NULL,
  CONSTRAINT pk_customermessagesyncimap PRIMARY KEY (id)
);