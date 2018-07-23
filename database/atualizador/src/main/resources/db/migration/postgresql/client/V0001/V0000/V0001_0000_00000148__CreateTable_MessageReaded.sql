CREATE TABLE messagereaded (
  id          CHAVE                    NOT NULL,
  id_message  CHAVE                    NOT NULL,
  id_employee CHAVE                    NOT NULL,
  date_add    TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_messagereaded PRIMARY KEY (id)
);