
-- create table fileinfo(
-- 	id int not null auto_increment,
-- 	name varchar(255) not null,
-- 	size int not null,
-- 	upload_date DATETIME DEFAULT CURRENT_TIMESTAMP,
-- 	uploader_username varchar(255) not null,
-- 	approver_username varchar(255),
-- 	approved boolean default false,
-- 	primary key (id)
-- )

-- alter table fileinfo
-- change approver_id_username approver_username varchar(255) default null

-- 以下datetime的定义需要5.6.5以上mysql才支持
-- 所以date改成timestamp算了
create table fileinfo(
	id int not null auto_increment,
	name varchar(255) not null,
	size int not null,
	upload_date timestamp DEFAULT CURRENT_TIMESTAMP,
	file_location varchar(255),
	uploader_username varchar(255) not null,
	approver_username varchar(255),
	approved boolean default false,
	primary key (id)
)

insert into file(name, size, upload_date, uploader_username)
values('file001', 1000111, '2020-12-17', 'heguangbin')

commit





