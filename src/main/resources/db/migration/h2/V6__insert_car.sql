insert into company(id, name) values (1, 'Pepsi');
insert into company(id, name) values (2, 'Coca Cola');
insert into company(id, name) values (3, 'Sprite');


insert into car(id, registration_number, company_id) values (1, 'XYZ10ABC', 1);
insert into car(id, registration_number, company_id) values (2, 'XYZ11ABC', 1);
insert into car(id, registration_number, company_id) values (3, 'XYZ12ABC', 1);
insert into car(id, registration_number, company_id) values (4, 'XYZ13ABC', 2);


insert into address(id, house_number, street, zip_code) VALUES (1, 1, 'Street X', '12-341');
insert into address(id, house_number, street, zip_code) VALUES (2, 2, 'Street Y', '12-342');
insert into address(id, house_number, street, zip_code) VALUES (3, 3, 'Street Z', '12-343');
insert into address(id, house_number, street, zip_code) VALUES (4, 4, 'Street XX', '12-344');
insert into address(id, house_number, street, zip_code) VALUES (5, 5, 'Street YY', '12-345');
insert into address(id, house_number, street, zip_code) VALUES (6, 6, 'Street ZZ', '12-346');
insert into address(id, house_number, street, zip_code) VALUES (7, 7, 'Street XXX', '12-347');

insert into department(id, name, company_id) VALUES (1, 'Sales & Marketing', 1);
insert into department(id, name, company_id) VALUES (2, 'Research & Development', 1);
insert into department(id, name, company_id) VALUES (3, 'Administration', 1);
insert into department(id, name, company_id) VALUES (4, 'Human Resources', 2);
insert into department(id, name, company_id) VALUES (5, 'Sales & Marketing', 3);

insert into employee(id, name, surname, address_id, department_id) VALUES (1, 'John', 'William', 1, 1);
insert into employee(id, name, surname, address_id, department_id) VALUES (2, 'Robert', 'James', 2, 2);
insert into employee(id, name, surname, address_id, department_id) VALUES (3, 'Donald', 'Tyler', 3, 3);
