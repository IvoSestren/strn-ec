CREATE TABLE cmsrole (
  id     CHAVE                 NOT NULL,
  name   CHARACTER VARYING(50) NOT NULL,
  id_cms CHAVE                 NOT NULL,
  CONSTRAINT pk_cmsrole PRIMARY KEY (id)
);