create table office (id bigint generated by default as identity, name varchar(255), address_id bigint, department_id bigint, primary key (id));

alter table office add constraint FKga73hdtpb67twlr9c35357tyt foreign key (address_id) references address;