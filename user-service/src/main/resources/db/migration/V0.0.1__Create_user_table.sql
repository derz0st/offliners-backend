CREATE TABLE usr (
    id bigserial primary key,
    first_name varchar(50) NOT NULL,
    last_name varchar(50) NOT NULL,
    birthday_date date,
    bio varchar(300),
    facebook varchar(50)
);