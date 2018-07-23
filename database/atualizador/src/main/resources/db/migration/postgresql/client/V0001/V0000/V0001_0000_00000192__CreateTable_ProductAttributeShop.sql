CREATE TABLE productattributeshop (
  id                   CHAVE          NOT NULL,
  id_product           CHAVE          NOT NULL,
  id_product_attribute CHAVE          NOT NULL,
  id_shop              CHAVE          NOT NULL,
  wholesale_price      DECIMAL(20, 6) NOT NULL,
  price                DECIMAL(20, 6) NOT NULL,
  ecotax               DECIMAL(17, 6) NOT NULL,
  weight               DECIMAL(20, 6) NOT NULL,
  unit_price_impact    DECIMAL(20, 6) NOT NULL,
  default_on           BOOLEAN,
  minimal_quantity     INTEGER        NOT NULL,
  low_stock_threshold  INTEGER,
  low_stock_alert      BOOLEAN        NOT NULL,
  available_date       TIMESTAMP WITH TIME ZONE,
  CONSTRAINT pk_productattributeshop PRIMARY KEY (id)
);