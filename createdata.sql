-- insert dummy users
insert into user (firstName, lastName, username, password, phoneNumber)
    values ("johnny", "sins", "jsins", "asdf1234", "6475022032");

insert into user (firstName, lastName, username, password, phoneNumber)
    values ("bill", "cosby", "billcosby", "asdf1234", "6475032032");

insert into user (firstName, lastName, username, password, phoneNumber)
    values ("jared", "fogle", "subwayman", "asdf1234", "6475042032");
	

-- insert authors
insert into author (firstName, lastName)
	values ("E. L.", "James");
	

-- insert books
insert into book (title, isbn, category)
	values ("Fifty Shades of Grey", "9781612130286", "Romance");

insert into book (title, isbn, category)
	values ("Fifty Shades Darker", "9780345803498", "Romance");

insert into book (title, isbn, category)
	values ("Fifty Shades Freed", "0345803507", "Romance");


-- insert book/author join table data
insert into author_book (bookID, authorID)
	values (1, 1);
	
insert into author_book (bookID, authorID)
	values (2, 1);
	
insert into author_book (bookID, authorID)
	values (3, 1);


-- insert dummy payment methods
insert into payment_method (firstName, lastName, cardNumber, cardType, expDate, billingAddress, userID)
	values ("johnny", "sins", "4916137201985962", "VISA", "02/27", "973 Cherry Tree Drive
Hastings, FL 32145", 1);


-- insert dummy orders
insert into orders (userID, paymentID, purchaseDate, orderTotal)
	values (1, 1, CURDATE(), 420.69);
	
	
-- insert dummy items into orders
insert into order_items (orderID, bookID)
	values (1, 1);
	
insert into order_items (orderID, bookID)
	values (1, 2);
	
insert into order_items (orderID, bookID)
	values (1, 3);
	
