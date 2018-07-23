CREATE TABLE daterange (
  id         CHAVE                    NOT NULL,
  time_start TIMESTAMP WITH TIME ZONE NOT NULL,
  time_end   TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_daterange PRIMARY KEY (id)
);