CREATE TABLE ROL (
    ID IDENTITY PRIMARY KEY,
    TIPO VARCHAR(50)
);

CREATE TABLE USUARIO (
    ID IDENTITY PRIMARY KEY,
    USUARIO VARCHAR(50),
    PASSWORD VARCHAR(50),
    ESTADO VARCHAR2(10),
);

CREATE TABLE PERSONA (
    ID IDENTITY PRIMARY KEY,
    NOMBRES VARCHAR(100),
    APELLIDOS VARCHAR(100),
    SEXO VARCHAR2(10),
    PAIS VARCHAR2(50),
    DIRECCION VARCHAR2(100)
);

CREATE TABLE PUBLICACION (
    ID IDENTITY PRIMARY KEY,
    CUERPO VARCHAR(255) NOT NULL,
    ID_PERSONA NUMBER,
    CONSTRAINT fk_persona FOREIGN KEY (ID_PERSONA) REFERENCES PERSONA(ID)
);

CREATE TABLE USUARIO_ROL (
    ID IDENTITY PRIMARY KEY,
    CUERPO VARCHAR(255) NOT NULL,
    ID_ROL NUMBER,
    CONSTRAINT FK_ROL FOREIGN KEY (ID_ROL) REFERENCES ROL(ID)
    ID_USUARIO NUMBER,
    CONSTRAINT FK_USUARIO FOREIGN KEY (ID_USUARIO) REFERENCES USUARIO(ID)
);