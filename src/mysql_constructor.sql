DROP DATABASE IF EXISTS tetris;
CREATE DATABASE tetris;

use tetris;

CREATE TABLE user(
	id INTEGER PRIMARY KEY,
    alias VARCHAR(25) NOT NULL,
    username VARCHAR(8) NOT NULL UNIQUE,
	email varchar(30) NOT NULL,
    pass varchar(100) NOT NULL,
    experience INTEGER
)ENGINE='InnoDB' default charset = latin1;

INSERT INTO user VALUES (0, "Jared", "root", "jared0192galici@gmail.com", 
	aes_encrypt("1234", "root"), -9999);
    SELECT user.alias , convert(aes_decrypt(pass, "root") 
    using UTF8) as passs from user;
    SELECT user.pass from user;

CREATE TABLE game(
    idPlayer INTEGER NOT NULL,
    ´time´ TIME NOT NULL,
    points INTEGER NOT NULL
);

CREATE TABLE config (
    idPlayer INTEGER NOT NULL,
	sizeShape INT NOT NULL,
    velDrop FLOAT NOT NULL,
    volAudioGame FLOAT NOT NULL,
    volAudioMain FLOAT NOT NULL
);


CREATE TABLE styleShape (
    idConfig INTEGER NOT NULL,
	colorFill VARCHAR(3) NOT NULL,
	colorBorder VARCHAR(3) NOT NULL
);





