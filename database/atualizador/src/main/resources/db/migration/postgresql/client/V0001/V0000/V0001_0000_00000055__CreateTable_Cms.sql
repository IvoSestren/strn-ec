CREATE TABLE cms (
  id              CHAVE   NOT NULL,
  id_cms_category CHAVE   NOT NULL,
  position        CHAVE   NOT NULL,
  active          BOOLEAN NOT NULL,
  indexation      BOOLEAN NOT NULL,
  CONSTRAINT pk_cms PRIMARY KEY (id)
);