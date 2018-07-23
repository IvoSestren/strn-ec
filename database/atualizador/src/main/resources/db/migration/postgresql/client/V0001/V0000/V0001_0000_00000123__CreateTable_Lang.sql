CREATE TABLE lang (
  id               CHAVE                 NOT NULL,
  name             CHARACTER VARYING(32) NOT NULL,
  active           BOOLEAN               NOT NULL,
  iso_code         CHARACTER VARYING(2)  NOT NULL,
  language_code    CHARACTER VARYING(5)  NOT NULL,
  locale           CHARACTER VARYING(5)  NOT NULL,
  date_format_lite CHARACTER VARYING(32) NOT NULL,
  date_format_full CHARACTER VARYING(32) NOT NULL,
  is_rtl           BOOLEAN               NOT NULL,
  CONSTRAINT pk_lang PRIMARY KEY (id)
);