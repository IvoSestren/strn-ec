CREATE TABLE supplyorderstate (
  id              CHAVE   NOT NULL,
  delivery_note   BOOLEAN NOT NULL,
  editable        BOOLEAN NOT NULL,
  receipt_state   BOOLEAN NOT NULL,
  pending_receipt BOOLEAN NOT NULL,
  enclosed        BOOLEAN NOT NULL,
  color           CHARACTER VARYING(32),
  CONSTRAINT pk_supplyorderstate PRIMARY KEY (id)
);