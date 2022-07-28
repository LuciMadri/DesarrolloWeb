
CREATE DATABASE goldentoad;
USE goldentoad;

CREATE TABLE contact(
	id_news INT PRIMARY KEY NOT NULL,
    name VARCHAR(20) NOT NULL,
    email VARCHAR(40) NOT NULL,
    phone INT NOT NULL,
    context INT NOT NULL);
 
 CREATE TABLE about(
	id_about INT PRIMARY KEY NOT NULL,
    firstname_a VARCHAR(20) NOT NULL,
    lastname_a VARCHAR(20) NOT NULL,
    descrip VARCHAR(200) NOT NULL);

 CREATE TABLE news(
	id_news INT PRIMARY KEY NOT NULL,
    title VARCHAR(40) NOT NULL,
    subtitle VARCHAR(100) NOT NULL,
    link VARCHAR(100) NOT NULL);

 CREATE TABLE projects(
	id_projects INT PRIMARY KEY NOT NULL,
    title VARCHAR(40) NOT NULL,
    descrip VARCHAR(200) NOT NULL,
    specs VARCHAR(200) NOT NULL,
    link VARCHAR(100) NOT NULL);
    
 CREATE TABLE person(
	id_person INT PRIMARY KEY NOT NULL,
    firstname VARCHAR(40) NOT NULL,
    lastname VARCHAR(40) NOT NULL,
    birth DATE NOT NULL,
    email VARCHAR(40) NOT NULL,
    username VARCHAR(40) NOT NULL,
    password VARCHAR(40) NOT NULL,
    roles VARCHAR(40) NOT NULL,
    active VARCHAR(40) NOT NULL,
    permissions VARCHAR(40) NOT NULL);
    
 CREATE TABLE helpform(
	id_helpform INT PRIMARY KEY NOT NULL,
    title VARCHAR(40) NOT NULL,
    descrip VARCHAR(200) NOT NULL,
    specs VARCHAR(200) NOT NULL,
    id_person INT NOT NULL,
    foreign key(id_person) references person(id_person));
    
    
    