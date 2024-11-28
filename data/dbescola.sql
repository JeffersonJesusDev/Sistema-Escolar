create database dbescola;
use db_escola;


CREATE TABLE tb_aluno (
    pk_id_aluno BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_aluno VARCHAR(100) NOT NULL,
    email_aluno VARCHAR(100),
    data_nascimento_aluno DATE,
    sala_id BIGINT NOT NULL, -- Associação com sala
    professor_id BIGINT NOT NULL -- Associação com professor
);

CREATE TABLE tb_professor (
    pk_id_professor BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_professor VARCHAR(100) NOT NULL,
    email_professor VARCHAR(100)
);

CREATE TABLE tb_sala (
    pk_id_sala BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_sala VARCHAR(50) NOT NULL,
    capacidade INT NOT NULL
);

CREATE TABLE tb_presenca (
    pk_id_presenca BIGINT AUTO_INCREMENT PRIMARY KEY,
    aluno_id BIGINT NOT NULL,
    sala_id BIGINT NOT NULL,
    professor_id BIGINT NOT NULL,
    data_presenca DATE NOT NULL
);


ALTER TABLE tb_aluno
ADD CONSTRAINT fk_aluno_sala
FOREIGN KEY (sala_id) REFERENCES tb_sala (pk_id_sala);

ALTER TABLE tb_aluno
ADD CONSTRAINT fk_aluno_professor
FOREIGN KEY (professor_id) REFERENCES tb_professor (pk_id_professor);

ALTER TABLE tb_presenca
ADD CONSTRAINT fk_presenca_aluno
FOREIGN KEY (aluno_id) REFERENCES tb_aluno (pk_id_aluno);

ALTER TABLE tb_presenca
ADD CONSTRAINT fk_presenca_sala
FOREIGN KEY (sala_id) REFERENCES tb_sala (pk_id_sala);

ALTER TABLE tb_presenca
ADD CONSTRAINT fk_presenca_professor
FOREIGN KEY (professor_id) REFERENCES tb_professor (pk_id_professor);