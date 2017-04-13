insert into company(id, name) values (1, 'Company X');
insert into company(id, name) values (2, 'Company Y');
insert into company(id, name) values (3, 'Company Z');


insert into car(id, registration_number, company_id) values (1, 'XXXXXX10', 1);
insert into car(id, registration_number, company_id) values (2, 'XXXXXX11', 1);
insert into car(id, registration_number, company_id) values (3, 'XXXXXX12', 1);
insert into car(id, registration_number, company_id) values (4, 'XXXXXX13', 2);


insert into address(id, house_number, street, zip_code) VALUES (1, 1, 'Street X', '11-111');
insert into address(id, house_number, street, zip_code) VALUES (2, 2, 'Street Y', '11-111');
insert into address(id, house_number, street, zip_code) VALUES (3, 3, 'Street Z', '11-111');
insert into address(id, house_number, street, zip_code) VALUES (4, 4, 'Street XX', '11-111');
insert into address(id, house_number, street, zip_code) VALUES (5, 5, 'Street YY', '11-111');
insert into address(id, house_number, street, zip_code) VALUES (6, 6, 'Street ZZ', '11-111');
insert into address(id, house_number, street, zip_code) VALUES (7, 7, 'Street XXX', '11-111');

insert into department(id, name, company_id) VALUES (1, 'Department X', 1);
insert into department(id, name, company_id) VALUES (2, 'Department Y', 1);
insert into department(id, name, company_id) VALUES (3, 'Department Z', 1);
insert into department(id, name, company_id) VALUES (4, 'Department X', 2);
insert into department(id, name, company_id) VALUES (5, 'Department X', 3);

insert into employee(id, name, surname, address_id, department_id) VALUES (1, 'Name X', 'Surname X', 1, 1);
insert into employee(id, name, surname, address_id, department_id) VALUES (2, 'Name Y', 'Surname Y', 2, 2);
insert into employee(id, name, surname, address_id, department_id) VALUES (3, 'Name Z', 'Surname Z', 3, 3);
