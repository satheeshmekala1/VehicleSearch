
insert into vehicle_price (id, msrp, savings, finalprice) values(1, 25000.00, 5000.00,20000.00);
insert into vehicle_price (id, msrp, savings, finalprice) values(2, 30000.00, 2000.00,28000.00);
insert into vehicle_price (id, msrp, savings, finalprice) values(3, 40925.00, 4678.00,36247.00);
insert into vehicle_price (id, msrp, savings, finalprice) values(4, 33645.70, 4988.20,28657.50);
insert into vehicle_price (id, msrp, savings, finalprice) values(5, 35515.00, 5000.00,30515.50);

insert into vehicle(vehicle_id,make, model, modelyear,bodystyle, engine,drivetype,color,mpg,vehicle_price_id)
    values(101, 'Ford', 'ecoSport','2020','4D Sport Utility','1.0L EcoBoost','FWD','shadow black', '27',1);
insert into vehicle(vehicle_id,make, model, modelyear,bodystyle, engine,drivetype,color,mpg, vehicle_price_id)
    values(102, 'Ford', 'Edge', '2019', '4D Sport Utility','Twin-Scroll 2.0L EcoBoost', 'AWD','Agate Black','28',2);
insert into vehicle(vehicle_id,make, model, modelyear,bodystyle, engine,drivetype,color,mpg,vehicle_price_id)
    values(103, 'Ford', 'F-150', '2020', '4D SuperCrew', 'V6 PFDI','4WD','Blue Jeans Metallic','23',3);
insert into vehicle(vehicle_id,make, model, modelyear,bodystyle, engine,drivetype,color,mpg,vehicle_price_id)
    values(104, 'Ford', 'mustang', '2017', '4D Sport Utility', 'V8','RWD','Blue Metallic','32',4);
insert into vehicle(vehicle_id,make, model, modelyear,bodystyle, engine,drivetype,color,mpg,vehicle_price_id)
    values(105, 'Ford', 'Ranger','2016','Super Cab','2.3L EcoBoost','4WD','Oxford White','24',5);


insert into vehicle_exterior (vehicle_id, feature_name) values(101,'Acoustic-Laminate Windshld');
insert into vehicle_exterior (vehicle_id, feature_name) values(101,'Active Grille Shutters');
insert into vehicle_exterior (vehicle_id, feature_name) values(101,'Windshield Wiper De-Icer');
insert into vehicle_exterior (vehicle_id, feature_name) values(101,'Privacy Glass - Rear Doors');

insert into vehicle_interior (vehicle_id, feature_name) values (101,'Illuminated Entry System');
insert into vehicle_interior (vehicle_id, feature_name) values (101,'Powerpoints - 12V');
insert into vehicle_interior (vehicle_id, feature_name) values (101,'Power Driver Seat - 6-Way');
insert into vehicle_interior (vehicle_id, feature_name) values (101,'Unique Clth/HtdFrt Seats');

insert into vehicle_exterior (vehicle_id, feature_name) values(102,'Beltline Molding - Black');
insert into vehicle_exterior (vehicle_id, feature_name) values(102,'Door Handles - Body Color');
insert into vehicle_exterior (vehicle_id, feature_name) values(102,'Grille - Chrome');
insert into vehicle_exterior (vehicle_id, feature_name) values(102,'Taillamps-Led');

insert into vehicle_interior (vehicle_id, feature_name) values (102,'60/40 Split Fold Rear Seat');
insert into vehicle_interior (vehicle_id, feature_name) values (102,'Cruise Control');
insert into vehicle_interior (vehicle_id, feature_name) values (102,'Dual Illum Vis Vanity Mirr');
insert into vehicle_interior (vehicle_id, feature_name) values (102,'Rotary Gear Shift Dial');

insert into vehicle_exterior (vehicle_id, feature_name) values(103,'Headlamps - Autolamp');
insert into vehicle_exterior (vehicle_id, feature_name) values(103,'Locking Removable Tailgate');
insert into vehicle_exterior (vehicle_id, feature_name) values(103,'Manual Fold Power Mirrors');
insert into vehicle_exterior (vehicle_id, feature_name) values(103,'Headlamps - Auto High Beam');

insert into vehicle_interior (vehicle_id, feature_name) values (103,'1Touch Up/Down Dr/Pass Win');
insert into vehicle_interior (vehicle_id, feature_name) values (103,'60/40 Fold-Up Rear Bench Seat');
insert into vehicle_interior (vehicle_id, feature_name) values (103,'Cruise Control');
insert into vehicle_interior (vehicle_id, feature_name) values (103,'Illuminated Entry');

insert into vehicle_exterior (vehicle_id, feature_name) values(104,'Dual Exhaust System');
insert into vehicle_exterior (vehicle_id, feature_name) values(104,'Easy Fuel Capless Filler');
insert into vehicle_exterior (vehicle_id, feature_name) values(104,'Headlamps - Autolamp');
insert into vehicle_exterior (vehicle_id, feature_name) values(104,'Headlamps- Led With Signature Lighting');

insert into vehicle_interior (vehicle_id, feature_name) values (104,'Autodim Rearview Mirror');
insert into vehicle_interior (vehicle_id, feature_name) values (104,'Center Console W/Armrest');
insert into vehicle_interior (vehicle_id, feature_name) values (104,'Floor Mats - Front');
insert into vehicle_interior (vehicle_id, feature_name) values (104,'Smart Charging UsbPort(2)');

insert into vehicle_exterior (vehicle_id, feature_name) values(105,'Daytime Running Lights');
insert into vehicle_exterior (vehicle_id, feature_name) values(105,'Easy Fuel Capless Filler');
insert into vehicle_exterior (vehicle_id, feature_name) values(105,'Fuel Tank - 18.0 Gallon');
insert into vehicle_exterior (vehicle_id, feature_name) values(105,'Tow Hooks');

insert into vehicle_interior (vehicle_id, feature_name) values (105,'110V Outlet');
insert into vehicle_interior (vehicle_id, feature_name) values (105,'Dual Sliding Sunvisors');
insert into vehicle_interior (vehicle_id, feature_name) values (105,'Dual Zone Auto Climate Ctl');
insert into vehicle_interior (vehicle_id, feature_name) values (105,'Overhead Console');


