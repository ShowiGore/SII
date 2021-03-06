CREATE TABLE ACTIVIDAD (ID BIGINT NOT NULL, LUGAR VARCHAR(255), NUMPARTICIPANTES VARCHAR(255), DESCRIPCION VARCHAR(255), ESTADO VARCHAR(255) NOT NULL, FECHAFIN DATE, FECHAINICIO DATE, NOMBRE VARCHAR(255) NOT NULL, TIPO VARCHAR(255) NOT NULL, AFILIADO_UID_USUARIO VARCHAR(255), ENTIDADESO_NIF VARCHAR(255), RESPONSABLE_UID_USUARIO VARCHAR(255), USUARIO_UID_USUARIO VARCHAR(255), PRIMARY KEY (ID))
CREATE TABLE USUARIO (UID_USUARIO VARCHAR(255) NOT NULL, DTYPE VARCHAR(31), APELLIDOS VARCHAR(255) NOT NULL, NOMBRE VARCHAR(255) NOT NULL, DNI VARCHAR(255) UNIQUE, EMAIL VARCHAR(255) UNIQUE, NUM_TLF VARCHAR(255) UNIQUE, DESCRIPCION VARCHAR(255), PRIMARY KEY (UID_USUARIO))
CREATE TABLE AMBITO (ID BIGINT NOT NULL, NOMBRE VARCHAR(255) NOT NULL, PRIMARY KEY (ID))
CREATE TABLE CURSO (ID BIGINT NOT NULL, CURSO INTEGER, NOMBRE_TITULACION VARCHAR(255) NOT NULL, PRIMARY KEY (ID))
CREATE TABLE ENTIDAD (NIF VARCHAR(255) NOT NULL, DESCRIPCION VARCHAR(255), EMAIL VARCHAR(255) UNIQUE, NOMBRE VARCHAR(255) NOT NULL, PRIMARY KEY (NIF))
CREATE TABLE ACTIVIDAD_AMBITOS (actividad_fk BIGINT NOT NULL, ambitos_fk BIGINT NOT NULL, PRIMARY KEY (actividad_fk, ambitos_fk))
CREATE TABLE ACTIVIDAD_CURSOS (actividad_fk BIGINT NOT NULL, cursos_fk BIGINT NOT NULL, PRIMARY KEY (actividad_fk, cursos_fk))
CREATE TABLE ACTIVIDAD_USUARIOS (actividad_fk BIGINT NOT NULL, usuarios_fk VARCHAR(255) NOT NULL, PRIMARY KEY (actividad_fk, usuarios_fk))
CREATE TABLE ADMINISTRADOR_USUARIOS (administrador_fk VARCHAR(255) NOT NULL, usuarios_fk VARCHAR(255) NOT NULL, PRIMARY KEY (administrador_fk, usuarios_fk))
CREATE TABLE AFILIADO_ENTIDADES (afiliado_fk VARCHAR(255) NOT NULL, entidades_fk VARCHAR(255) NOT NULL, PRIMARY KEY (afiliado_fk, entidades_fk))
CREATE TABLE USUARIO_AMBITO (usuario_fk BIGINT NOT NULL, ambito_fk VARCHAR(255) NOT NULL, PRIMARY KEY (usuario_fk, ambito_fk))
CREATE TABLE CURSO_USUARIOS (curso_fk BIGINT NOT NULL, usuarios_fk VARCHAR(255) NOT NULL, PRIMARY KEY (curso_fk, usuarios_fk))
CREATE TABLE ENTIDAD_ACTIVIDAD (Entidad_NIF VARCHAR(255) NOT NULL, actividadesO_ID BIGINT NOT NULL, PRIMARY KEY (Entidad_NIF, actividadesO_ID))
CREATE TABLE USUARIO_ACTIVIDAD (Usuario_UID_USUARIO VARCHAR(255) NOT NULL, propuesta_ID BIGINT NOT NULL, PRIMARY KEY (Usuario_UID_USUARIO, propuesta_ID))
ALTER TABLE ACTIVIDAD ADD CONSTRAINT CTVIDADNTDADESONIF FOREIGN KEY (ENTIDADESO_NIF) REFERENCES ENTIDAD (NIF)
ALTER TABLE ACTIVIDAD ADD CONSTRAINT CTVDDFLDUIDUSUARIO FOREIGN KEY (AFILIADO_UID_USUARIO) REFERENCES USUARIO (UID_USUARIO)
ALTER TABLE ACTIVIDAD ADD CONSTRAINT CTVDDRSPNSBLDSARIO FOREIGN KEY (RESPONSABLE_UID_USUARIO) REFERENCES USUARIO (UID_USUARIO)
ALTER TABLE ACTIVIDAD ADD CONSTRAINT CTVDADSRUIDUSUARIO FOREIGN KEY (USUARIO_UID_USUARIO) REFERENCES USUARIO (UID_USUARIO)
ALTER TABLE ACTIVIDAD_AMBITOS ADD CONSTRAINT CTVDDAMBITOSmbtsfk FOREIGN KEY (ambitos_fk) REFERENCES AMBITO (ID)
ALTER TABLE ACTIVIDAD_AMBITOS ADD CONSTRAINT CTVDDMBITOSctvddfk FOREIGN KEY (actividad_fk) REFERENCES ACTIVIDAD (ID)
ALTER TABLE ACTIVIDAD_CURSOS ADD CONSTRAINT CTVDDCURSOSctvddfk FOREIGN KEY (actividad_fk) REFERENCES ACTIVIDAD (ID)
ALTER TABLE ACTIVIDAD_CURSOS ADD CONSTRAINT CTVDADCURSOScrssfk FOREIGN KEY (cursos_fk) REFERENCES CURSO (ID)
ALTER TABLE ACTIVIDAD_USUARIOS ADD CONSTRAINT CTVDDSARIOSctvddfk FOREIGN KEY (actividad_fk) REFERENCES ACTIVIDAD (ID)
ALTER TABLE ACTIVIDAD_USUARIOS ADD CONSTRAINT CTVDDUSUARIOSsrsfk FOREIGN KEY (usuarios_fk) REFERENCES USUARIO (UID_USUARIO)
ALTER TABLE ADMINISTRADOR_USUARIOS ADD CONSTRAINT DMNSTRDRSRIOSsrsfk FOREIGN KEY (usuarios_fk) REFERENCES USUARIO (UID_USUARIO)
ALTER TABLE ADMINISTRADOR_USUARIOS ADD CONSTRAINT DMNSTRDRdmnstrdrfk FOREIGN KEY (administrador_fk) REFERENCES USUARIO (UID_USUARIO)
ALTER TABLE AFILIADO_ENTIDADES ADD CONSTRAINT FLDNTIDADESntddsfk FOREIGN KEY (entidades_fk) REFERENCES ENTIDAD (NIF)
ALTER TABLE AFILIADO_ENTIDADES ADD CONSTRAINT FLDENTIDADESfldofk FOREIGN KEY (afiliado_fk) REFERENCES USUARIO (UID_USUARIO)
ALTER TABLE USUARIO_AMBITO ADD CONSTRAINT SARIOAMBITOsariofk FOREIGN KEY (usuario_fk) REFERENCES AMBITO (ID)
ALTER TABLE USUARIO_AMBITO ADD CONSTRAINT SARIOAMBITOmbitofk FOREIGN KEY (ambito_fk) REFERENCES USUARIO (UID_USUARIO)
ALTER TABLE CURSO_USUARIOS ADD CONSTRAINT CRSOUSUARIOScrsofk FOREIGN KEY (curso_fk) REFERENCES CURSO (ID)
ALTER TABLE CURSO_USUARIOS ADD CONSTRAINT CRSUSUARIOSsriosfk FOREIGN KEY (usuarios_fk) REFERENCES USUARIO (UID_USUARIO)
ALTER TABLE ENTIDAD_ACTIVIDAD ADD CONSTRAINT NTDDCTVDADctvddsID FOREIGN KEY (actividadesO_ID) REFERENCES ACTIVIDAD (ID)
ALTER TABLE ENTIDAD_ACTIVIDAD ADD CONSTRAINT NTDDCTIVIDADntddNF FOREIGN KEY (Entidad_NIF) REFERENCES ENTIDAD (NIF)
ALTER TABLE USUARIO_ACTIVIDAD ADD CONSTRAINT SRCTVIDADsrDSUARIO FOREIGN KEY (Usuario_UID_USUARIO) REFERENCES USUARIO (UID_USUARIO)
ALTER TABLE USUARIO_ACTIVIDAD ADD CONSTRAINT SRCTIVIDADprpstaID FOREIGN KEY (propuesta_ID) REFERENCES ACTIVIDAD (ID)
CREATE TABLE SEQUENCE (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT DECIMAL(15), PRIMARY KEY (SEQ_NAME))
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('SEQ_GEN', 0)
