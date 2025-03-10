--[URF001] Login de usuarios
SELECT * FROM usuario 
WHERE email_user = 'email@exemplo.com' AND senha_user = MD5('123');

--[ARF008] Login de administradores
SELECT * FROM administrador
WHERE email_admin = 'exemplo@gmail.com' AND senha_admin = MD5('123'); 

--[URF003] Pesquisar produtos 
SELECT * FROM produtos
WHERE nome_produto LIKE '%nome_pesquisado%';

--[URF005] Pesquisar fornecedores
SELECT * FROM fornecedor
WHERE nome_forne LIKE '%nome_pesquisado%';

--[ARF007] Pesquisar categorias
SELECT * FROM categoria
WHERE nome_categ LIKE '%nome_pesquisado%';

--[URF004] Pesquisar usuarios
SELECT * FROM usuario
WHERE nome_user LIKE '%termo_de_pesquisa%' OR email_user LIKE '%termo_de_pesquisa%';

-- Adicionar uma promoção no produto
INSERT INTO produtos_promocoes (id_produ, id_promo)
VALUES (4, 3);

-- Relação entre produto e promoções
SELECT
    p.nome_produ, p.preco_produ, pr.plataforma, pr.tipo_promocao, pr.desconto
FROM
    produtos p
JOIN
    produtos_promocoes pp ON p.id_produ = pp.id_produ po
JOIN
    promocoes pr ON pp.id_promo = pr.id_promo;
    