create table users(
    id TEXT not null primary key unique ,
    login TEXT not null unique,
    password TEXT not null,
    role TEXT not null

);