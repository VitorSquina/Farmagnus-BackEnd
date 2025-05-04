CREATE TABLE medicamento (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255),
    codigo_barras VARCHAR(255),
    preco BIGINT NOT NULL,
    laboratorio VARCHAR(255) NOT NULL,
    apresentacao VARCHAR(255) NOT NULL,
    descricao TEXT,
    exibir_catalogo BOOLEAN DEFAULT TRUE,
    img VARCHAR(512)
);