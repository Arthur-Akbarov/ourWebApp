DROP SCHEMA shop CASCADE;

CREATE SCHEMA shop;

CREATE TABLE shop.client (
    id int NOT NULL,
    firstName varchar(100) NOT NULL,
    lastName varchar(100) NOT NULL,
    login varchar(100) NOT NULL,
    password varchar(100) NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO shop.client (id, lastName, firstName, login, password) VALUES (0, 'Словягин', 'Алекей', 'a', 'a');
INSERT INTO shop.client (id, lastName, firstName, login, password) VALUES (1, 'Лагойко', 'Руслан', 'b', 'b');
INSERT INTO shop.client (id, lastName, firstName, login, password) VALUES (2, 'Акбаров', 'Артур', 'c', 'c');

CREATE TABLE shop.good (
    id int NOT NULL,
    title varchar(100) NOT NULL,
    price int NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO shop.good (id, title, price) VALUES (0, 'фильм1', '100');
INSERT INTO shop.good (id, title, price) VALUES (1, 'фильм2', '120');
