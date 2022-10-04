/**
 * Author:  Gelvazio Camargo
 * Created: 14 de set. de 2022
 */

-- criando tabelas do banco de dados...

create table public.tbpessoa( 
    pescodigo serial not null,
    pesnome varchar(200) not null,
    pesendereco varchar(200) not null,
    pescpf varchar(20) not null,
    CONSTRAINT pk_tbpessoa 
    PRIMARY KEY (pescodigo)
);

create table public.tbproduto(
    procodigo serial not null,
    prodescricao varchar(200) not null,
    propreco numeric(10,2) not null,
    CONSTRAINT pk_tbpessoa
    PRIMARY KEY (pescodigo)
);


--insert produto 
INSERT INTO public.tbproduto
(procodigo, prodescricao, propreco)
VALUES(1, 'arroz', 20.00);

INSERT INTO public.tbproduto
(procodigo, prodescricao, propreco)
VALUES(2, 'feijao', 20.00);

INSERT INTO public.tbproduto
(procodigo, prodescricao, propreco)
VALUES(3, 'acucar', 20.00);

INSERT INTO public.tbproduto
(procodigo, prodescricao, propreco)
VALUES(4, 'sal', 20.00);

INSERT INTO public.tbproduto
(procodigo, prodescricao, propreco)
VALUES(5, 'leite', 20.00);

INSERT INTO public.tbproduto
(procodigo, prodescricao, propreco)
VALUES(6, 'bolacha', 20.00);