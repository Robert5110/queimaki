--População da tabela Usuario(Robert) concluido
insert into usuario(id_user, nome_user, email_user, senha_user, confirma_senha) values (1,'Robert', 'robertrbc@gmail.com', MD5('999'), MD5('999'));
insert into usuario(id_user, nome_user, email_user, senha_user, confirma_senha) values (2,'Pedro', 'pedrinho90@hotmail.com', MD5('887'), MD5('887'));
insert into usuario(id_user, nome_user, email_user, senha_user, confirma_senha) values (3,'Enzo', 'ben10gamercria@gmail.com', MD5('543'), MD5('543'));
insert into usuario(id_user, nome_user, email_user, senha_user, confirma_senha) values (4,'Vitor', 'visquik8@gmail.com', MD5('777'), MD5('777'));
insert into usuario(id_user, nome_user, email_user, senha_user, confirma_senha) values (5,'Maria', 'Novamy@gmail.com', MD5('344'), MD5('344'));

--População da tabela admmin(Kauã) concluido
INSERT INTO administrador(id_admin, nome_admin, id_user, email_admin, senha_admin) values (10,'Kauã',1);
INSERT INTO administrador(id_admin, nome_admin, id_user, email_admin, senha_admin) values (20,'Luiz',2);
INSERT INTO administrador(id_admin, nome_admin, id_user, email_admin, senha_admin) values (30,'Geovanni',3);
INSERT INTO administrador(id_admin, nome_admin, id_user, email_admin, senha_admin) values (40,'Marcelo',4);
INSERT INTO administrador(id_admin, nome_admin, id_user, email_admin, senha_admin) values (50,'Matheus',5);
INSERT INTO administrador(id_admin, nome_admin, id_user, email_admin, senha_admin) values (2,'Robert',5,'robertrbc@gmail.com',  MD5('999'), MD5('999'));



--População da tabela de contato (Luiz) concluido
INSERT INTO contatos (nome_cont,email_cont,telefone_cont) VALUES ('Ana Silva', 'ana.silva@fornecedora.com', '(11) 9999-1234');
INSERT INTO contatos (nome_cont,email_cont,telefone_cont) VALUES ('Carlos Oliveira', 'carlos.oliveira@fornecedora.com', '(11) 8888-5678');
INSERT INTO contatos (nome_cont,email_cont,telefone_cont) VALUES ('Mariana Souza', 'mariana.souza@fornecedorb.com', '(21) 7777-9012');
INSERT INTO contatos (nome_cont,email_cont,telefone_cont) VALUES ('Pedro Rocha', 'pedro.rocha@fornecedorb.com', '(21) 6666-3456');
INSERT INTO contatos (nome_cont,email_cont,telefone_cont) VALUES ('Luciana Santos', 'luciana.santos@fornecedorc.com', '55557890');


--População da tabela categoria (GG) concluido

insert into categoria(nome_categ, descricao) values ('esporte', 'Os itens para esporte são essenciais para a prática de atividades físicas e competições, proporcionando conforto, segurança e eficiência aos atletas, sejam amadores ou profissionais.');
insert into categoria(nome_categ, descricao) values ('skin care', 'Os itens para skin care são essenciais para o cuidado e manutenção da saúde da pele, proporcionando hidratação, proteção e rejuvenescimento.');
insert into categoria(nome_categ, descricao) values ('eletrônicos', 'Os itens eletrônicos são indispensáveis no cotidiano moderno, oferecendo praticidade, entretenimento e eficiência em diversas tarefas.');
insert into categoria(nome_categ, descricao) values ('sexy', 'Os itens sexys, são exenciais para "apimentar" a relação entre você e seu parceiro.');
insert into categoria(nome_categ, descricao) values ('jogos de azar', 'jogos de azar sao bons para voce entender que o seu fracasso nao é só na vida real e sim em tudo que você faz.');



--População da tabela produto (Marcelo) concluido
insert into produtos(nome_produ,descricao_produ,preco_produ) values ('Samsung T350','Monitor Gamer','581,98');
insert into produtos(nome_produ,descricao_produ,preco_produ) values ('Pilha Duracell Com 16 Unidades','pilha alcalina duracell com 16 unidades','79,90');
insert into produtos(nome_produ,descricao_produ,preco_produ) values ('Cartucho de tinta HP','tinta HP 667 Preto Original','49,75');
insert into produtos(nome_produ,descricao_produ,preco_produ) values ('FISCHER COOKTOP ELɉTRICO','4 BOCAS MESA VITROCERÂMICA 220V','1.528,00');
insert into produtos(nome_produ,descricao_produ,preco_produ) values ('Headphone Fone de Ouvido','Fone de Ouvido Havit HV-H2002d, Gamer, com Microfone','179,90');

--População da tabela de fornecedor(GG) concluido
insert into fornecedor(nome_forne,cnpj_forne,email_forne,telefone_forne) values ('aliExpress','34.546.234/9876.87', 'aliexpress@gmai.com', '(32) 42345-5434');
insert into fornecedor(nome_forne,cnpj_forne,email_forne,telefone_forne) values ('magazine luiza','34.546.234/9876.87', 'magazineluiza@gmai.com', '(32) 42345-5434');
insert into fornecedor(nome_forne,cnpj_forne,email_forne,telefone_forne) values ('shopee','34.546.234/9876.87', 'shopee@gmai.com', '(32) 42345-5434');
insert into fornecedor(nome_forne,cnpj_forne,email_forne,telefone_forne) values ('amazon','34.546.234/9876.87', 'amazon@gmai.com', '(32) 42345-5434');
insert into fornecedor(nome_forne,cnpj_forne,email_forne,telefone_forne) values ('bemol','34.546.234/9876.87', 'bemol@gmai.com', '(32) 42345-5434');

--População da tabela de promoções(Matheus) concluido
INSERT INTO promocoes (plataforma, tipo_promocao, desconto, periodo_inicio_promo, periodo_fim_promo) VALUES ('Loja Online C','Desconto em Produtos','10% de desconto em todos os produtos','2023-11-10','2023-11-20');
INSERT INTO promocoes (plataforma, tipo_promocao, desconto, periodo_inicio_promo, periodo_fim_promo) VALUES ('Loja Online D','Desconto em Produtos','20% de desconto em todos os produtos','2022-09-20','2022-10-30');
INSERT INTO promocoes (plataforma, tipo_promocao, desconto, periodo_inicio_promo, periodo_fim_promo) VALUES ('Loja Online E','Desconto em Produtos','50% de desconto em todos os produtos','2020-05-26','2020-06-10');
INSERT INTO promocoes (plataforma, tipo_promocao, desconto, periodo_inicio_promo, periodo_fim_promo) VALUES ('Loja Online A','Desconto em Produtos','90% de desconto em todos os produtos','2021-07-16','2021-07-20');
INSERT INTO promocoes (plataforma, tipo_promocao, desconto, periodo_inicio_promo, periodo_fim_promo) VALUES ('Loja Online E','Desconto em Produtos','50% de desconto em todos os produtos','2020-05-26','2020-06-10');
--