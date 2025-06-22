--liquibase formatted sql

--changeset narcis:002
create table notes
(
    id                      serial    not null,
    user_id                 bigint    not null,
    title                   varchar(25),
    encrypted_content       text,
    auto_destroy_after_read boolean   not null default false,
    expires_at              timestamp not null default '2030-06-21 15:30:00',
    updated_at              timestamp not null default current_timestamp,
    created_at              timestamp not null default current_timestamp,
    foreign key (user_id) references users (id) on delete cascade,
    primary key (id)
)