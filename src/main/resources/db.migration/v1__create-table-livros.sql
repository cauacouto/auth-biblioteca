--v1__create-table-livros.sql
create table  livros (
    id bigint primary key,
    titulo varchar(255) not null,
    autor varchar(255) not null
);
