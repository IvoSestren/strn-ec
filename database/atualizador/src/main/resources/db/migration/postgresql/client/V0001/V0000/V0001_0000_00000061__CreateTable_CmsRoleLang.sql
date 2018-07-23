CREATE TABLE cmsrolelang (
  id          CHAVE NOT NULL,
  id_cms_role CHAVE NOT NULL,
  id_lang     CHAVE NOT NULL,
  id_shop     CHAVE NOT NULL,
  name        CHARACTER VARYING(128),
  CONSTRAINT pk_cmsrolelang PRIMARY KEY (id)
);