ALTER TABLE address
  ADD CONSTRAINT fk_address_country FOREIGN KEY (id_country) REFERENCES country (id);

ALTER TABLE address
  ADD CONSTRAINT fk_address_state FOREIGN KEY (id_state) REFERENCES state (id);

ALTER TABLE address
  ADD CONSTRAINT fk_address_customer FOREIGN KEY (id_customer) REFERENCES customer (id);

ALTER TABLE address
  ADD CONSTRAINT fk_address_manufacturer FOREIGN KEY (id_manufacturer) REFERENCES manufacturer (id);

ALTER TABLE address
  ADD CONSTRAINT fk_address_supplier FOREIGN KEY (id_supplier) REFERENCES supplier (id);

ALTER TABLE address
  ADD CONSTRAINT fk_address_warehouse FOREIGN KEY (id_warehouse) REFERENCES warehouse (id);