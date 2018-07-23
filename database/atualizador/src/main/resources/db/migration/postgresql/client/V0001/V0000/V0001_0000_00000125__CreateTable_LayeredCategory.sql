CREATE TABLE layeredcategory (
  id                chave                  NOT NULL,
  id_shop           chave                  NOT NULL,
  id_category       chave                  NOT NULL,
  id_value          chave,
  type              character varying(255) NOT NULL,
  position          integer                NOT NULL,
  filter_type       integer                NOT NULL,
  filter_show_limit integer                NOT NULL,
  CONSTRAINT pk_layeredcategory PRIMARY KEY (id)
);