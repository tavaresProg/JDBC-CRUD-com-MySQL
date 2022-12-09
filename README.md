# (JDBC) CRUD em MySQL

Programa feito para fazer as operações CRUD em um banco de dados MySQL.

Para demonstração das operações foi criado um banco de dados chamado "agenda" com uma tabela chamada "contatos" com as seguintes colunas:
"id","nome", "idade" e "dataCadastro".

Para testar esse programa você deve criar este banco com os seguintes comandos:

create database agenda;

> create table contatos(
> id int not null auto_increment primary key,
> nome varchar(40),
> idade int,
> dataCadastrp date)

Com o banco de dados criados, na classe main
