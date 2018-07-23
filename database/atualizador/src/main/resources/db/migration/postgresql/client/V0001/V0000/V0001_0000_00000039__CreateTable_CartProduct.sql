CREATE TABLE cartproduct (
  id                   CHAVE                    NOT NULL,
  id_cart              CHAVE                    NOT NULL,
  id_product           CHAVE                    NOT NULL,
  id_address_delivery  CHAVE                    NOT NULL,
  id_shop              CHAVE                    NOT NULL,
  id_product_attribute CHAVE                    NOT NULL,
  id_customization     CHAVE                    NOT NULL,
  quantity             INTEGER                  NOT NULL,
  date_add             TIMESTAMP WITH TIME ZONE NOT NULL,
  CONSTRAINT pk_cartproduct PRIMARY KEY (id)
);