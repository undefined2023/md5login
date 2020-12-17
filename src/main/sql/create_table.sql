


create table file(
	id int not null auto_increment,
	name varchar(255) not null,
	size int not null,
	upload_date date not null,
	uploader_username varchar(255) not null,
	approver_id_username varchar(255),
	approved boolean default false,
	primary key (id)
)

commit

insert into file(name, size, upload_date, uploader_username)
values('file001', 1000111, '2020-12-17', 'heguangbin')

select * from file

rename table file to fileinfo