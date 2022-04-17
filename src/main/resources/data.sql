insert into movie (id , title) values ( 1, 'Spider man' );
insert into movie (id , title) values ( 2, 'Avengers' );
insert into movie (id , title) values ( 3, 'Doctor Strange' );
insert into Hall(id,name,seat_limit) values ( 1,'sala 1',120 );
insert into Hall(id,name,seat_limit) values ( 2,'sala 2',180 );
insert into Hall(id,name,seat_limit) values ( 3,'sala 3',240 );
insert into Screening(id,screening_start,movie,hall_id) values ( 1,PARSEDATETIME('10:20', 'HH:mm'),1,1 );
insert into Screening(id,screening_start,movie,hall_id) values ( 2,PARSEDATETIME('11:20', 'HH:mm'),2,2 );
insert into Screening(id,screening_start,movie,hall_id) values ( 3,PARSEDATETIME('12:20', 'HH:mm'),3,3 );
