CREATE TABLE homesliderslideslang (
  id                   CHAVE                  NOT NULL,
  id_homeslider_slides CHAVE                  NOT NULL,
  id_lang              CHAVE                  NOT NULL,
  title                CHARACTER VARYING(255) NOT NULL,
  description          TEXT                   NOT NULL,
  legend               CHARACTER VARYING(255) NOT NULL,
  url                  CHARACTER VARYING(255) NOT NULL,
  image                CHARACTER VARYING(255) NOT NULL,
  CONSTRAINT pk_homesliderslideslang PRIMARY KEY (id)
);