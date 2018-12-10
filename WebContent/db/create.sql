--����--
create database exhibition DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
--��ɫ��--
create table e_role(
	roleId int not null primary key auto_increment,
	roleName varchar(30),
	description varchar(500)
);
-- �û��� --
create table e_user(
	userId int not null primary key auto_increment,
	uname varchar(20 ) ,
	loginName varchar(20 ) ,
	loginPass varchar(32 ) ,
	createTime datetime ,
	modifyTime datetime ,
	roleId int 
);
alter table e_user add column status int default 0;
-- ���û��������� --
alter table e_user add constraint fk_user_roleId foreign key(roleId) references e_role(roleId);
-- �û���־�� --
create table e_log(
	logId int not null primary key auto_increment,
	userId int,
	message varchar(100) ,
	logTime dateTime,
	status int default 0,
	idAddress varchar(20)
);
alter table e_log add constraint fk_log_userId foreign key(userId) references e_user(userId);
--���--
create table e_activity (
	id int not null primary key auto_increment,
	activity_name varchar(100) not null,
	start_time datetime,
	end_time datetime,
	activity_address varchar(200),
	leader_name varchar(60),
	leader_tel varchar(11)
	
);
--��������ʡ/�к�״̬����
ALTER TABLE e_activity ADD COLUMN province VARCHAR(10) AFTER id;
ALTER TABLE e_activity ADD COLUMN city VARCHAR(50) AFTER province;
--����в�����Ĭ��ֵ--
alter table e_activity add status int default 1;

--Ʒ���û���--
create table e_brand_user(
	id int not null primary key unique auto_increment,
	loginName varchar(100) not null unique,
	loginPass varchar(200),
	activity_id int,
	brand_name varchar(200),
	brand_code varchar(100),
	brand_leader varchar(10),
	brande_leaderTel varchar(12)
);
--�𵰱�--
create table e_ege(
 id int not null primary key auto_increment,
 egeName varchar(20) not null 
);
--�����--
create table e_red_package(
id int not null primary key auto_increment,
money int not null
	
);
--��Ʒ��-- 
create table e_prize(
	id int not null primary key auto_increment,
	prize_name varchar(50) not null
);
--���𵰱�/�����/��Ʒ������л��ţ�activityId��
alter table e_ege add column activityId int after egeName;
alter table e_red_package add column activityId int after money;
alter table e_prize add column activityId int after prize_name;
--���𵰱�/�����/��Ʒ����ӻid���Լ��--
alter table e_ege add constraint fk_egg_act_id foreign key (activityId) references e_activity(id);
alter table e_red_package add constraint fk_red_act_id foreign key (activityId) references e_activity(id);
alter table e_prize add constraint fk_prize_act_id foreign key (activityId) references e_activity(id);
--��Ʒ���û������ʡ/����--
alter table e_brand_user add column province varchar(10) after loginPass;
alter table e_brand_user add column city varchar(50) after province;
--��ӻ��ŵ����--
ALTER TABLE e_brand_user ADD CONSTRAINT fk_brand_user_id FOREIGN KEY (activity_id) REFERENCES e_activity (id);
