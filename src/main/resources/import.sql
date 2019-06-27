--init classes
INSERT INTO SCHOOL_GROUP VALUES (1, '1A');
INSERT INTO SCHOOL_GROUP VALUES (2, '1B');
INSERT INTO SCHOOL_GROUP VALUES (3, '1C');
INSERT INTO SCHOOL_GROUP VALUES (4, '2A');
INSERT INTO SCHOOL_GROUP VALUES (5, '2B');
INSERT INTO SCHOOL_GROUP VALUES (6, '2C');
INSERT INTO SCHOOL_GROUP VALUES (7, '3A');
INSERT INTO SCHOOL_GROUP VALUES (8, '3B');
INSERT INTO SCHOOL_GROUP VALUES (9, '3C');

--init teachers
INSERT INTO TEACHER VALUES (1, 'Kamil', 'Jasiak');
INSERT INTO TEACHER VALUES (2, 'Arkadiusz', 'Sobol');
INSERT INTO TEACHER VALUES (3, 'Radoslaw', 'Nowak');
INSERT INTO TEACHER VALUES (4, 'Jan', 'Kowalski');
INSERT INTO TEACHER VALUES (5, 'Michal', 'Nowak');

--init classrooms
INSERT INTO CLASSROOM VALUES (1, '101');
INSERT INTO CLASSROOM VALUES (2, '102');
INSERT INTO CLASSROOM VALUES (3, '201');
INSERT INTO CLASSROOM VALUES (4, '202');

--init lessons
-- INSERT INTO LESSON VALUES (1, 'Physics', 'Kamil Jasiak', '101', '1A', 'MONDAY', 4);
-- insert into lesson (id, class_name, classroom_name, day_of_week, name, sequence, teacher_name)
-- values (2, '1A', '102', 'MONDAY', 'Mathematics', 5, 'Arkadiusz Sobol');
--

