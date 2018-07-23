CREATE TABLE layeredfilter (
  id           CHAVE                    NOT NULL,
  name         CHARACTER VARYING(64)    NOT NULL,
  filters      TEXT,
  n_categories INTEGER                  NOT NULL,
  date_add     TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_layeredfilter PRIMARY KEY (id)
);