insert into Users (login,name,password) values('miwe112rtchal','pr3647ychal','asdas');
insert into Users (login,name,password) values('miw123ertchal','pr345ychal','asdas');
insert into Users (login,name,password) values('mi4d23fgchal','pry4563chal','asdas');
insert into Users (login,name,password) values('mis12fdhchal','prgchnfychal','asdas');
insert into Users (login,name,password) values('mi344chal','prytherhchal','asdas');
insert into Users (login,name,password) values('m2r53ichal','prrdthychal','asdas');
insert into Users (login,name,password) values('mig3245chal','pr456ychal','asdas');
insert into Users (login,name,password) values('mi34chal','pr3456ychal','asdas');

insert into Projects (created, description, activity,name) values (now(), 'asdfdghdfasd',1,'adsf3452asdfasdfwe');
insert into Projects (created, description, activity,name) values (now(), 'adfghsddfasd',1,'adsfasdf34asdfwe');
insert into Projects (created, description, activity,name) values (now(), 'adfghsddfasd',0,'adsfas345dfasdfwe');
insert into Projects (created, description, activity,name) values (now(), 'adfghsddfasd',0,'adsf354asdfasdfwe');
insert into Projects (created, description, activity,name) values (now(), 'adfghsddfasd',1,'a345dsfasdfasdfwe');
insert into Projects (created, description, activity,name) values (now(), 'adfghsddfasd',0,'adsfasdfas5dfwe');
insert into Projects (created, description, activity,name) values (now(), 'afdghsddfasd',1,'adsfasdf34asdfwe');
insert into Projects (created, description, activity,name) values (now(), 'asdfghddfasd',0,'adsfas345dfasdfwe');
insert into Projects (created, description, activity,name) values (now(), 'adfghsddfasd',1,'adsfa354sdfasdfwe');
insert into Projects (created, description, activity,name) values (now(), 'adfghsddfasd',0,'adsf2asdfasdfwe');
insert into Projects (created, description, activity,name) values (now(), 'asdfghddfasd',1,'ad2453sfasdfasdfwe');
insert into Projects (created, description, activity,name) values (now(), 'asfghddfasd',1,'adsfasdfasdfwe');
insert into Projects (created, description, activity,name) values (now(), 'asdfghddfasd',1,'adsfasdf235asdfwe');
insert into Projects (created, description, activity,name) values (now(), 'adfghsddfasd',1,'adsfas34dfasdfwe');
insert into Projects (created, description, activity,name) values (now(), 'asdfghddfasd',1,'adsfasdf345asdfwe');

insert into TaskStatus (name,activity) value("2gowno",1);
insert into TaskStatus (name,activity) value("g32owno",1);
insert into TaskStatus (name,activity) value("g3454owno",0);
insert into TaskStatus (name,activity) value("g546owno",0);
insert into TaskStatus (name,activity) value("g7fgowno",1);


insert into TaskPriority (name,activity) value("1statuskurwa",1);
insert into TaskPriority (name,activity) value("2statuskurwa",1);
insert into TaskPriority (name,activity) value("3statuskurwa",0);
insert into TaskPriority (name,activity) value("4tatuskurwa",0);
insert into TaskPriority (name,activity) value("5statuskurwa",1);

insert into Tasks (subject,TaskStatus_id,projects_id,taskPriority_id,user_id) value ('1kupon',1,1,1,1);
insert into Tasks (subject,TaskStatus_id,projects_id,taskPriority_id,user_id) value ('2kupon',2,2,2,2);
insert into Tasks (subject,TaskStatus_id,projects_id,taskPriority_id,user_id) value ('3kupon',3,3,3,3);
insert into Tasks (subject,TaskStatus_id,projects_id,taskPriority_id,user_id) value ('4kupon',4,4,4,1);
insert into Tasks (subject,TaskStatus_id,projects_id,taskPriority_id,user_id) value ('5kupon',1,2,1,2);
insert into Tasks (subject,TaskStatus_id,projects_id,taskPriority_id,user_id) value ('6kupon',1,6,1,4);

insert into Activity values(null,now(),'1description','1header',1,1,1)
insert into Activity values(null,now(),'2description','2header',1,1,1)
insert into Activity values(null,now(),'3description','3header',1,3,3)
insert into Activity values(null,now(),'4description','4header',1,1,4)
insert into Activity values(null,now(),'5description','5header',1,1,5)
insert into Activity values(null,now(),'6description','6header',1,1,1)
insert into Activity values(null,now(),'7description','7header',1,1,1)
insert into Activity values(null,now(),'8description','8header',1,1,3)

insert into Users_Projects value (1,1);
insert into Users_Projects value (1,2);
insert into Users_Projects value (1,3);
insert into Users_Projects value (1,4);
insert into Users_Projects value (2,2);
insert into Users_Projects value (2,1);
insert into Users_Projects value (3,1);
insert into Users_Projects value (4,3);
insert into Users_Projects value (5,4);
insert into Users_Projects value (2,5);

