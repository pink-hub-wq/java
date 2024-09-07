use master
go
if DB_ID ('Seiryo') is not null
drop database Seiryo
go
create database Seiryo
go
use Seiryo
go
if OBJECT_ID ('Company') is not null
drop table Company
go
create table Company(
	id int primary key identity(1,1),
	name varchar(50),
	price int
)
insert Company (name,price)values('ƻ��',431000000)
insert Company (name,price)values('΢��',277200000)
insert Company (name,price)values('�ȸ�',239900000)
insert Company (name,price)values('��Ѷ',150000000)
insert Company (name,price)values('�ٶ�',100000000)
select id,name,price from Company

drop procedure proc_Company
go
create procedure proc_Company(
	@name nvarchar(50),
	@price int output
)
AS
select @price = price from Company where @name = name
---------------------------------------------------------------------------------------------------------------------------------------------------------------
use SanGuoSha
go
select * from Wujiang 
create procedure proc_WujiangCount(
	@area nvarchar(50),
	@num int output
)
AS
select @num = count(*) from Wujiang where @area = area
create procedure proc_AddWujiang(
	@name nvarchar(50),
	@hp int,
	@skill nvarchar(50),
	@emotion int,
	@area nvarchar(50),
	@id int output
)
AS
insert into Wujiang (Name,Hp,Skill,Emotion,area) values(@name,@hp,@skill,@emotion,@area)
SET @id = SCOPE_IDENTITY()
drop procedure proc_AddWujiang
drop table Wujiang
CREATE TABLE Wujiang (
    ID INT PRIMARY KEY identity,
    Name VARCHAR(20),
	Hp Int,
	Skill varchar(20),
	Emotion varchar(20),
	area varchar(20)
)
insert Wujiang (Name,Hp,Skill,Emotion,area)values('����',4,'�ʵ�',98,'���')
insert Wujiang (Name,Hp,Skill,Emotion,area)values('����',4,'����',85,'���')
insert Wujiang (Name,Hp,Skill,area)values('�ܲ�',4,'����','κ��')
insert Wujiang (Name,Hp,Skill,area)values('�ĺ',4,'����','κ��')
insert Wujiang (Name,Hp,Skill,area)values('��Ȩ',4,'�ƺ�','���')
insert Wujiang (Name,Hp,Skill,area)values('���',4,'����','���')