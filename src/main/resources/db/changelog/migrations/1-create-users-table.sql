--liquibase formatted sql

--changeset narcis:001
create table users
(
    id            serial       not null,
    email         varchar(50)  not null unique,
    password_hash varchar(255) not null,
    updated_at    timestamp    not null default current_timestamp,
    created_at    timestamp    not null default current_timestamp,
    primary key (id)
);