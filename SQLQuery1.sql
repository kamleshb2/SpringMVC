create table Login (
	Username varchar(100) primary key,
	Password varchar(100) not null,
	Role varchar(10) not null, 
	constraint check_role
		check(Role in ('user','admin'))
);

select * from login

create table tvdatabase (
	TV_ID int primary key IDENTITY(201900,1),
	TV_Name varchar(50) not null,
	Brand varchar(30),
	Description varchar(1000), 
	Price INT not null,
);

select * from tvdatabase
drop table


create table User_Info (
	UserID int primary key IDENTITY(1000,1),
	First_Name varchar(50) not null,
	Last_Name varchar(50) not null,
	Address varchar(300) not null, 
	Mobile_No bigint not null,
	Username varchar(100) not null,
	Password varchar(100) not null,
	FOREIGN KEY (Username) REFERENCES dbo.login(Username) ON delete CASCADE,
);

select * from user_info

create table Purchase (
	PurchaseID int primary key IDENTITY(1,1),
	TV_ID  int not null,
	TV_Name varchar(50) not null,
	Data_Of_Purchase date not null, 
	Price bigint not null,
	UserID INT not null,
	Password varchar(100) not null,
	FOREIGN KEY (TV_ID) REFERENCES dbo.tvdatabase(TV_ID),
	FOREIGN KEY (UserID) REFERENCES dbo.User_Info(UserID),

);

select * from Purchase