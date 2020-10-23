
drop table if exists interior CASCADE;
drop table if exists vehicle CASCADE;
drop table if exists vehicle_exterior CASCADE;
drop sequence if exists hibernate_sequence;
create sequence hibernate_sequence start with 106 increment by 1;
create table interior (id integer not null, feature_name varchar(255), primary key (id));
create table vehicle (vehicle_id integer not null, mpg varchar(255), bodystyle varchar(255), color varchar(255), drivetype varchar(255), engine varchar(255), make varchar(255), model varchar(255), modelyear varchar(255),vehicle_price_id integer, primary key (vehicle_id));
create table vehicle_exterior (vehicle_id integer not null, feature_name varchar(255));
create table vehicle_interior (vehicle_id integer not null, feature_name varchar(255));
create table vehicle_price (id integer not null, msrp double not null, savings double not null, finalprice double not null, primary key (id));

alter table vehicle add constraint FKrj4y68nfcle2n90d0u3jkf02f foreign key (vehicle_price_id) references vehicle_price;
alter table vehicle_exterior add constraint FK17dtuubqwxw7jh4vyph1cp48o foreign key (vehicle_id) references vehicle;
alter table vehicle_interior add constraint FKo5cslp00ydq8b4jklgcbnkc2r foreign key (vehicle_id) references vehicle;
