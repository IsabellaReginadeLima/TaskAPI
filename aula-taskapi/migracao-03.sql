CREATE DATABASE IF NOT EXISTS taskdb;
USE taskdb;

CREATE TABLE IF NOT EXISTS usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(120) NOT NULL,
    email VARCHAR(150) NOT NULL UNIQUE,
    credencial_acesso VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS tarefas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(120) NOT NULL,
    descricao VARCHAR(500),
    concluida BOOLEAN DEFAULT FALSE,
    usuario_id INT NOT NULL,

    CONSTRAINT fk_tarefas_usuario
        FOREIGN KEY (usuario_id)
        REFERENCES usuarios(id)
);

INSERT INTO usuarios (nome, email, credencial_acesso)
VALUES
('Joao Silva', 'joao@email.com', '123456'),
('Maria Souza', 'maria@email.com', 'abcdef');

INSERT INTO tarefas (titulo, descricao, concluida, usuario_id)
VALUES
('Estudar filtros', 'Ler o material da aula', FALSE, 1),
('Configurar o banco', 'MySQL + driver', TRUE, 1),
('Estudar Service Layer', 'Separar regras de negocio', FALSE, 1),
('Implementar Login', 'Criar sessao HTTP', TRUE, 1),

('Criar filtro de autenticacao', 'Proteger endpoints', FALSE, 2),
('Implementar UserDAO', 'Persistencia de usuarios', TRUE, 2),
('Criar UserService', 'Regras de usuarios', FALSE, 2),
('Validar sessao', 'Controle de acesso', TRUE, 2);