CREATE TABLE users (
	user_id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(30) NOT NULL,
	psword VARCHAR(30) NOT NULL,
    role VARCHAR(30) NOT NULL
);

select * FROM users;

insert into users value (001,"admin","admin@123","admin");