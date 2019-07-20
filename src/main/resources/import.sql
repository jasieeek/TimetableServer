--init classes
INSERT INTO SCHOOL_GROUP VALUES (1, '1I');
INSERT INTO SCHOOL_GROUP VALUES (2, '2I');
INSERT INTO SCHOOL_GROUP VALUES (3, '3I');

--init teachers
INSERT INTO TEACHER VALUES (1, 'Michał', 'Konieczny');
INSERT INTO TEACHER VALUES (2, 'Stanisław', 'Zaręba');
INSERT INTO TEACHER VALUES (3, 'Grzegorz', 'Rodak');
INSERT INTO TEACHER VALUES (4, 'Krzysztof', 'Turek');
INSERT INTO TEACHER VALUES (5, 'Michal', 'Pazdan');
INSERT INTO TEACHER VALUES (6, 'Stefan', 'Warty');
INSERT INTO TEACHER VALUES (7, 'Lucjan', 'Wielki');
INSERT INTO TEACHER VALUES (8, 'Sylwia', 'Cała');
INSERT INTO TEACHER VALUES (9, 'Agnieszka', 'Małysz');
INSERT INTO TEACHER VALUES (10, 'Wioletta', 'Radosna');
INSERT INTO TEACHER VALUES (11, 'Monika', 'Prokop');
INSERT INTO TEACHER VALUES (12, 'Tadeusz', 'Stępień');
INSERT INTO TEACHER VALUES (13, 'Barbara', 'Szybka');
INSERT INTO TEACHER VALUES (14, 'Paulina', 'Haja');
INSERT INTO TEACHER VALUES (15, 'Waldemar', 'Bugaj');

--init classrooms
INSERT INTO CLASSROOM VALUES (1, 'Hala WF');
INSERT INTO CLASSROOM VALUES (2, '3');
INSERT INTO CLASSROOM VALUES (3, '13');
INSERT INTO CLASSROOM VALUES (4, '16');
INSERT INTO CLASSROOM VALUES (5, '17');
INSERT INTO CLASSROOM VALUES (6, '21');
INSERT INTO CLASSROOM VALUES (7, '24');
INSERT INTO CLASSROOM VALUES (8, '26');
INSERT INTO CLASSROOM VALUES (9, '27');
INSERT INTO CLASSROOM VALUES (10, '28');
INSERT INTO CLASSROOM VALUES (11, '29');
INSERT INTO CLASSROOM VALUES (12, '31');
INSERT INTO CLASSROOM VALUES (13, '35');
INSERT INTO CLASSROOM VALUES (14, '36');
INSERT INTO CLASSROOM VALUES (15, '38');
INSERT INTO CLASSROOM VALUES (16, '39');
INSERT INTO CLASSROOM VALUES (17, '41');

--init lessons
-- INSERT INTO LESSON VALUES (id, class_name, classroom_name, day_of_week, name, sequence, teacher_name)
INSERT INTO LESSON VALUES (1, '1I', '28', '0', 'Historia', 1, 'Michał Konieczny');
INSERT INTO LESSON VALUES (2, '1I', '41', '0', 'UTK', 2, 'Stanisław Zaręba');
INSERT INTO LESSON VALUES (3, '1I', '13', '0', 'SO', 3, 'Stanisław Zaręba');
INSERT INTO LESSON VALUES (4, '1I', '41', '0', 'Matematyka', 4, 'Grzegorz Rodak');
INSERT INTO LESSON VALUES (5, '1I', '38', '0', 'J. polski', 5, 'Krzysztof Turek');
INSERT INTO LESSON VALUES (6, '1I', 'Hala WF', '0', 'WF', 6, 'Michal Pazdan');
INSERT INTO LESSON VALUES (7, '1I', '24', '0', 'J. niemiecki', 7, 'Stefan Warty');

INSERT INTO LESSON VALUES (8, '1I', '38', '1', 'Religia', 1, 'Lucjan Wielki');
INSERT INTO LESSON VALUES (9, '1I', '41', '1', 'BHP', 2, 'Stanisław Zaręba');
INSERT INTO LESSON VALUES (10, '1I', '38', '1', 'J. polski', 3, 'Krzysztof Turek');
INSERT INTO LESSON VALUES (11, '1I', '13', '1', 'SO', 4, 'Stanisław Zaręba');
INSERT INTO LESSON VALUES (12, '1I', '26', '1', 'Chemia', 5, 'Sylwia Cała');
INSERT INTO LESSON VALUES (13, '1I', '38', '1', 'J. angielski', 6, 'Agnieszka Małysz');
INSERT INTO LESSON VALUES (14, '1I', '41', '1', 'Matematyka', 7, 'Grzegorz Rodak');

INSERT INTO LESSON VALUES (15, '1I', '24', '2', 'J. niemiecki', 1, 'Stefan Warty');
INSERT INTO LESSON VALUES (16, '1I', '41', '2', 'Matematyka', 2, 'Grzegorz Rodak');
INSERT INTO LESSON VALUES (17, '1I', '29', '2', 'Geografia', 3, 'Wioletta Radosna');
INSERT INTO LESSON VALUES (18, '1I', '28', '2', 'Historia', 4, 'Michał Konieczny');
INSERT INTO LESSON VALUES (19, '1I', '35', '2', 'ASSO', 5, 'Stanisław Zaręba');
INSERT INTO LESSON VALUES (20, '1I', '13', '2', 'SO', 6, 'Stanisław Zaręba');
INSERT INTO LESSON VALUES (21, '1I', '27', '2', 'Fizyka', 7, 'Monika Prokop');
INSERT INTO LESSON VALUES (22, '1I', 'Hala WF', '2', 'WF', 8, 'Michal Pazdan');

INSERT INTO LESSON VALUES (23, '1I', '41', '3', 'GW', 2, 'Grzegorz Rodak');
INSERT INTO LESSON VALUES (24, '1I', '41', '3', 'UTK', 3, 'Stanisław Zaręba');
INSERT INTO LESSON VALUES (25, '1I', '38', '3', 'J. polski', 4, 'Krzysztof Turek');
INSERT INTO LESSON VALUES (26, '1I', '16', '3', 'PP', 5, 'Paulina Haja');
INSERT INTO LESSON VALUES (27, '1I', '36', '3', 'Inform.', 6, 'Waldemar Bugaj');
INSERT INTO LESSON VALUES (28, '1I', '17', '3', 'Kultura', 7, 'Krzysztof Turek');

INSERT INTO LESSON VALUES (29, '1I', '16', '4', 'PP', 1, 'Paulina Haja');
INSERT INTO LESSON VALUES (30, '1I', '31', '4', 'Biologia', 2, 'Barbara Szybka');
INSERT INTO LESSON VALUES (31, '1I', '13', '4', 'DINUTK', 3, 'Stanisław Zaręba');
INSERT INTO LESSON VALUES (32, '1I', '38', '4', 'J. angielski', 4, 'Agnieszka Małysz');
INSERT INTO LESSON VALUES (33, '1I', '26', '4', 'Religia', 5, 'Lucjan Wielki');
INSERT INTO LESSON VALUES (34, '1I', 'Hala WF', '4', 'WF', 6, 'Michal Pazdan');


INSERT INTO LESSON VALUES (35, '2I', '29', '0', 'Geografia', 1, 'Wioletta Radosna');
INSERT INTO LESSON VALUES (36, '2I', '26', '0', 'Religia', 2, 'Lucjan Wielki');
INSERT INTO LESSON VALUES (37, '2I', '41', '0', 'Matematyka', 3, 'Grzegorz Rodak');
INSERT INTO LESSON VALUES (38, '2I', 'Hala WF', '0', 'WF', 4, 'Michal Pazdan');
INSERT INTO LESSON VALUES (39, '2I', '41', '0', 'GW', 5, 'Grzegorz Rodak');
INSERT INTO LESSON VALUES (40, '2I', '24', '0', 'J. niemiecki', 6, 'Stefan Warty');

INSERT INTO LESSON VALUES (41, '2I', 'Hala WF', '1', 'WF', 1, 'Michal Pazdan');
INSERT INTO LESSON VALUES (42, '2I', '35', '1', 'ASSO', 2, 'Grzegorz Rodak');
INSERT INTO LESSON VALUES (43, '2I', '13', '1', 'DINUTK', 3, 'Stanisław Zaręba');
INSERT INTO LESSON VALUES (44, '2I', '38', '1', 'J. polski', 4, 'Krzysztof Turek');
INSERT INTO LESSON VALUES (45, '2I', '41', '1', 'BHP', 5, 'Stanisław Zaręba');
INSERT INTO LESSON VALUES (46, '2I', 'Hala WF', '1', 'WF', 6, 'Michal Pazdan');

INSERT INTO LESSON VALUES (47, '2I', '38', '2', 'J. polski', 3, 'Krzysztof Turek');
INSERT INTO LESSON VALUES (48, '2I', '38', '2', 'J. angielski', 4, 'Agnieszka Małysz');
INSERT INTO LESSON VALUES (49, '2I', 'Hala WF', '2', 'WF', 5, 'Michal Pazdan');
INSERT INTO LESSON VALUES (50, '2I', '26', '2', 'Religia', 6, 'Lucjan Wielki');
