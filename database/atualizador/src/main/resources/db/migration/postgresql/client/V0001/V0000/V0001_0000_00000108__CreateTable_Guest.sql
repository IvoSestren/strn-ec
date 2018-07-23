CREATE TABLE guest (
  id                  CHAVE   NOT NULL,
  id_operating_system CHAVE,
  id_web_browser      CHAVE,
  id_customer         CHAVE,
  javascript          BOOLEAN,
  screen_resolution_x INTEGER,
  screen_resolution_y INTEGER,
  screen_color        INTEGER,
  sun_java            BOOLEAN,
  adobe_flash         BOOLEAN,
  adobe_director      BOOLEAN,
  apple_quicktime     BOOLEAN,
  real_player         BOOLEAN,
  windows_media       BOOLEAN,
  accept_language     CHARACTER VARYING(8),
  mobile_theme        BOOLEAN NOT NULL,
  CONSTRAINT pk_guest PRIMARY KEY (id)
);