CREATE TABLE message (
  id          CHAVE                    NOT NULL,
  id_cart     CHAVE,
  id_customer CHAVE                    NOT NULL,
  id_employee CHAVE,
  id_order    CHAVE                    NOT NULL,
  message     TEXT                     NOT NULL,
  private     BOOLEAN                  NOT NULL,
  date_add    TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_message PRIMARY KEY (id)
);