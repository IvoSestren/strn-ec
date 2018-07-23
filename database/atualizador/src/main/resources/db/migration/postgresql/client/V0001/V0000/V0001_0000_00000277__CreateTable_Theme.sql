CREATE TABLE theme (
  id       CHAVE                  NOT NULL,
  name     CHARACTER VARYING(64)  NOT NULL,
  location CHARACTER VARYING(255) NOT NULL,
  active   BOOLEAN                NOT NULL,
  internal BOOLEAN                NOT NULL,
  CONSTRAINT pk_theme PRIMARY KEY (id)
);

INSERT INTO theme (id, name, location, active, internal)
VALUES ('005IPGTWLGR33-1GJVDB7XTQWYE.0ZBADBW0K7T2X', 'default', '/WEB-INF/templates/default/', TRUE, TRUE);