CREATE TABLE connectionspage (
  id             CHAVE                    NOT NULL,
  id_connections CHAVE                    NOT NULL,
  id_page        CHAVE                    NOT NULL,
  time_start     TIMESTAMP WITH TIME ZONE NOT NULL,
  time_end       TIMESTAMP WITH TIME ZONE,
  CONSTRAINT pk_connectionspage PRIMARY KEY (id)
);