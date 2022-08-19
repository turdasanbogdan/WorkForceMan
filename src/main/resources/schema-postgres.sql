DROP TABLE IF EXISTS users;
CREATE TABLE users(id serial PRIMARY KEY, username VARCHAR(255), first_name VARCHAR(255), last_name VARCHAR(255), role VARCHAR(255));

DROP TABLE IF EXISTS skills;
CREATE TABLE skills(id serial PRIMARY KEY, name VARCHAR(255), category VARCHAR(255), rating INTEGER(255));

DROP TABLE IF EXISTS projects;
CREATE TABLE projects(id serial PRIMARY KEY, name VARCHAR(255), category VARCHAR(255));

