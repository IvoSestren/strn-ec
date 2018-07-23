CREATE TABLE conditionbadge (
  id           CHAVE NOT NULL,
  id_condition CHAVE NOT NULL,
  id_badge     CHAVE NOT NULL,
  CONSTRAINT pk_conditionbadge PRIMARY KEY (id)
);