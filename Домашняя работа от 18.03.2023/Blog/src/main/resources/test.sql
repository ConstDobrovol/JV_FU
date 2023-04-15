#SQL Запросы для создании таблиц  в базе данных
CREATE DATABASE todolist;

Create Table Client(
                     client_id int not null auto_increment,
                     login VARCHAR(45) null,
                     last_name   VARCHAR(45) null,
                     first_name VARCHAR(45) null,
                     middle_name VARCHAR(45) null,
                     birthday DATE null,
                     creation_date date null,
                     update_date date null,
                     primary key (client_id)
);
Create Table blog(
                     post_id int not null auto_increment,
                     name VARCHAR(45) null,
                     decs  VARCHAR(45) null,
                     publication_date date null,
                     category VARCHAR(45) null,
                     user VARCHAR(45) null,
                     creation_date date null,
                     update_date date null,
                     primary key (post_id),
                     index user_idx (user ASC )VISIBLE
                     constraint user
                         foreign key (id)
                             references Client(id)
                             on delete no action
                             on update no action
);
CREATE Table category(
                         id int not null auto_increment,
                         name varchar(45) null,
                         creation_date date null,
                         update_date date null,
                         primary key (id)
);