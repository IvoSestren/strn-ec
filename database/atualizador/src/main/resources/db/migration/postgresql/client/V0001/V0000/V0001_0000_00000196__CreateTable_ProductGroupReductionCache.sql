CREATE TABLE productgroupreductioncache (
  id         CHAVE         NOT NULL,
  id_product CHAVE         NOT NULL,
  id_group   CHAVE         NOT NULL,
  reduction  DECIMAL(4, 3) NOT NULL,
  CONSTRAINT pk_productgroupreductioncache PRIMARY KEY (id)
);