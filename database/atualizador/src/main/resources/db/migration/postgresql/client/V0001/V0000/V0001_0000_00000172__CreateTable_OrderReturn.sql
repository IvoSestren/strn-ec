CREATE TABLE orderreturn (
  id          CHAVE                    NOT NULL,
  id_customer CHAVE                    NOT NULL,
  id_order    CHAVE                    NOT NULL,
  state       BOOLEAN                  NOT NULL,
  question    TEXT                     NOT NULL,
  date_add    TIMESTAMP WITH TIME ZONE NOT NULL,
  date_upd    TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_orderreturn PRIMARY KEY (id)
);