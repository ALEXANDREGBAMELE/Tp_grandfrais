CREATE TABLE departement (  id SERIAL PRIMARY KEY,
code VARCHAR(50) NOT NULL,
designation VARCHAR(50) NOT NULL);

CREATE TABLE personne (  id SERIAL PRIMARY KEY,
nom VARCHAR(50) NOT NULL,
prenom VARCHAR(50) NOT NULL,
age INT NOT NULL,
id_departement INT REFERENCES departement(id)
);