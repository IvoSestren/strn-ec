CREATE TABLE cmscategory (
  id          CHAVE                    NOT NULL,
  id_parent   CHAVE                    NOT NULL,
  level_depth INTEGER                  NOT NULL,
  active      BOOLEAN                  NOT NULL,
  date_add    TIMESTAMP WITH TIME ZONE NOT NULL,
  date_upd    TIMESTAMP WITH TIME ZONE NOT NULL,
  position    INTEGER                  NOT NULL,
  CONSTRAINT pk_cmscategory PRIMARY KEY (id)
);