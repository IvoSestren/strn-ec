CREATE TABLE adminfilter (
  id          CHAVE                  NOT NULL,
  id_employee CHAVE                  NOT NULL,
  id_shop     CHAVE                  NOT NULL,
  controller  CHARACTER VARYING(60)  NOT NULL,
  action      CHARACTER VARYING(100) NOT NULL,
  filter      TEXT                   NOT NULL,
  CONSTRAINT pk_adminfilter PRIMARY KEY (id)
);