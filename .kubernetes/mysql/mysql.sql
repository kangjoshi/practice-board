use mysql;

CREATE DATABASE board default CHARACTER SET UTF8;

CREATE TABLE board.board(
    id bigint auto_increment primary key,
    name       varchar(20)              null,
    contents   varchar(100)             null,
    created_at datetime(3)              null,
    created_by binary(16)              null,
    modified_at datetime(3)              null,
    modified_by binary(16)              null
) ENGINE=InnoDB;

CREATE USER 'board'@'%' IDENTIFIED BY 'board!@#';
GRANT ALL PRIVILEGES ON board.* TO 'board'@'%';