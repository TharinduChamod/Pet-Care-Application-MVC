CREATE DATABASE paws_adn_care;

USE paws_and_care;

CREATE TABLE animal (
	animal_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    age INT,
    type VARCHAR(50),
    breed VARCHAR(100),
    adoption_status TINYINT(1)
);

CREATE TABLE volunteers (
	volunteer_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT,
    address VARCHAR(250),
    mobile_number VARCHAR(10),
    availability TINYINT(1)
);

ALTER TABLE volunteers
MODIFY name VARCHAR(100) COLLATE utf8mb4_general_ci;

CREATE TABLE donations (
    donation_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    donator VARCHAR(150) NOT NULL,
    donation_type VARCHAR(20),
    amount DOUBLE,
    donated_at VARCHAR(100)
);


CREATE TABLE adoptions (
    adoption_id INT AUTO_INCREMENT PRIMARY KEY,
    volunteer VARCHAR(150),
    volunteer_id INT,
    pet VARCHAR(100),
    pet_id INT,
    adopted_date VARCHAR(10)
);

