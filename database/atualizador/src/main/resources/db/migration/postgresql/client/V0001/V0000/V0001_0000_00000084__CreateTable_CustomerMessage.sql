CREATE TABLE customermessage (
  id                 CHAVE                    NOT NULL,
  id_customer_thread CHAVE,
  id_employee        CHAVE,
  message            TEXT                     NOT NULL,
  file_name          CHARACTER VARYING(18),
  ip_address         CHARACTER VARYING(16),
  user_agent         CHARACTER VARYING(128),
  date_add           TIMESTAMP WITH TIME ZONE NOT NULL,
  date_upd           TIMESTAMP WITH TIME ZONE NOT NULL,
  private            BOOLEAN                  NOT NULL,
  read               BOOLEAN                  NOT NULL,
  CONSTRAINT pk_customermessage PRIMARY KEY (id)
);