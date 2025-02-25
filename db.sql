--Criar a tabela de administrador (Kauã) concluido
CREATE TABLE admin(
id_admin int not null unique primary key,
nome_admin varchar(255) not null,
CONSTRAINT fk_user_admin foreign key (id_user) references user(id_user)
);