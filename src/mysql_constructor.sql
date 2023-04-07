CREATE DATABASE tetris;

use tetris;

CREATE TABLE user(
	id INTEGER PRIMARY KEY,
    ´name´ VARCHAR(25) NOT NULL,
    username VARCHAR(8) NOT NULL UNIQUE,
	email varchar(30) NOT NULL,
    ´password´ varchar(50) NOT NULL,
    experience INTEGER
);

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








