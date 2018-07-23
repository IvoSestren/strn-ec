CREATE TABLE category (
  id               CHAVE                    NOT NULL,
  id_parent        CHAVE,
  id_shop_default  CHAVE,
  level_depth      INTEGER                  NOT NULL,
  nleft            INTEGER                  NOT NULL,
  nright           INTEGER                  NOT NULL,
  active           BOOLEAN                  NOT NULL,
  date_add         TIMESTAMP WITH TIME ZONE NOT NULL,
  date_upd         TIMESTAMP WITH TIME ZONE NOT NULL,
  position         INTEGER                  NOT NULL,
  is_root_category BOOLEAN                  NOT NULL,
  CONSTRAINT pk_category PRIMARY KEY (id)
);

INSERT INTO category (id, id_parent, id_shop_default, level_depth, nleft, nright, active, date_add, date_upd, position, is_root_category)
VALUES
  ('005IPGTWXBB8P-1NCALHKLAU5Y3.14EREGIM2D1FC', NULL, NULL, 0, 0, 0, TRUE, current_timestamp, current_timestamp, 0,
    TRUE);