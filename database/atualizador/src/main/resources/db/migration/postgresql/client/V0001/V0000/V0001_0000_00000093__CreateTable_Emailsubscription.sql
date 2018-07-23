CREATE TABLE emailsubscription (
  id                         CHAVE                  NOT NULL,
  id_shop                    CHAVE                  NOT NULL,
  id_shop_group              CHAVE                  NOT NULL,
  email                      CHARACTER VARYING(255) NOT NULL,
  newsletter_date_add        TIMESTAMP WITH TIME ZONE,
  ip_registration_newsletter CHARACTER VARYING(15)  NOT NULL,
  http_referer               CHARACTER VARYING(255),
  active                     BOOLEAN                NOT NULL,
  CONSTRAINT pk_emailsubscription PRIMARY KEY (id)
);