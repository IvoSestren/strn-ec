CREATE TABLE groups (
  id                   CHAVE                    NOT NULL,
  reduction            DECIMAL(17, 2)           NOT NULL,
  price_display_method INTEGER                  NOT NULL,
  show_prices          BOOLEAN                  NOT NULL,
  date_add             TIMESTAMP WITH TIME ZONE NOT NULL,
  date_upd             TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_group PRIMARY KEY (id)
);