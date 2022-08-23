drop database goldentoad;
CREATE DATABASE goldentoad;
USE goldentoad;

CREATE TABLE contact(
	id_contact INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    email VARCHAR(40) NOT NULL,
    phone INT NOT NULL,
    context varchar(40) NOT NULL);
 
 CREATE TABLE about(
	id_about INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    firstname_a VARCHAR(20) NOT NULL,
    lastname_a VARCHAR(20) NOT NULL,
    descrip VARCHAR(200) NOT NULL);

 CREATE TABLE news(
	id_news INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    title VARCHAR(40) NOT NULL,
    subtitle VARCHAR(100) NOT NULL,
    link VARCHAR(200) NOT NULL);

 CREATE TABLE projects(
	id_projects INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    title VARCHAR(40) NOT NULL,
    descrip VARCHAR(200) NOT NULL,
    specs VARCHAR(200) NOT NULL,
    link VARCHAR(200) NOT NULL);
    
 CREATE TABLE person(
	id_person INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    firstname VARCHAR(40) NOT NULL,
    lastname VARCHAR(40) NOT NULL,
    birth DATE NOT NULL,
    email VARCHAR(40) NOT NULL,
    username VARCHAR(40) NOT NULL,
    password VARCHAR(100) NOT NULL,
    roles VARCHAR(40) default 'user',
    active int default '1',
    permissions VARCHAR(40) default 'view page');
    
 CREATE TABLE helpform(
	id_helpform INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    firstname VARCHAR(20) NOT NULL,
    lastname VARCHAR(20) NOT NULL,
    email VARCHAR(50) NOT NULL,
    phone INT NOT NULL,
    descrip VARCHAR(100) NOT NULL);
    
 CREATE TABLE inventory(
	id_inventory INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    price DOUBLE NOT NULL,
    size VARCHAR(20) NOT NULL,
    stock INT NOT NULL);
    
 CREATE TABLE merch(
	id_merch INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    title VARCHAR(40) NOT NULL,
    descrip VARCHAR(40) NOT NULL,
    link VARCHAR(200) NOT NULL,
    id_inventory INT NOT NULL,
    foreign key(id_inventory) references inventory(id_inventory));

INSERT INTO inventory (price,size,stock)
VALUES(5.000, 'S, M, L, X, XL' , 40),
	(6.000, 'S, M, L, X, XL' , 10),
	(15.000, 'S, M, L, X, XL' , 70);
    
INSERT INTO merch (title,descrip,link,id_inventory)
VALUES('White Hat', 'White golden toad hat.', 'images/hatW.png', 1),
	('Black hat', 'Black golden toad hat.','images/hatB.png',  2),
    ('White hoodie', 'White golden toad hoodie.','images/hoodieW.png',  2),
    ('Black T-shirt', 'Black golden toad t-shirt','images/t-shirtB.png',  2);
    
INSERT INTO contact (name,email,phone,context)
VALUES('Isaac Chaves','isaacChaves@gmail.com', 89842490,'Owner'),
	('Olivia Rodriguez','orodriguez@hotmail.com', 78674986,'Helper'),
	('Pedro Sanchez','Pedrito4567@gmail.com', 87364745,'Designer');
    
INSERT INTO about (firstname_a,lastname_a,descrip)
VALUES('Isaac','Chaves', 'Creator'),
	('Olivia','Rodriguez', 'Helper'),
    ('Pedro','Sanchez', 'Designer');
    
INSERT INTO projects (title,descrip,specs, link)
VALUES('Golden Toad','Horror game', 'Windows, Adventure, puzzel, unreal engine', 'https://as01.epimg.net/meristation/imagenes/2021/08/11/videos/1628654867_088540_1628654909_noticia_normal.jpg'),
	('Dead Clowns','Horror game', 'Windows, Adventure, puzzel, unreal engine', 'https://as01.epimg.net/meristation/imagenes/2021/08/11/videos/1628654867_088540_1628654909_noticia_normal.jpg');
    
    
    INSERT INTO news (TITLE,subtitle,link)
VALUES('Resident Evil','Nuevo proyecto en desarrollo','https://as01.epimg.net/meristation/imagenes/2021/08/11/videos/1628654867_088540_1628654909_noticia_normal.jpg'),
	('Silent Hill','Remake Silent Hill 1','https://as01.epimg.net/meristation/imagenes/2021/08/11/videos/1628654867_088540_1628654909_noticia_normal.jpg'),
	('Elden Ring 2','Pre produccion','https://as01.epimg.net/meristation/imagenes/2021/08/11/videos/1628654867_088540_1628654909_noticia_normal.jpg'); 
    
    INSERT INTO person (firstname,lastname,birth,email,username,password,roles,active,permissions)
VALUES('Luciana','Madrigal','2003-09-12','madrigal.luciana@gmail.com','lmadri','$2a$12$eE6li6LnuX/WOZa1tuStBOdqIvzjCbQyf/lwP8JIX.YTlE/0V9cga','ADMIN', 1, 'ADMIN'),
	('David','Cardenas','2003-07-07','david.cardenas@gmail.com','dcardenas','$2a$12$eE6li6LnuX/WOZa1tuStBOdqIvzjCbQyf/lwP8JIX.YTlE/0V9cga','USER', 1, 'USER'),
	('Sebastian','Carballo','2000-11-09','sebs.carballo@gmail.com','sbsCarba','$2a$12$eE6li6LnuX/WOZa1tuStBOdqIvzjCbQyf/lwP8JIX.YTlE/0V9cga','ADMIN', 1, 'ADMIN'),
	('Oscar','sanchez','1990-02-01','sanchez.oscar@gmail.com','hades','$2a$12$eE6li6LnuX/WOZa1tuStBOdqIvzjCbQyf/lwP8JIX.YTlE/0V9cga','USER', 1, 'USER');
