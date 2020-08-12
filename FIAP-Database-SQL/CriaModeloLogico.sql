-- Gerado por Oracle SQL Developer Data Modeler 19.4.0.350.1424
--   em:        2020-03-25 22:36:10 BRT
--   site:      Oracle Database 11g
--   tipo:      Oracle Database 11g



CREATE TABLE t_consulta_ps ( 
--  ERROR: Column name length exceeds maximum allowed length(30) 
    t_unidade_hospitalar_id_und_hospitalar  NUMBER(6) NOT NULL,
    nr_consulta                             NUMBER(30) NOT NULL,
    t_paciente_id_paciente                  NUMBER(10) NOT NULL,
    t_medico_id_medico                      NUMBER(10) NOT NULL,
    dt_consulta                             DATE NOT NULL
);

ALTER TABLE t_consulta_ps ADD CONSTRAINT t_consulta_ps_pk PRIMARY KEY ( nr_consulta,
                                                                        t_unidade_hospitalar_id_und_hospitalar );

CREATE TABLE t_medico (
    id_medico         NUMBER(10) NOT NULL,
    nr_crm            NUMBER(50),
    nm_medico         VARCHAR2(80) NOT NULL,
    ds_especialidade  VARCHAR2(80) NOT NULL
);

ALTER TABLE t_medico ADD CONSTRAINT t_medico_pk PRIMARY KEY ( id_medico );

CREATE TABLE t_paciente (
    id_paciente    NUMBER(10) NOT NULL,
    nm_paciente    VARCHAR2(80) NOT NULL,
    dt_nascimento  DATE NOT NULL,
    nm_sexo        VARCHAR2(15) NOT NULL,
    ds_email       VARCHAR2(80),
    nr_ddd         NUMBER(3),
    nr_telefone    NUMBER(10)
);

ALTER TABLE t_paciente ADD CONSTRAINT t_paciente_pk PRIMARY KEY ( id_paciente );

CREATE TABLE t_unidade_hospitalar (
    id_und_hospitalar  NUMBER(6) NOT NULL,
    nm_und_hospitalar  VARCHAR2(80) NOT NULL,
    dt_fundacao        DATE NOT NULL,
    nr_ddd             NUMBER(3),
    nr_telefone        NUMBER(10),
    nm_estado          VARCHAR2(35) NOT NULL,
    sg_estado          CHAR(2) NOT NULL,
    nm_cidade          VARCHAR2(50) NOT NULL,
    nm_bairro          VARCHAR2(50) NOT NULL
);

ALTER TABLE t_unidade_hospitalar ADD CONSTRAINT t_unidade_hospitalar_pk PRIMARY KEY ( id_und_hospitalar );

ALTER TABLE t_consulta_ps
    ADD CONSTRAINT t_consulta_ps_t_medico_fk FOREIGN KEY ( t_medico_id_medico )
        REFERENCES t_medico ( id_medico );

ALTER TABLE t_consulta_ps
    ADD CONSTRAINT t_consulta_ps_t_paciente_fk FOREIGN KEY ( t_paciente_id_paciente )
        REFERENCES t_paciente ( id_paciente );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE t_consulta_ps
    ADD CONSTRAINT t_consulta_ps_t_unidade_hospitalar_fk FOREIGN KEY ( t_unidade_hospitalar_id_und_hospitalar )
        REFERENCES t_unidade_hospitalar ( id_und_hospitalar );



-- Relatório do Resumo do Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             4
-- CREATE INDEX                             0
-- ALTER TABLE                              7
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   2
-- WARNINGS                                 0
