CREATE TABLE sysclient (
  id     chave                  NOT NULL,
  name   CHARACTER VARYING(250) NOT NULL,
  active BOOLEAN                NOT NULL,
  CONSTRAINT pk_sysclient PRIMARY KEY (id)
);