-- CATEGORIAS
INSERT INTO tb_categoria (id, descricao) VALUES (1, 'Curso' );
INSERT INTO tb_categoria (id, descricao) VALUES (2, 'Oficina');

-- ATIVIDADES
INSERT INTO tb_atividade (id, nome, descricao, preco, categoria_id) VALUES (1, 'Curso de HTML', 'Aprenda HTML de forma prática', 80.00, 1);
INSERT INTO tb_atividade (id, nome, descricao, preco, categoria_id) VALUES(2, 'Oficina de Github', 'Confronte versões de seus projetos', 60.00, 2);

-- BLOCOS
INSERT INTO tb_bloco (id, inicio, fim, atividade_id) VALUES (1, '2017-09-25T08:00:00', '2017-09-25T11:00:00', 1);
INSERT INTO tb_bloco (id, inicio, fim, atividade_id) VALUES(2, '2017-09-25T14:00:00', '2017-09-25T18:00:00', 2);
INSERT INTO tb_bloco (id, inicio, fim, atividade_id) VALUES(3, '2017-09-26T08:00:00', '2017-09-26T11:00:00', 2);

-- PARTICIPANTES
INSERT INTO tb_participante (id, nome, email, atividade_id) VALUES(1, 'José Silva', 'jose@gmail.com', 1);
INSERT INTO tb_participante (id, nome, email, atividade_id) VALUES(2, 'tiago Faria', 'tiago@gmail.com', 2);
INSERT INTO tb_participante (id, nome, email, atividade_id) VALUES(3, 'Maria do Rosário', 'maria@gmail.com', 1);
INSERT INTO tb_participante (id, nome, email, atividade_id) VALUES(4, 'Teresa Silva', 'teresa@gmail.com', 2);