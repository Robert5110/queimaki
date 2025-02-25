--Criar a tabela de administrador (Luiz) concluido
CREATE TABLE contatos (
    id_contato INT PRIMARY KEY AUTO_INCREMENT UNIQUE NOT NULL,
    id_forne INT NOT NULL,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    telefone VARCHAR(20),
    FOREIGN KEY (id_forne) REFERENCES forne(id_forne) ON DELETE CASCADE
);