--Criação e seleção do banco de dados
CREATE database queimaki;
SELECT database queimaki;

--Criação da tabela usuario (Robert) concluido
CREATE TABLE usuario(
id_user not null auto_increment unique primary key,
nome_user varchar(255) not null,
email_user varchar(255),
senha_user varchar(255),
confirma_senha varchar(255)
);

--Criar a tabela de administrador (Kauã) concluido
CREATE TABLE administrador(
id_admin int not null unique primary key,
nome_admin varchar(255) not null,
email_admin varchar(255),
senha_admin varchar (255);
id_user int,
 foreign key (id_user) references usuario(id_user)
);

--Criar a tabela de contato (Luiz) concluido
CREATE TABLE contatos (
    id_contato INT PRIMARY KEY AUTO_INCREMENT UNIQUE NOT NULL,
    nome_cont VARCHAR(255) NOT NULL, 
    email_cont VARCHAR(255),
    telefone_cont VARCHAR(50),
    id_forne INT  ,
    FOREIGN KEY (id_forne) REFERENCES forne(id_forne) 
);

--Criar a tabela categoria (GG) concluido
create table categoria(
    id_categ INT PRIMARY KEY AUTO_INCREMENT UNIQUE NOT NULL,
    nome_categ VARCHAR(255) NOT NULL,
    descricao TEXT
);

--Criar a tabela produto (Marcelo) concluido
CREATE TABLE produtos (
id_produ INT  PRIMARY KEY AUTO_INCREMENT,
nome_produ VARCHAR(255) NOT NULL,
descricao_produ varchar(255),
preco_produ varchar(255) NOT NULL,
id_categ INT,
id_forne INT,
FOREIGN KEY (id_categ) REFERENCES catego(id_categ),
FOREIGN KEY (id_forne) REFERENCES forne(id_forne)
);

--Criar a tabela de fornecedor(GG) concluido. 
create table fornecedor(
    id_forne INT auto_increment PRIMARY KEY UNIQUE NOT NULL,
    nome_forne VARCHAR(255) NOT NULL,
    cnpj_forne VARCHAR(17) UNIQUE NOT NULL,
    email_forne VARCHAR(255), 
    telefone_forne VARCHAR(20)
);

--Criar a tabela de promoções(Matheus) concluido
CREATE TABLE promocoes (
  id_promo INT AUTO_INCREMENT PRIMARY KEY,
  plataforma VARCHAR(100) NOT NULL,
  tipo_promocao VARCHAR(100) NOT NULL,
  desconto VARCHAR(255),
  periodo_inicio_promo DATE,
  periodo_fim_promo DATE
);

--Relacionamento entre as tabelas de produtos e promoções
CREATE TABLE produtos_promocoes (
    id_produ INT,
    id_promo INT,
    PRIMARY KEY (id_produ, id_promo),
    FOREIGN KEY (id_produ) REFERENCES produtos(id_produ),
    FOREIGN KEY (id_promo) REFERENCES promocoes(id_promo)
);
