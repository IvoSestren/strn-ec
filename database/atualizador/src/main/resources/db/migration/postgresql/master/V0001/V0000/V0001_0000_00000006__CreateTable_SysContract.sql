CREATE TABLE syscontract (
  id           chave   NOT NULL,
  id_sysclient chave   NOT NULL,
  startdate    TIMESTAMP WITH TIME ZONE,
  enddate      TIMESTAMP WITH TIME ZONE,
  active       BOOLEAN NOT NULL,
  CONSTRAINT pk_syscontract PRIMARY KEY (id),
  CONSTRAINT fk_syscontract_sysclient FOREIGN KEY (id_sysclient) REFERENCES sysclient (id)
);