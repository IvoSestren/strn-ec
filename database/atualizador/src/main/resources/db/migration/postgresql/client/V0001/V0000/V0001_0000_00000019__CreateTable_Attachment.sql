CREATE TABLE attachment (
  id        CHAVE                  NOT NULL,
  file      CHARACTER VARYING(40)  NOT NULL,
  file_name CHARACTER VARYING(128) NOT NULL,
  file_size INTEGER                NOT NULL,
  mime      CHARACTER VARYING(128) NOT NULL,
  CONSTRAINT pk_attachment PRIMARY KEY (id)
);