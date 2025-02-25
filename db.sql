--Criação e seleção do banco de dados
CREATE DB queimaki;
SELECT DB queimaki;

--Criação da tabela usuario(Robert)
CREATE TABLE user(
id_user not null auto_increment unique primary key,
nome_user varchar(255) not null,
email_user varchar(255),
senha_user varchar(255),
confirma_senha varchar(255)
);

--Criar a tabela de administrador(Kauã)
CREATE TABLE admin(
id_admin int not null unique primary key,
nome_admin varchar(255) not null,
CONSTRAINT fk_user_admin foreign key (id_user) references user(id_user)
);

--Criar a tabela contato(Luiz)
CREATE TABLE cont

--Criar a tabela categoria(GG)
CREATE TABLE catego

--Criar a tabela produto(Marcelo)
CREATE TABLE produ

--Criar a tabela de fornecedor(GG)
CREATE TABLE forne

--Criar a tabela de promoções(Matheus)
CREATE TABLE promo