CREATE TABLE featurevalue (
  id         CHAVE NOT NULL,
  id_feature CHAVE NOT NULL,
  custom     INTEGER,
  CONSTRAINT pk_featurevalue PRIMARY KEY (id)
);