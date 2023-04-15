#SQL Запросы для создании таблиц  в базе данных
CREATE DATABASE todolist;

Create Table user(
  id int not null auto_increment,
  login VARCHAR(45) null,
  last_name   VARCHAR(45) null,
  first_name VARCHAR(45) null,
  middle_name VARCHAR(45) null,
  birthday DATE null,
  primary key (id)
);
Create Table task(
                     id int not null auto_increment,
                     name VARCHAR(45) null,
                     decs  VARCHAR(45) null,
                     ready Tinyint null,
                     category VARCHAR(45) null,
                     user VARCHAR(45) null,
                     primary key (id),
                     constraint user
                 foreign key (id)
                 references user(id)
                 on delete no action
                 on update no action
);
CREATE Table category(
    id int not null auto_increment,
    name varchar(45) null,
    primary key (id)
);

ALTER TABLE task
Add constraint category
foreign key (id)
references category(id)
on delete no action
on update no action ;

ALTER TABLE user
    add column creation_date date null after birthday,
    add column update_date date null after creation_date;

ALTER TABLE task
    add column creation_date date null after user,
    add column update_date date null after creation_date;