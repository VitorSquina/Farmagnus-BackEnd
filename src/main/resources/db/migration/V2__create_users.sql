CREATE TABLE users_farmacia (
    id BIGSERIAL PRIMARY KEY,
    nome_empresa VARCHAR(120)  NOT NULL,
    nome_responsavel VARCHAR(120)  NOT NULL,
    cnpj CHAR(14)      NOT NULL UNIQUE,
    telefone VARCHAR(20)   NOT NULL,
    email VARCHAR(255)  NOT NULL UNIQUE
    );