CREATE TABLE category(

	id IDENTITY,
	name VARCHAR(50),
	description VARCHAR(250),
	image_url VARCHAR(50),
	is_active BOOLEAN,
	
	CONSTRAINT pk_category_id PRIMARY KEY(id)

);

INSERT INTO category (name, description, image_url, is_active) VALUES ('Novels','This is for Novels category', 'CAT_3.png', true);
