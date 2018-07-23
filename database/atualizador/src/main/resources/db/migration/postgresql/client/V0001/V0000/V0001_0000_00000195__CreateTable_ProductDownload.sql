CREATE TABLE productdownload (
  id                 CHAVE                    NOT NULL,
  id_product         CHAVE                    NOT NULL,
  display_filename   CHARACTER VARYING(255),
  filename           CHARACTER VARYING(255),
  date_add           TIMESTAMP WITH TIME ZONE NOT NULL,
  date_expiration    TIMESTAMP WITH TIME ZONE,
  nb_days_accessible INTEGER,
  nb_downloadable    INTEGER,
  active             BOOLEAN                  NOT NULL,
  is_shareable       BOOLEAN                  NOT NULL,
  CONSTRAINT pk_productdownload PRIMARY KEY (id)
);