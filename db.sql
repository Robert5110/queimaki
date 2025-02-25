--Criação e seleção do banco de dados
CREATE DB queimaki;
SELECT DB queimaki;

--Criação da tabela usuario (Robert) concluido
CREATE TABLE user(
id_user not null auto_increment unique primary key,
nome_user varchar(255) not null,
email_user varchar(255),
senha_user varchar(255),
confirma_senha varchar(255)
);

--Criar a tabela de administrador (Kauã) concluido
CREATE TABLE admin(
id_admin int not null unique primary key,
nome_admin varchar(255) not null,
CONSTRAINT fk_user_admin foreign key (id_user) references user(id_user)
);

--Criar a tabela contato (Luiz) em adamento
CREATE TABLE cont

--Criar a tabela categoria (GG) concluido
create table catego(
    id_categ INT PRIMARY KEY AUTO_INCREMENT UNIQUE NOT NULL,
    nome VARCHAR(255) NOT NULL,
    descricao TEXT
);

--Criar a tabela produto (Marcelo) em adamento
CREATE TABLE produ

--Criar a tabela de fornecedor(GG) concluido
create table forne(
    id_forne INT PRIMARY KEY UNIQUE NOT NULL,
    nome VARCHAR(255) NOT NULL,
    cnpj VARCHAR(14) UNIQUE NOT NULL,
    email VARCHAR(255), 
    telefone VARCHAR(20)
);

--Criar a tabela de promoções(Matheus) em andamento
CREATE TABLE promo
