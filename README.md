# (JDBC) CRUD em MySQL

Programa feito com intuito de consolidar meus conhecimentos com o JDBC realizando as operações CRUD em um banco de dados MySQL.

Para demonstração das operações foi criado um banco de dados no MySQL chamado "agenda" com uma tabela chamada "contatos" com as seguintes colunas:
"id","nome", "idade" e "dataCadastro".

>create database agenda;
> create table contatos(
> id int not null auto_increment primary key,
> nome varchar(40),
> idade int,
> dataCadastrp date)

Com o banco de dados criados, na classe *ConnectionFactory.java*:

Você deve inserir o seu username do MySQL (vem como root) dentro das aspas dessa linha:

> private static final String USERNAME = "SEU USERNAME AQUI";

E a senha do seu banco (vem como root) nessa linha dentro das aspas:
>	private static final String PASSWORD = "SUA SENHA AQUI";

Por fim só configurar o caminho do seu banco, porta e nome nessa linha dentro das aspas:
> private static final String DATABASE_URL = "jdbc:mysql://localhost/agenda?useTimezone=true&serverTimezone=UTC";

Fique livre para testar e modificar este projeto!
