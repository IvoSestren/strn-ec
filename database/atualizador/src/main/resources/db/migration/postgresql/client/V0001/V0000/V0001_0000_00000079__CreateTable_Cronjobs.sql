CREATE TABLE cronjobs (
  id            CHAVE   NOT NULL,
  id_module     CHAVE,
  description   TEXT,
  task          TEXT,
  hour          INTEGER DEFAULT -1,
  day           INTEGER DEFAULT -1,
  month         INTEGER DEFAULT -1,
  day_of_week   INTEGER DEFAULT -1,
  updated_at    TIMESTAMP WITH TIME ZONE,
  one_shot      BOOLEAN NOT NULL,
  active        BOOLEAN,
  id_shop       CHAVE,
  id_shop_group CHAVE,
  CONSTRAINT pk_cronjobs PRIMARY KEY (id)
);