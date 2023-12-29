CREATE DATABASE mercado_db;

USE mercado_db;

CREATE TABLE permissoes (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  pode_vender BOOLEAN NOT NULL DEFAULT FALSE,
  pode_manipular_produto BOOLEAN NOT NULL DEFAULT FALSE,
  pode_manipular_cliente BOOLEAN NOT NULL DEFAULT FALSE,
  pode_manipular_funcionario BOOLEAN NOT NULL DEFAULT FALSE,
  pode_cadastrar_perfil BOOLEAN NOT NULL DEFAULT FALSE,
  pode_cadastrar_cargo BOOLEAN NOT NULL DEFAULT FALSE,
  pode_cadastrar_entrada BOOLEAN NOT NULL DEFAULT FALSE,
  pode_cadastrar_saida BOOLEAN NOT NULL DEFAULT FALSE,
  pode_manipular_caixa BOOLEAN NOT NULL DEFAULT FALSE,
  acesso_panel_clientes BOOLEAN NOT NULL DEFAULT FALSE,
  acesso_panel_financeiro BOOLEAN NOT NULL DEFAULT FALSE,
  acesso_panel_vendas BOOLEAN NOT NULL DEFAULT FALSE,
  acesso_panel_estoque BOOLEAN NOT NULL DEFAULT FALSE,
  acesso_panel_funcionarios BOOLEAN NOT NULL DEFAULT FALSE,
  PRIMARY KEY (id)
);

CREATE TABLE perfil (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  nome_perfil VARCHAR(100)  UNIQUE NOT NULL,
  permissoes_id INT UNSIGNED UNIQUE NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_perfil_permissoes FOREIGN KEY (permissoes_id) REFERENCES permissoes (id)
);

CREATE TABLE cargo (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  nome_cargo VARCHAR(100) NOT NULL UNIQUE,
  PRIMARY KEY (id)
);

CREATE TABLE funcionario (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  nome VARCHAR(200) NOT NULL,
  salario_fixo DOUBLE NOT NULL,
  comissao INT NOT NULL DEFAULT 0,
  cargo_id INT UNSIGNED NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_funcionario_cargo FOREIGN KEY (cargo_id) REFERENCES cargo (id)
);

CREATE TABLE usuario (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  username VARCHAR(200) NOT NULL,
  senha TEXT NOT NULL,
  ativo BOOLEAN NOT NULL DEFAULT TRUE,
  perfil_id INT UNSIGNED NOT NULL,
  funcionario_id INT UNSIGNED NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_usuario_perfil FOREIGN KEY (perfil_id) REFERENCES perfil (id),
   CONSTRAINT fk_usuario_funcionario FOREIGN KEY (funcionario_id) REFERENCES funcionario (id)
);

CREATE TABLE fornecedor (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  nome_fornecedor VARCHAR(100) NOT NULL UNIQUE,
  telefone VARCHAR(14) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE produto (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  nome VARCHAR(45) NOT NULL,
  valor_venda DOUBLE NOT NULL,
  valor_compra DOUBLE NOT NULL,
  quantidade INT NOT NULL DEFAULT 0,
  fornecedor_id INT UNSIGNED NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_produto_fornecedor FOREIGN KEY (fornecedor_id) REFERENCES fornecedor (id)
);

CREATE TABLE cliente (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  nome VARCHAR(100) NOT NULL,
  telefone VARCHAR(14) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE saida (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  valor DOUBLE NOT NULL,
  data_vencimento DATE NOT NULL,
  descricao VARCHAR(100) NOT NULL,
  paga BOOLEAN NOT NULL DEFAULT FALSE,
  PRIMARY KEY (id)
);

CREATE TABLE entrada (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  valor DOUBLE NOT NULL,
  data_vencimento DATE NOT NULL,
  descricao VARCHAR(100) NOT NULL,
  recebida BOOLEAN NOT NULL DEFAULT FALSE,
  PRIMARY KEY (id)
);

CREATE TABLE venda (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  data_venda DATETIME NOT NULL,
  descricao TEXT NOT NULL,
  valor DOUBLE NOT NULL,
  funcionario_id INT UNSIGNED NOT NULL,
  cliente_id INT UNSIGNED NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_venda_funcionario FOREIGN KEY (funcionario_id) REFERENCES funcionario (id),
  CONSTRAINT fk_venda_cliente FOREIGN KEY (cliente_id) REFERENCES cliente (id)
);

CREATE TABLE item_produto (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  venda_id INT UNSIGNED NOT NULL,
  produto_id INT UNSIGNED NOT NULL,
  quantidade INT NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_venda_has_produto_venda FOREIGN KEY (venda_id) REFERENCES venda (id),
  CONSTRAINT fk_venda_has_produto_produto FOREIGN KEY (produto_id)  REFERENCES produto (id)
);

CREATE TABLE caixa (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  saldo_anterior DOUBLE NOT NULL,
  entradas DOUBLE NOT NULL DEFAULT 0,
  saidas DOUBLE NOT NULL DEFAULT 0,
  aberto BOOLEAN NOT NULL DEFAULT TRUE,
  PRIMARY KEY (id)
);

INSERT INTO cargo (nome_cargo) VALUES ("Vendedor"), ("Estoquista"), ("Gerente"), ("Analista Financeiro"), ("Administrador");
INSERT INTO permissoes (pode_vender, acesso_panel_clientes, acesso_panel_vendas, acesso_panel_estoque) VALUES (true, true, true, true);

INSERT INTO permissoes (pode_manipular_produto, acesso_panel_financeiro, acesso_panel_vendas, acesso_panel_estoque) VALUES (true, true, true, true);

INSERT INTO permissoes (pode_manipular_cliente, pode_manipular_funcionario, pode_cadastrar_perfil, pode_cadastrar_cargo, 
acesso_panel_clientes, acesso_panel_financeiro, acesso_panel_vendas, acesso_panel_estoque, acesso_panel_funcionarios) 
VALUES (true, true, true, true, true, true, true, true, true);

INSERT INTO permissoes (pode_cadastrar_entrada, pode_cadastrar_saida, pode_manipular_caixa, acesso_panel_financeiro, acesso_panel_vendas, 
acesso_panel_estoque) VALUES (true, true, true, true, true, true);

INSERT INTO permissoes (pode_vender, pode_manipular_produto, pode_manipular_cliente, pode_manipular_funcionario, pode_cadastrar_perfil, pode_cadastrar_cargo, 
pode_cadastrar_entrada, pode_cadastrar_saida,pode_manipular_caixa, acesso_panel_clientes, acesso_panel_financeiro, 
acesso_panel_vendas, acesso_panel_estoque,acesso_panel_funcionarios) VALUES (true, true, true, true, true, true, true, true, true, true, true, true, true, true);

INSERT INTO perfil (nome_perfil, permissoes_id) VALUES ("VENDEDOR", 1), ("ESTOQUE", 2), ("GERENTE", 3), ("FINANCEIRO", 4), ("ADMINISTRADOR", 5);

INSERT INTO funcionario (nome, salario_fixo, comissao, cargo_id) VALUES ("Cecília Andrade de Almeida", 2500, 10, 1), ("Fábio Manoel da Mota", 2500, 0, 2),
("Edson Felipe Santos", 2500, 0, 3), ("Luciana dos Santos Alves", 2500, 0, 4), ("Marcos Sousa", 2500, 0, 5);

INSERT INTO usuario (username, senha, funcionario_id, perfil_id) VALUES ("cecilia.andrade", md5("senha"), 1, 1), 
("fabio.mota", md5("senha"), 2, 2), ("edson.santos", md5("senha"), 3, 3), ("luciana.alves", md5("senha"), 4, 4), ("marcos.sousa", md5("admin"), 5, 5);

INSERT INTO fornecedor (nome_fornecedor, telefone) VALUES ("Fornecedor I", "(11) 1111-1111"), ("Fornecedor II", "(11) 1111-1111"), ("Fornecedor III", "(11) 1111-1111");

INSERT INTO caixa (saldo_anterior, entradas, saidas, aberto) VALUES (10000,200,100, false);

INSERT INTO cliente (nome, telefone) VALUES ("PADRÃO", "(11) 1111-1111"), ("Maria da Silva", "(11) 1111-1111"), ("José da Silva", "(11) 1111-1111"), ("Milena Rodrigues", "(11) 1111-1111");

INSERT INTO produto (nome, valor_venda, valor_compra, quantidade, fornecedor_id) VALUES ("Caderno", 25, 20, 100, 1), ("Garrafa Térmica", 50, 45, 100, 2), ("Agenda", 25, 20, 100, 1), ("Liquidificador", 250, 200, 100, 1);

CREATE VIEW saldo_atual AS SELECT (saldo_anterior + entradas - saidas) FROM caixa WHERE id = (SELECT MAX(id) FROM caixa);
