ALTER TABLE accessory
  ADD CONSTRAINT fk_accessory_product_1 FOREIGN KEY (id_product1) REFERENCES product (id);

ALTER TABLE accessory
  ADD CONSTRAINT fk_accessory_product_2 FOREIGN KEY (id_product2) REFERENCES product (id);