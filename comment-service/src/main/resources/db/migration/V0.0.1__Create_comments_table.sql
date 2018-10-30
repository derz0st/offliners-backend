CREATE TABLE comments (
    id bigserial primary key,
    text varchar(4000),
    author_id bigserial,
    created_date date
);