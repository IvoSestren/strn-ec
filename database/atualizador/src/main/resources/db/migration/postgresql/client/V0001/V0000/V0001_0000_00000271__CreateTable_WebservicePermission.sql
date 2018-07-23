CREATE TABLE webservicepermission (
  id                    CHAVE                  NOT NULL,
  resource              CHARACTER VARYING(50)  NOT NULL,
  method                CHARACTER VARYING(255) NOT NULL,
  id_webservice_account CHAVE                  NOT NULL,
  CONSTRAINT pk_webservicepermission PRIMARY KEY (id)
);