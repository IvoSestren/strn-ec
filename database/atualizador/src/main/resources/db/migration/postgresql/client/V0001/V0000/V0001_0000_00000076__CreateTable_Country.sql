CREATE TABLE country (
  id                         chave                 NOT NULL,
  id_zone                    chave                 NOT NULL,
  id_currency                chave                 NOT NULL,
  iso_code                   character varying(3)  NOT NULL,
  call_prefix                integer               NOT NULL,
  active                     boolean               NOT NULL,
  contains_states            boolean               NOT NULL,
  need_identification_number boolean               NOT NULL,
  need_zip_code              boolean               NOT NULL,
  zip_code_format            character varying(12) NOT NULL,
  display_tax_label          boolean               NOT NULL,
  CONSTRAINT pk_country PRIMARY KEY (id)
);