CREATE TABLE mail (
  id        CHAVE                    NOT NULL,
  recipient CHARACTER VARYING(126)   NOT NULL,
  template  CHARACTER VARYING(62)    NOT NULL,
  subject   CHARACTER VARYING(254)   NOT NULL,
  id_lang   CHAVE                    NOT NULL,
  date_add  TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_mail PRIMARY KEY (id)
);