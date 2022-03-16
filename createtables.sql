drop database bookstore;
create database bookstore;
use bookstore;

create table author (
    authorID int not null auto_increment,
    firstName varchar(255) not null,
    lastName varchar(255) not null,
    primary key (authorID)
);

create table book (
    bookID int not null auto_increment,
    title varchar(255) not null,
    isbn varchar(15) not null,
    category varchar(255) not null,
    primary key (bookID)
);

create table author_book (
    bookID int,
    authorID int,
    foreign key (bookID) references book(bookID),
    foreign key (authorID) references author(authorID),
    primary key (bookID, authorID)
);

create table user (
    userID int not null auto_increment,
    firstName varchar(255) not null,
    lastName varchar(255) not null,
    username varchar(50) unique not null,
    password varchar(255) not null,
    phoneNumber varchar(12) unique not null,
    primary key (userID)
);

create table payment_method (
    paymentID int not null auto_increment,
    firstName varchar(255) not null,
    lastName varchar(255) not null,
    cardNumber varchar(16) not null,
    cardType varchar(20) not null,
    expDate varchar(5) not null,
    billingAddress varchar(500) not null,
    userID int,
    foreign key (userID) references user (userID),
    primary key (paymentID)
);

create table inventory (
    bookID int,
    stock int not null,
    price double not null,
    foreign key (bookID) references book (bookID)
);

create table orders (
    orderID int not null auto_increment,
    userID int,
    paymentID int,
    purchaseDate date not null,
    orderTotal float not null,
    foreign key (userID) references user (userID),
    foreign key (paymentID) references payment_method (paymentID),
    primary key (orderID)
);

create table order_items (
    orderID int,
    bookID int, 
    foreign key (orderID) references orders (orderID),
    foreign key (bookID) references book (bookID)
);